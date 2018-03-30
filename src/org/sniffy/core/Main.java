package org.sniffy.core;

import org.sniffy.network.UDPServer;

public class Main {

    public static void main(String[] args) throws Exception {
        new UDPServer().listen();
    }

}
