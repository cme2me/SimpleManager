package com.max.simplemanager;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientHandler {
    private final int PORT = 8089;
    private Socket client;

    public void connect() throws IOException {
        client = new Socket("localhost", PORT);
    }
}
