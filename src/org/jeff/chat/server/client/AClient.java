package org.jeff.chat.server.client;

import java.io.IOException;

public class AClient {

    public static void main(String[] args) {
        try {
            new ChatClient().startClient("lucy");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
