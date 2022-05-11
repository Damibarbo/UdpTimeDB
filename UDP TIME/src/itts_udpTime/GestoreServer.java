package itts_udpTime;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class GestoreServer {
public static void main(String[] args) {
		
		/* porta del server maggiore di 1024 
		 * oppure la porta 13 standard del protocollo Daytime
		 */
		UDPServer s = new UDPServer();
		s.connessione();
		s.comunica();
		
	}

}
