package org.sniffy.core;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[255];
        boolean running = true;
        DatagramSocket socket = new DatagramSocket(4445);
        while (running) {
            DatagramPacket packet
                    = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(buf, buf.length, address, port);
            String received
                    = new String(packet.getData(), 0, packet.getLength());
            System.err.println(received + " from " + packet.getAddress());
            socket.send(packet);
        }
        socket.close();
    }

}
