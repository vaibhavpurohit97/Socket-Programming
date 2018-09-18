/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgramming;

/**
 *
 * @author A
 */
import java.io.*;  
import java.net.*;  

public class MyClient {
    public static void main(String[] args) {  
        try{      
        Socket s=new Socket("localhost",6666);  
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());  
        dos.writeUTF("Heyy there Server");  
        dos.flush();  
        dos.close();  
        s.close();  
        }catch(Exception e){System.out.println(e);}  
}
}
