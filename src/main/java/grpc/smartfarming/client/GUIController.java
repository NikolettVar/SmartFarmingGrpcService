package grpc.smartfarming.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import grpc.apple.smartfarming.ApplePrice;
import grpc.apple.smartfarming.AppleProductionServiceGrpc;
import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceBlockingStub;
import grpc.apple.smartfarming.WeeklyApplePrice;
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
	
	//Here we create an instance of the ManagedChannel class, client communicates with the servers through these network connection channels 
	//We need 1 channel per service, each one using the port numbers we defined for them in the Server classes
	ManagedChannel channelEggs = ManagedChannelBuilder
		.forAddress(host, port1)
		.usePlaintext()
		.build();
	
	ManagedChannel channelApples = ManagedChannelBuilder
		.forAddress(host, port2)
		.usePlaintext()
		.build();
		
	//next, we need an instance of the stub that has the methods we want to call
	//the stub is the representation of the server on the client side
	//we need 1 stub per service
	EggProductionServiceBlockingStub eggStub = EggProductionServiceGrpc.newBlockingStub(channelEggs);
	
	
	//Unary rpc feedingCalculator implementation
	//Now, inside a try/catch block we build out our request and reply objects
	
	//First we ask the user for an integer input, the number of hens the farm has this week
	//User input is validated against empty input and non-numeric input


	 String hens = " ";	
	 int henNumber = 0;		
	
	 hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
	 
		 if(hens.length() < 1) {
			   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a numeric value");
			   hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
		} 
		 else {
			 Pattern p = Pattern.compile("^[0-9]*$");
		     Matcher m = p.matcher(hens);
		     if (!m.find()) { // if pattern doesn't match (not found) 
		      JOptionPane.showMessageDialog(null, "Please enter numbers only ");
		      hens = JOptionPane.showInputDialog(null, "Please enter the number of hens the farm has this week: ");
		     }	
		 }		
	 
	 henNumber = Integer.parseInt(hens);	
	
	try {
		CalculateRequest eggRequest1 = CalculateRequest.newBuilder().setNumberOfHens(henNumber).build();
		CalculateResponse eggResponse1 = eggStub.feedingCalculator(eggRequest1);
		
			
		//here we can print out the response to the console if needed
		System.out.println("The result of the unary rpc is: The farm's " + henNumber +" hens need " + eggResponse1.getWeeklyFoodAmount() + " kgs of food this week. ");
		
		//now we display response in JOptionPane 
		JOptionPane.showMessageDialog(null, "The result of the unary rpc is: The farm's " + henNumber + " hens need " + eggResponse1.getWeeklyFoodAmount() + " kgs of food this week.");
		
	}catch(StatusRuntimeException e) {
		e.printStackTrace();
	}finally {
		//shutdown channel
		channelEggs.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	System.out.println();
	
	
	String userInput = " ";
	userInput = JOptionPane.showInputDialog(null, "Please enter a character to display apple sales prices in the last 4 weeks: ");
	 
	 if(userInput.length() < 1) {
		   JOptionPane.showMessageDialog(null, "This field cannot be blank. Please enter a character");
		   userInput = JOptionPane.showInputDialog(null, "Please enter a character to display apple sales prices in the last 4 weeks: ");
	} 
	 
	//server streaming rpc applePriceChecker implementation
	try {
		ApplePrice appleRequest1 = ApplePrice.newBuilder().setAppleSalesPrice("Please display apple sales prices in the last 4 weeks ")
				.build();
		
		
		//next, we create a stub for our AppleProductionService 
		//the stub is the local representation of the remote service 
		AppleProductionServiceBlockingStub appleStub = AppleProductionServiceGrpc.newBlockingStub(channelApples);
		
		Iterator<WeeklyApplePrice> appleResponse1 = appleStub.applePriceChecker(appleRequest1);
		
		//now we can print out the 4 responses the server sent back
			while(appleResponse1.hasNext()) {
				WeeklyApplePrice temp = appleResponse1.next();
				System.out.println("Result of server streaming rpc: The sales price of apple in the last 4 weeks was €" + temp.getApplePricesPerWeek() + " per kg");
				JOptionPane.showMessageDialog(null, "Result of server streaming rpc: The sales price of apple in the last 4 weeks was €" + temp.getApplePricesPerWeek() + " per kg");
			}
		}catch(StatusRuntimeException e) {
			e.printStackTrace();
		}finally {
		
		channelApples.shutdown().awaitTermination(10, TimeUnit.SECONDS);
		}
	
	}

}
