package grpc.egg.smartfarming;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class JmDNSEggDiscovery {

	// here we define a method that returns a ServiceInfo object
	public static ServiceInfo run(String serviceType) {
		ServiceInfo eggServiceInfo = null;
		try {
			EggServiceListener eggListener = new EggServiceListener();
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener(serviceType, eggListener);
			eggServiceInfo = eggListener.getEggServiceInfo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eggServiceInfo;
	}

	// inner class implements the ServiceListener interface and its 3 methods
	public static class EggServiceListener implements ServiceListener {

		private int port;
		private ServiceInfo eggServiceInfo;

		public void serviceAdded(ServiceEvent event) {
			ServiceInfo eggServiceInfo = event.getInfo();
			this.port = eggServiceInfo.getPort();
			this.eggServiceInfo = eggServiceInfo;
			System.out.println("Egg Service is running on: " + eggServiceInfo.getPort());
			System.out.println("Egg Service added: " + event.getInfo());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Egg Service removed: " + event.getInfo());

		}

		public void serviceResolved(ServiceEvent event) {
			ServiceInfo eggServiceInfo = event.getInfo();
			this.port = eggServiceInfo.getPort();
			this.eggServiceInfo = eggServiceInfo;
			System.out.println("Egg Service is running on: " + eggServiceInfo.getPort());
			System.out.println("Egg Service resolved: " + event.getInfo());

		}

		// this method returns the port number that corresponds to the service
		public int getPort() {
			return port;
		}

		// this method return the ServiceInfo object, holding all key information about
		// the service
		public ServiceInfo getEggServiceInfo() {
			return eggServiceInfo;
		}

	}
}
