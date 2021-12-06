package grpc.egg.smartfarming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class JmDNSEggDiscovery {
		
	//a static inner class implements the ServiceListener interface and its 3 methods
	private static class MyServiceListener implements ServiceListener{

		//first we declare the variables needed
		private int port;	
		private ServiceInfo serviceInfo;
		
		//all the 3 methods accept a ServiceEvent parameter
		//getInfo() method can be called on it to retrieve required information about the service
		public void serviceAdded(ServiceEvent event) {
			
			System.out.println("\nEgg Service Added " + event.getInfo());
			
		}

		public void serviceRemoved(ServiceEvent event) {
			
			System.out.println("Egg Service Removed " + event.getInfo());
			
		}

		public void serviceResolved(ServiceEvent event) {
		
			System.out.println("Egg Service Resolved " + event.getInfo());
			
			//a ServiceInfo object is instantiated to store all information about the service
			ServiceInfo serviceInfo = event.getInfo();
			this.setServiceInfo(serviceInfo);		
			
			//now we can retrieve the required pieces of data about the service
			//including port number, service type and service name
			System.out.println("Egg Service port: " + serviceInfo.getPort());
			this.setPort(serviceInfo.getPort());
			System.out.println("Egg Service type: " + serviceInfo.getType());
			System.out.println("Egg Service name: " + serviceInfo.getName());
			
		}

		//setter and getter methods are needed to set and return the port number and the ServiceInfo object
		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}


		public ServiceInfo getServiceInfo() {
			return serviceInfo;
		}

		public void setServiceInfo(ServiceInfo serviceInfo) {
			this.serviceInfo = serviceInfo;
		}
		
	}

	//here we define a method that returns a ServiceInfo object
	public static ServiceInfo run(String service_type) {
		
		int port = 0;
		ServiceInfo serviceInfo = null;
		
		//get an instance of jmDNS		
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//we now need a ServiceListener object to listen for service added
			//will discover the service based on service type			
			
			MyServiceListener msl = new MyServiceListener();		
			jmdns.addServiceListener(service_type, msl);

			
			//sleep for 10 seconds
			Thread.sleep(10000);
			
			//now we can retrieve and store information in the ServiceInfo object
			serviceInfo = msl.getServiceInfo();
			//retrieve the port number the service is available on 
			port = msl.getPort();
			System.out.println("Egg Server's port is retreived from jmDNS: " + port);
			
			jmdns.close();
			
		//handle possible expections
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceInfo;

	}


}
