package org.sniffy.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;

public class UDPServer {


    public void listen() {
        try {
            System.err.println("Waiting message");
            while (true) {
                DatagramSocket socket = new DatagramSocket(4445);
                DatagramPacket packet = new DatagramPacket(new byte[Integer.SIZE * 2], Integer.SIZE * 2);
                socket.receive(packet);

                ByteBuffer byteBuffer = ByteBuffer.wrap(packet.getData());

                int sniffy = byteBuffer.getInt();
                int sample = byteBuffer.getInt();

                System.err.print("Sniffy : " + sniffy);
                System.err.println(" / Sample : " + sample);

                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
