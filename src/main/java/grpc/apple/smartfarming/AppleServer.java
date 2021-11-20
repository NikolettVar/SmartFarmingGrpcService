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
		
				
		//now we build out our appleServer within Exception handling try/catch block
		/*try {
				Server server = ServerBuilder.forPort(port)
					.addService(appleServer)
					.build()
					.start();
				server.awaitTermination();
		}catch(Exception e) {
				e.printStackTrace();
		}*/

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
			double price = 2.29;
			
			
			for(int i = 0; i <= 4; i++) {
				WeeklyApplePrice.Builder response = WeeklyApplePrice.newBuilder();
				
				response.setWeeklyApplePrice(price).build();			
				
				responseObserver.onNext(response.build());
				
				try {
					//wait for a second
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				
			}
			
			responseObserver.onCompleted();
		}
	}
	
	
	
	
}
