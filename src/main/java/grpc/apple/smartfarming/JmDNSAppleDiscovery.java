package grpc.apple.smartfarming;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class JmDNSAppleDiscovery {

	// here we define a method that returns a ServiceInfo object
	public static ServiceInfo run(String serviceType) {
		ServiceInfo appleServiceInfo = null;
		try {
			AppleServiceListener appleListener = new AppleServiceListener();
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener(serviceType, appleListener);
			appleServiceInfo = appleListener.getAppleServiceInfo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appleServiceInfo;
	}

	// inner class implements the ServiceListener interface and its 3 methods
	public static class AppleServiceListener implements ServiceListener {

		private int port;
		private ServiceInfo appleServiceInfo;

		public void serviceAdded(ServiceEvent event) {
			ServiceInfo appleServiceInfo = event.getInfo();
			this.port = appleServiceInfo.getPort();
			this.appleServiceInfo = appleServiceInfo;
			System.out.println("Apple Service is running on: " + appleServiceInfo.getPort());
			System.out.println("Apple Service added: " + event.getInfo());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Apple Service removed: " + event.getInfo());

		}

		public void serviceResolved(ServiceEvent event) {
			ServiceInfo appleServiceInfo = event.getInfo();
			this.port = appleServiceInfo.getPort();
			this.appleServiceInfo = appleServiceInfo;
			System.out.println("Apple Service is running on: " + appleServiceInfo.getPort());
			System.out.println("Apple Service resolved: " + event.getInfo());

		}

		// this method returns the port number that corresponds to the service
		public int getPort() {
			return port;
		}

		// this method return the ServiceInfo object, holding all key information about
		// the service
		public ServiceInfo getAppleServiceInfo() {
			return appleServiceInfo;
		}

	}
}
