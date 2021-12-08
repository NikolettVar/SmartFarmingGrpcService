package grpc.smartfarming.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

import grpc.apple.smartfarming.ApplePrice;
import grpc.apple.smartfarming.AppleProductionServiceGrpc;
import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceBlockingStub;
import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceStub;
import grpc.apple.smartfarming.JmDNSAppleDiscovery;
import grpc.apple.smartfarming.WeeklyApplePrice;
import grpc.apple.smartfarming.WeeklyAppleSale;
import grpc.apple.smartfarming.WeeklyAppleSaleValue;
import grpc.egg.smartfarming.CalculateRequest;
import grpc.egg.smartfarming.CalculateResponse;
import grpc.egg.smartfarming.DailyEggCount;
import grpc.egg.smartfarming.EggProductionServiceGrpc;
import grpc.egg.smartfarming.EggProductionServiceGrpc.EggProductionServiceBlockingStub;
import grpc.egg.smartfarming.EggProductionServiceGrpc.EggProductionServiceStub;

import grpc.egg.smartfarming.JmDNSEggDiscovery;
import grpc.egg.smartfarming.WeeklyEggCount;


//this class has the client and the simple GUI code
public class GUIController {

	public static void main(String[] args) throws InterruptedException{
	
	//first, we create a serviceInfo object to discover Egg Service through jmDNS
	ServiceInfo eggServiceInfo;
	String service_type1 = "_egggrpc._tcp.local.";
	//Now retrieving egg service info - all we are supplying is the service type
	eggServiceInfo = JmDNSEggDiscovery.run(service_type1);
	
	//serviceInfo object is used to retrieve the port number
	//port number will be passed to the ChannelBuilder to create the channelEggs
	int port1 = eggServiceInfo.getPort();
	String host1 = "localhost";
	
	
	//second, we create another serviceInfo object to discover Apple Service through jmDNS
	ServiceInfo appleServiceInfo;
	String service_type2 = "_apple._tcp.local.";
	//Now retrieving apple service info - all we are supplying is the service type
	appleServiceInfo = JmDNSAppleDiscovery.run(service_type2);
	
	//serviceInfo object is used to retrieve the port number
	//port number is passed to the ChannelBuilder to create channelApples
	int port2 = appleServiceInfo.getPort();
	String host2 = "localhost";	
	
	//Next, we create an instance of the ManagedChannel class, client communicates with the servers through these network connection channels 
	//We need 1 channel per service, each one using the port numbers we defined for them in the Server classes
	ManagedChannel channelEggs = ManagedChannelBuilder
		.forAddress(host1, port1)
		.usePlaintext()
		.build();
	
	ManagedChannel channelApples = ManagedChannelBuilder
		.forAddress(host2, port2)
		.usePlaintext()
		.build();
		
	//next, we need an instance of the stub that has the methods we want to call
	//the stub is the representation of the server on the client side
	//we need 1 stub per service
	EggProductionServiceBlockingStub eggStub = EggProductionServiceGrpc.newBlockingStub(channelEggs);
	
	
	//Unary rpc feedingCalculator implementation on the client side	
	//First we ask the user for an integer input, the number of hens the farm has this week
	//User input is validated against empty input and non-numeric input
	
	 String hens = " ";	
	 int henNumber = 0;	
	 
	 hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
	 	//empty input is not accepted
	 	if(hens.length() < 1) {
			   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a numeric value");
			   hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
		} 
		 else {
			 //A simple regular expression is used to accept numeric input only
			 Pattern p = Pattern.compile("^[0-9]*$");
		     Matcher m = p.matcher(hens);
		     if (!m.find()) { // if pattern doesn't match 
		      JOptionPane.showMessageDialog(null, "Please enter numbers only ");
		      hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
		     }	
		 }		
	//JOPtionPane returns a String type, it needs to be parsed to an int value
	 henNumber = Integer.parseInt(hens);	
	 
	//Now, inside a try/catch block we build out our request and reply objects		
	try {
		CalculateRequest eggRequest1 = CalculateRequest.newBuilder().setNumberOfHens(henNumber).build();
		CalculateResponse eggResponse1 = eggStub.feedingCalculator(eggRequest1);
		
			
		//here we can print out the response to the console if needed
		System.out.println("The result of the unary rpc is: The farm's " + henNumber +" hens need " + eggResponse1.getWeeklyFoodAmount() + " kgs of food this week. ");
		
		//now we display response in JOptionPane 
		JOptionPane.showMessageDialog(null, "The result of the unary rpc is: The farm's " + henNumber + " hens need " + eggResponse1.getWeeklyFoodAmount() + " kgs of food this week.");
		
	}catch(StatusRuntimeException e) {
		e.printStackTrace();
	}
	
	System.out.println();
	
	//Server streaming rpc applePriceChecker implementation on the client side
	//user input for server streaming rpc with basic input validation
	String userInput = " ";
	userInput = JOptionPane.showInputDialog(null, "Please enter a character to display apple sales prices in the last 4 weeks: ");
	 
	 if(userInput.length() < 1) {
		   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a character");
		   userInput = JOptionPane.showInputDialog(null, "Please enter a character to display apple sales prices in the last 4 weeks: ");
	} 
	 
	//Now, inside a try/catch block we build out our request and reply objects
	try {
		//first a request object needs to be built
		ApplePrice appleRequest1 = ApplePrice.newBuilder().setAppleSalesPrice("Please display apple sales prices in the last 4 weeks ")
				.build();
		
		
		//next, we create a stub for our AppleProductionService 
		//the stub is the local representation of the remote service 
		AppleProductionServiceBlockingStub appleStub = AppleProductionServiceGrpc.newBlockingStub(channelApples);
		
		//here we build the response object and pass the request object to it
		Iterator<WeeklyApplePrice> appleResponse1 = appleStub.applePriceChecker(appleRequest1);
		
		//we can print out the 4 responses the server sent back using a while loop
			while(appleResponse1.hasNext()) {
				WeeklyApplePrice temp = appleResponse1.next();
				System.out.println("Result of server streaming rpc: The sales price of apple in the last 4 weeks was €" + temp.getApplePricesPerWeek() + " per kg");
				JOptionPane.showMessageDialog(null, "Result of server streaming rpc: The sales price of apple in the last 4 weeks was €" + temp.getApplePricesPerWeek() + " per kg");
			}
		}catch(StatusRuntimeException e) {
			e.printStackTrace();
		}	
	
	
	
	//client streaming rpc weeklyTotalEggCount() client side implementation
	
	//for client streaming we need an asynchronous stub, rather than a blocking stub
	//this way the client does not have to wait for the server to return a response before sending out another message
	EggProductionServiceStub eggAsyncStub = EggProductionServiceGrpc.newStub(channelEggs);
	
	try {
	//to observe the incoming response from the server, we need to implement our own StreamObserver first
	StreamObserver<WeeklyEggCount> responseObserver = new StreamObserver<WeeklyEggCount>() {

		//now we must implement 3 abstract methods of the StreamObserver class: onNext(), onError() and onCompleted()
		@Override
		public void onNext(WeeklyEggCount value) {
			
			System.out.println("EggServer is sending in weekly total egg count: " + value.getWeeklyEggCount());
			JOptionPane.showMessageDialog(null, "Result of client streaming rpc -> The weekly total egg count is: " + value.getWeeklyEggCount());
		}

		@Override
		public void onError(Throwable t) {
			System.out.println("An error occurred. Unable to complete operation.");
			t.printStackTrace();
			
		}

		@Override
		public void onCompleted() {			
			System.out.println("Client streaming rpc process is successfully completed. ");
			System.out.println();
		}
	};
	
	//grpc library provides a StreamObserver to create a requestObserver object
	//we use this to send our stream of outgoing messages from the client to the server
		
	StreamObserver<DailyEggCount> requestObserver = eggAsyncStub.weeklyTotalEggCount(responseObserver);
		
	//now we collect user input, the number of eggs collected daily over 7 days			
	 String dailyEggNumber = " ";	
	 int dailyEggs = 0;		
	 int counter = 0;
	
	 //a while loop asks the user 7 times to enter daily egg counts
	 while(counter <= 6) {
		 dailyEggNumber = JOptionPane.showInputDialog(null, "Please enter the number of eggs you collected daily in the last 7 days: ");
		 
		 	//user input validation ensures that user enters a value and the value must be a numeric one
			 if(dailyEggNumber.length() < 1) {
				   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a numeric value");
				   dailyEggNumber = JOptionPane.showInputDialog(null, "Please enter the number of eggs you collected daily: ");
			} 
			 else {
				 Pattern p = Pattern.compile("^[0-9]*$");
			     Matcher m = p.matcher(dailyEggNumber);
			     if (!m.find()) { // if pattern doesn't match 
			      JOptionPane.showMessageDialog(null, "Please enter numbers only ");
			      dailyEggNumber = JOptionPane.showInputDialog(null, "Please enter the number of eggs you collected daily: ");
			     }	
			 }		
		 
		//JOPtionPane returns a String type, it needs to be parsed to an int value
		 dailyEggs = Integer.parseInt(dailyEggNumber);		
	
		//stream of messages from the client will be built now 7 times
		requestObserver.onNext(DailyEggCount.newBuilder().setDailyEggCount(dailyEggs).build());
		
		try {
		Thread.sleep(400);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		counter++;		
	 }	
		
		System.out.println();
		System.out.println("Client has now sent its stream of messages to the server. ");
		
		requestObserver.onCompleted();
		
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}catch(StatusRuntimeException e) {
		e.printStackTrace();
	}
		
	
	//we are finished using channelEggs, we can shut it down now
	try {
		channelEggs.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	} catch (InterruptedException e) {				
		System.out.println("An error occurred, closing down channel");
		e.printStackTrace();
	}
	
	
	
	//bidirectional streaming  weeklyAppleSales() method, client side implementation
	
	//for bidirectional streaming we need an asynchronous stub, rather than a blocking stub
	//this way the client does not have to wait for the server to return a response before sending out another message
	AppleProductionServiceStub appleAsynchStub = AppleProductionServiceGrpc.newStub(channelApples);
	
	//Now, inside a try/catch block we build out our request and reply objects
	try {
		
		//to observe the incoming responses from the server, we need to implement our own StreamObserver first
		StreamObserver<WeeklyAppleSaleValue> responseObserver = new StreamObserver<WeeklyAppleSaleValue>() {
	
			
			int replyCounter = 0;
			
			//now we must implement 3 abstract methods of the StreamObserver class: onNext(), onError() and onCompleted()
			@Override
			public void onNext(WeeklyAppleSaleValue value) {
				System.out.println("AppleServer is sending in weekly apple sale values: " + value.getWeeklyAppleSaleValue());
				JOptionPane.showMessageDialog(null, "Result of bidirectional streaming rpc -> The weekly apple sale is: " + value.getWeeklyAppleSaleValue());
				replyCounter = replyCounter + 1;
			}
	
			@Override
			public void onError(Throwable t) {
				System.out.println("An error occurred. Unable to complete operation.");
				t.printStackTrace();
				
			}
	
			@Override
			public void onCompleted() {
				System.out.println("Bidirectional streaming rpc process is successfully completed. ");
				
			}
			
		};
		
		
		//grpc library provides a StreamObserver to create a requestObserver object
		//we use this to send our stream of outgoing messages from the client to the server
			
		StreamObserver<WeeklyAppleSale> requestObserver = appleAsynchStub.weeklyAppleSales(responseObserver);
		
		//now we collect user input, the kgs of apples sold weekly in over a 4 week period			
		 String applesSoldWeekly = " ";	
		 int soldApplesKg = 0;	
		 
		 //a for loop asks the user 4 times to enter weekly apples sales in kg
		 for(int i = 0; i <= 3; i++) {
			 applesSoldWeekly = JOptionPane.showInputDialog(null, "Please enter how many kg of apples the farm sold weekly over 4 weeks: ");
			 
			//user input validation ensures that user enters a value and the value must be a numeric one
			 if(applesSoldWeekly.length() < 1) {
				   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a numeric value");
				   applesSoldWeekly = JOptionPane.showInputDialog(null, "Please enter the number of eggs you collected daily: ");
			} 
			 else {
				 Pattern p = Pattern.compile("^[0-9]*$");
			     Matcher m = p.matcher(applesSoldWeekly);
			     if (!m.find()) { // if pattern doesn't match (not found) 
			      JOptionPane.showMessageDialog(null, "Please enter numbers only ");
			      applesSoldWeekly = JOptionPane.showInputDialog(null, "Please enter the number of eggs you collected daily: ");
			     }	
			 }		
		 
			 //JOPtionPane returns a String type, it needs to be parsed to an int type value
			 soldApplesKg  = Integer.parseInt(applesSoldWeekly);		
	
			
			//outgoing stream of messages from the client will be built 4 times
			requestObserver.onNext(WeeklyAppleSale.newBuilder().setWeeklyAppleSaleVolume(soldApplesKg).build());
			
			try {
			Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 System.out.println();
		 System.out.println("Client has now sent its stream of messages to the server. ");
		
		requestObserver.onCompleted();	
		
		try {
		Thread.sleep(10000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}catch(StatusRuntimeException e) {
		e.printStackTrace();
	}

	//we are finished using channelApples, we can shut it down now
		try {
			channelApples.shutdown().awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {				
			System.out.println("An error occurred, closing down channel");
			e.printStackTrace();
		}	

		
	
	
	
	}

}
