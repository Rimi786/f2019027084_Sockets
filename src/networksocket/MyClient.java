/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksocket;

import java.net.Socket;
import java.io.DataOutputStream;
public class MyClient {
    public static void main(String[] args) {
        try
        {
            Socket s= new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("end");
            dout.flush();   
            dout.close();
            s.close();
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
    }
}
