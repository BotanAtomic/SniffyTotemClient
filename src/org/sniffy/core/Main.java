package org.sniffy.core;

import org.sniffy.motor.Motor;
import org.sniffy.network.UDPServer;

public class Main {

    public static void main(String[] args) throws Exception {
        new Thread(() -> new UDPServer().listen()).start();

        Motor.test();
    }

}
