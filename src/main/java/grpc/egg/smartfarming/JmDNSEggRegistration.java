package grpc.egg.smartfarming;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//Egg services registration is handled in a separate class for clarity
public class JmDNSEggRegistration {
	
	//Egg service registration setup, the server will call this method
	public void run(String serviceType, String serviceName, int port, String description){ 
		try {
					
			//first we createa JmDNS object
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//we create the serviceInfo object next with the 4 required parameters
			ServiceInfo eggServiceInfo = ServiceInfo.create(serviceType, serviceName, port, description);
			
			//now register the egg service with the jmdns object
			jmdns.registerService(eggServiceInfo);
			System.out.println("jmDNS registration for Egg Service is running...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
