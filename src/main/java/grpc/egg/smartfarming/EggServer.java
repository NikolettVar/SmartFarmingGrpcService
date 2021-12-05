package grpc.egg.smartfarming;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import grpc.egg.smartfarming.EggProductionServiceGrpc.EggProductionServiceImplBase;


public class EggServer{
	
	private Server server;
	
	public static void main(String[] args) {
		
		//next, we need to create an instance of this server class
		//we will pass it to the serverBuiler object
		EggServer eggServer = new EggServer();
		
		//here we create an instance of the corresponding service registration class
		JmDNSEggRegistration eggRegistration = new JmDNSEggRegistration();
		
		//now we can call the run() method defined in the registration class and provide the require arguments
		eggRegistration.run("_eggs._tcp.local.", "EggService", 50051, "Running egg service...");
		eggServer.start();
		
	/*first we must define the port
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
		}*/

	}
	
	//now we define our start() method to build our eggServer
		private void start() {	
			System.out.println("Egg Server starting up...");
			int port = 50051;
			try {
				server = ServerBuilder.forPort(port)
					.addService(new EggServerImpl()).build().start();	
				
			} catch (IOException e) {			
				e.printStackTrace();
			}
			System.out.println("Egg Server is running on port number " + port);
			
			//we must ensure server keeps running until client needs it
			try {
				server.awaitTermination();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				
		}
		
		
	//a static inner class contains our server streaming rpc method implementation
	static class EggServerImpl extends EggProductionServiceImplBase{
	
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
			
			//after calculation the response value, we can build the response object
			//and send the response back to the client
			CalculateResponse response = CalculateResponse.newBuilder()
					
					.setWeeklyFoodAmount(value)
					.build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		
		//client streaming rpc weeklyTotalEggCount() server side implementation
		//we need to observe the stream of messages coming in from the client
		//this will be the return type of the weeklyTotalEggCount() method
		@Override
		public StreamObserver<DailyEggCount> weeklyTotalEggCount(StreamObserver<WeeklyEggCount> responseObserver){
			
			System.out.println("EggServer is being called again, calculating response...");
			
				return new StreamObserver<DailyEggCount>() {
					
				//number of eggs collected daily are saved in an ArrayList data structure
				ArrayList<Integer> eggList = new ArrayList<Integer>();
					
				//now we must implement 3 abstract methods of the StreamObserver class: onNext(), onError() and onCompleted()
				
				//first, we implement onNext()
				//onNext() method specifies the required actions when the server receives all incoming messages from the client
				
				@Override
				public void onNext(DailyEggCount request){
	
					System.out.println("Receiving daily egg count over 7 days: " + request.getDailyEggCount());
					
					//incoming daily egg counts are added into the ArrayList
					eggList.add(request.getDailyEggCount());		           
	
				}
	
			
				@Override
				public void onError(Throwable t) {
					System.out.println("An error occured, unable to complete operation.");
					t.printStackTrace();
					
				}
	
				//here we create the response when client finished to stream incoming messages
				@Override
				public void onCompleted() {
					
					
					//here we calculate the sum of the numbers stored in the ArrayList using a for/each loop
					int sum = 0;					
					for(int eggs: eggList) 						
						sum = sum + eggs;						
				
					//now we can build the response the server will send back to the client
					WeeklyEggCount reply = WeeklyEggCount.newBuilder()
							.setWeeklyEggCount(sum)
							.build();

					responseObserver.onNext(reply);
					
					System.out.println("The weekly total egg count is: " + sum);							

					responseObserver.onCompleted();
					
					
				}
			};	
	
		}
	}
}
