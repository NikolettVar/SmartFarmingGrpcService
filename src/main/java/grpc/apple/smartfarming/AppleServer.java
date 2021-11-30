package grpc.apple.smartfarming;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceImplBase;
import grpc.egg.smartfarming.EggServer;

public class AppleServer {
	
	private Server server;
	
	public static void main(String[] args) {		
		
		//next, we need to create an instance of this server class
		//we will pass it to the serverBuiler object
		AppleServer appleServer = new AppleServer();
		appleServer.start();
			
	}
	
	//now we define our start() method to build our appleServer
	private void start() {	
		System.out.println("Apple Server starting up...");
		int port = 50052;
		try {
			server = ServerBuilder.forPort(port)
				.addService(new AppleServerImpl()).build().start();	
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("Apple Server is running on port number " + port);
		
		//we must ensure server keeps running until client needs it
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	//a static inner class contains our server streaming rpc method implementation
	static class AppleServerImpl extends AppleProductionServiceImplBase{
		@Override
		public void applePriceChecker(ApplePrice request, StreamObserver<WeeklyApplePrice> responseObserver) {
			System.out.println("appleServer is being called, returning responses...");
			
			//now we can read in the request coming from the client
			String priceRequest = request.getAppleSalesPrice();
			System.out.println("The request from the client is: " + priceRequest);
			
			//we can now build the responses the server will send back as a stream
			double price1 = 2.29;
			double price2 = 2.19;
			double price3 = 2.03;
			double price4 = 2.08;
			
			
			WeeklyApplePrice.Builder response = WeeklyApplePrice.newBuilder();
			
			//we will have 4 responses, showing the sales price per kg of apple over 4 weeks
			response.setApplePricesPerWeek(price1).build();	
			responseObserver.onNext(response.build());
				
			response.setApplePricesPerWeek(price2).build();	
			responseObserver.onNext(response.build());
				
			response.setApplePricesPerWeek(price3).build();	
			responseObserver.onNext(response.build());
				
			response.setApplePricesPerWeek(price4).build();	
			responseObserver.onNext(response.build());
				
			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}				
				
			
			
			responseObserver.onCompleted();
		}
		
		//bidirectional rpc implementation comes here
		
	}
	
	
	
	
}
