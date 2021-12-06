package grpc.apple.smartfarming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class JmDNSAppleDiscovery {
	
	//a static inner class implements the ServiceListener interface and its 3 methods
	private static class MyAppleServiceListener implements ServiceListener{

		//first we declare the variables needed
		private int port2;	
		private ServiceInfo serviceInfo2;
		
		//all the 3 methods accept a ServiceEvent parameter
		//getInfo() method can be called on it to retrieve required information about the service
		public void serviceAdded(ServiceEvent event) {
			
			System.out.println("\nApple Service Added " + event.getInfo());
			
		}

		public void serviceRemoved(ServiceEvent event) {
			
			System.out.println("Apple Service Removed " + event.getInfo());
			
		}

		public void serviceResolved(ServiceEvent event) {
			
			System.out.println("Apple Service Resolved " + event.getInfo());
			
			//a ServiceInfo object is instantiated to store all information about the service
			ServiceInfo serviceInfo2 = event.getInfo();
			this.setServiceInfo(serviceInfo2);
		
			//now we can retrieve the required pieces of data about the service
			//including port number, service type and service name
			System.out.println("Apple Service port: " + serviceInfo2.getPort());
			this.setPort(serviceInfo2.getPort());
			System.out.println("Apple Service type: " + serviceInfo2.getType());
			System.out.println("Apple Service name: " + serviceInfo2.getName());
			
		}

		//setter and getter methods are needed to set and return the port number and the ServiceInfo object
		public int getPort() {
			return port2;
		}

		public void setPort(int port2) {
			this.port2 = port2;
		}

		public ServiceInfo getServiceInfo() {
			return serviceInfo2;
		}

		public void setServiceInfo(ServiceInfo serviceInfo2) {
			this.serviceInfo2 = serviceInfo2;
		}
		
	}

	//here we define a method that returns a ServiceInfo object
	public static ServiceInfo run(String service_type2) {
		
		int port2 = 0;
		ServiceInfo serviceInfo2 = null;
		
		//get an instance of jmDNS	
		
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//we now need a ServiceListener object to listen for service added
			//will discover the service based on service type
			MyAppleServiceListener msl2 = new MyAppleServiceListener();		
			jmdns.addServiceListener(service_type2, msl2);

			
			//sleep for 10 seconds
			Thread.sleep(10000);
			
			//now we can retrieve and store information in the ServiceInfo object
			serviceInfo2 = msl2.getServiceInfo();
			//retrieve the port number the service is available on 
			port2 = msl2.getPort();
			System.out.println("Apple Server's port is retreived from jmDNS: " + port2);
			
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
		return serviceInfo2;

	}


}
