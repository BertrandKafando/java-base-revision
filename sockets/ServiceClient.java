package sockets;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServiceClient extends Thread {
    private Socket s;
    

    public ServiceClient(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            while(true) {
                String message = br.readLine();
                System.out.println("Message reçu: " + message);
                pw.println(message.length());
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
}
    
}
