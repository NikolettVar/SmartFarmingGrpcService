package grpc.egg.smartfarming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//Egg services registration is handled in a separate class for clarity
public class JmDNSEggRegistration {	
	
	
	public void run(int port, String service_type, String service_name) {

		//create a jmDNS object instance
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
								
			int service_port = port;
			String service_desc = "Integration of jmDNS with gRPC";				
			
			//create ServiceInfo object with the 3 required parameters		
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);
			
			
			 //register the service with jmDNS	 
			
			jmdns.registerService(serviceInfo);
			
			System.out.printf("Registering Egg Service with type: %s and name: %s on port: %d ", service_type, service_name, service_port);
			
			//sleep for 10 seconds
			Thread.sleep(10000);
					
			System.out.println("\nEgg Service Registered");
			
			
		//handle possible expections
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
