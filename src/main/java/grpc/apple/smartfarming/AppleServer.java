package grpc.apple.smartfarming;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;

import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceImplBase;
import grpc.egg.smartfarming.EggServer;
import grpc.egg.smartfarming.WeeklyEggCount;

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
			System.out.println("Apple Server is being called, returning responses...");
			
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
		
		//bidirectional rpc server side implementation
		//we need to observe the stream of messages coming in from the client
		//this will be the return type of the weeklyAppleSales() method
		
		@Override
		public StreamObserver<WeeklyAppleSale> weeklyAppleSales(StreamObserver<WeeklyAppleSaleValue> responseObserver) {
			
			System.out.println("AppleServer is being called again, calculating responses...");
			
			return new StreamObserver<WeeklyAppleSale>() {
				
				//kgs of apple sold weekly in the last 4 weeks are saved in an ArrayList data structure
				ArrayList<Integer> appleList = new ArrayList<Integer>();
				
				//now we must implement 3 abstract methods of the StreamObserver class: onNext(), onError() and onCompleted()
				
				//first, we implement onNext()
				//onNext() method specifies the required actions when the server receives all incoming messages from the client

				@Override
				public void onNext(WeeklyAppleSale requests) {
					System.out.println("Receiving weekly apple sale volumes over 4 weeks: " + requests.getWeeklyAppleSaleVolume());
					
					
					//incoming values weekly apple sales in kg are added into the ArrayList
					appleList.add(requests.getWeeklyAppleSaleVolume());
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("An error occured, unable to complete operation.");
					t.printStackTrace();
					
				}

				//here we create the response when client finished to stream incoming messages
				@Override
				public void onCompleted() {
					
					double price1 = 2.29;
					double price2 = 2.19;
					double price3 = 2.03;
					double price4 = 2.08;
					
					//carrying out calculations
					//kg of apples sold a week * weekly sales price = weekly sales value
					double salesValue1 = Math.round (appleList.get(0) * price1);
					double salesValue2 = Math.round (appleList.get(1) * price2);
					double salesValue3 = Math.round (appleList.get(2) * price3);
					double salesValue4 = Math.round (appleList.get(3) * price4);
					
							
				
					//now we can build the responses the server will send back to the client
								
					
					WeeklyAppleSaleValue.Builder reply = WeeklyAppleSaleValue.newBuilder();
					
					//4 responses are built, showing the sales values of apple over 4 weeks
					reply.setWeeklyAppleSaleValue(salesValue1).build();	
					responseObserver.onNext(reply.build());
						
					reply.setWeeklyAppleSaleValue(salesValue2).build();	
					responseObserver.onNext(reply.build());
						
					reply.setWeeklyAppleSaleValue(salesValue3).build();	
					responseObserver.onNext(reply.build());
						
					reply.setWeeklyAppleSaleValue(salesValue4).build();	
					responseObserver.onNext(reply.build());
					
					System.out.println("The weekly sales values are € : " + salesValue1 + " for week 1, " + salesValue2 + " for week 2, " + salesValue3 + " for week 3, " + salesValue4 + " for week 4. ");						

										
					responseObserver.onCompleted();
					
				}
			
			
			};
			
		}
	}
	
	
	
	
}
