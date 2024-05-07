package com;

import java.net.ServerSocket;

//
//  @author Omed Ababakir
//  Server in welchem sich die Clienten verbinden können
//

public class server {


    static private ServerSocket mainServer;


    public server(int zPort) {

        try {
            mainServer = new ServerSocket(  zPort  );
            System.out.println("Created Server on Port: "  +  mainServer.getLocalPort());
            System.out.println("Server SocketAddress: "  +  mainServer.getLocalSocketAddress());

            while (true) {
                mainServer.accept();
                break;

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public boolean cutServer() {
        return false;
    }
}
