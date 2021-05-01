package networksocket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer {

    public static void main(String[] args) {
        try {
             ServerSocket ss = new ServerSocket(6666);
            while(true)
            {
            System.out.println("Going to established connection\n\n\n");
            Socket s= ss.accept();
            System.out.println("Connection Established \n\n\n");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str=(String) dis.readUTF();
            System.out.println("message="+str);
            if(str.equalsIgnoreCase("|$|"))
            {
                ss.close();
                break;
            }
            }
            
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
