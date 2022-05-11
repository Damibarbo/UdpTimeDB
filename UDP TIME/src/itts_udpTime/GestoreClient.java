package itts_udpTime;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestoreClient {
	
	public static void main(String[] args) {
		
		UDPClient c = new UDPClient();
		c.connessione();
		c.comunicazione();
				
	}

}
