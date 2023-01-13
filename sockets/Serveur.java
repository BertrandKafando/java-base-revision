package sockets;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur  extends Thread {
    @Override
    public void run() {
        try  {
            ServerSocket ss = new ServerSocket(5000);

            while (true) {
                System.out.println("Serveur en attente de connexion");
               Socket s=  ss.accept();
                System.out.println("Connexion établie");
                // on each connection, we create a new thread to handle the client request 
                new ServiceClient(s).start();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Serveur serveur = new Serveur();
        serveur.start();
    }
    
}
