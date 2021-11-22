package grpc.egg.smartfarming;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import grpc.egg.smartfarming.EggProductionServiceGrpc.EggProductionServiceImplBase;


public class EggServer extends EggProductionServiceImplBase {
	public static void main(String[] args) {
		
	//first we must define the port
		int port = 50051;
	
	//next, we need to create an instance of this server class
	//we will pass it to the serverBuiler object
		EggServer eggServer = new EggServer();
		
	//now we build out our eggServer within Exception handling try/catch block
		try {
			System.out.println("Egg Server starting up...");
			Server server = ServerBuilder.forPort(port)
				.addService(eggServer)
				.build()
				.start();
			System.out.println("Egg Server is running on port number " + port);
		server.awaitTermination();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	//now we define our unary rpc method feedingCalculator()
	@Override
	public void feedingCalculator(CalculateRequest request, StreamObserver<CalculateResponse> responseObserver) {
		System.out.println("EggServer is being called, calculating response...");
		
		//we now read the request, create a response and send back that response
		int userInput = request.getNumberOfHens();
		double value = Double.NaN;
		
		//calculate the feeding needs of the hens for 7 days
		//result is rounded upwards to ensure farm always have sufficient food supply 
		value = Math.ceil((userInput *0.009)*7);
		
		CalculateResponse response = CalculateResponse.newBuilder()
				//.setWeeklyFoodAmount(request.getNumberOfHens()).build();
				.setWeeklyFoodAmount(value)
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	//client streaming rpc implementation comes here
}
