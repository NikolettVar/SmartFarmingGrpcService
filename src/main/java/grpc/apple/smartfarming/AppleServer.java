package grpc.apple.smartfarming;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import grpc.apple.smartfarming.AppleProductionServiceGrpc.AppleProductionServiceImplBase;
import grpc.egg.smartfarming.EggServer;

public class AppleServer extends AppleProductionServiceImplBase{
	public static void main(String[] args) {
		
		//first we must define the port
		int port = 50052;
		
		//next, we need to create an instance of this server class
		//we will pass it to the serverBuiler object
		AppleServer appleServer = new AppleServer();
		
		//now we build out our appleServer within Exception handling try/catch block
		try {
				Server server = ServerBuilder.forPort(port)
					.addService(appleServer)
					.build()
					.start();
				server.awaitTermination();
		}catch(Exception e) {
				e.printStackTrace();
		}

	}
	
	//now we define our rpc methods here

}
