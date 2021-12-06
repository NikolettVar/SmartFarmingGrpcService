package grpc.apple.smartfarming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//Apple services registration is handled in a separate class for clarity
public class JmDNSAppleRegistration {
	
	//Apple service registration setup, the apple server will call this method
	public void run(int port2, String service_type2, String service_name2) {

		//create a jmDNS object instance
		try {
			JmDNS jmdns2 = JmDNS.create(InetAddress.getLocalHost());
									
			int service_port2 = port2;
			String service_desc2 = "Integration of jmDNS with gRPC";				
			
			//create ServiceInfo object with the 3 required parameters			
			ServiceInfo serviceInfo2 = ServiceInfo.create(service_type2, service_name2, service_port2, service_desc2);
			
			
			//register the service with jmDNS	 
			jmdns2.registerService(serviceInfo2);
			
			System.out.printf("Registering Apple Service with type: %s and name: %s on port: %d ", service_type2, service_name2, service_port2);
			
			//sleep for 10 seconds
			Thread.sleep(10000);
			System.out.println("\nApple Service Registered");
			
			
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
