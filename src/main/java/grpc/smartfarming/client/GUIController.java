package grpc.smartfarming.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

import grpc.apple.smartfarming.AppleProductionServiceGrpc;
import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceBlockingStub;
import grpc.egg.smartfarming.CalculateRequest;
import grpc.egg.smartfarming.CalculateResponse;
import grpc.egg.smartfarming.EggProductionServiceGrpc;
import grpc.egg.smartfarming.EggProductionServiceGrpc.EggProductionServiceBlockingStub;

//this class has the client and the GUI code
public class GUIController {

	public static void main(String[] args) throws Exception{
		
	//first we must define our host and port
	String host = "localhost";
	int port1 = 50051;
	int port2 = 50052;
	
	//Here we create an instance of the ManagedChannel class, client communicates through this channel with the servers
	//We need 1 channel per service, each one using the port numbers we defined for them in the Server classes
	ManagedChannel channelEggs = ManagedChannelBuilder
		.forAddress(host, port1)
		.usePlaintext()
		.build();
	
	ManagedChannel channelApples = ManagedChannelBuilder
		.forAddress(host, port2)
		.usePlaintext()
		.build();
		
	//next, we need an instance of our stubs that has the methods we want to call
	//we need 1 stub per service
	EggProductionServiceBlockingStub eggStub = EggProductionServiceGrpc.newBlockingStub(channelEggs);
	AppleProductionServiceBlockingStub appleStub = AppleProductionServiceGrpc.newBlockingStub(channelApples);
	
	//Unary rpc feedingCalculator implementation
	//Now, inside a try/catch block we build out our request and reply objects
	try {
		CalculateRequest eggRequest1 = CalculateRequest.newBuilder().setNumberOfHens(100).build();
		CalculateResponse eggResponse1 = eggStub.feedingCalculator(eggRequest1);
		
		//here we can print out the response to the console if needed
		System.out.println("The hens need " + eggResponse1.getWeeklyFoodAmount() + " kgs of food this week. ");
		
		//now we display response in GUI textfield for CA
		
		
	}catch(StatusRuntimeException e) {
		e.printStackTrace();
	}finally {
		//shutdown channel
		channelEggs.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	
	//server streaming method implementation
	
	
	}

}
