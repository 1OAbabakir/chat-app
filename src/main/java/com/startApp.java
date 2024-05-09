package com;

import java.io.IOException;
import java.net.Socket;

public class startApp {

    public static void main(String[] args) {
        server mainServer = new server(994);
        System.out.println("End");

        try (Socket first_client = new Socket("127.0.0.1", 994)) {
        } catch (IOException e) {   
            e.printStackTrace();
        }


    }

}
