import java.net.*;
import java.io.*;

public class clientTCP {
	  public static void main(String[] args){
        Socket client = null;
       
        try {
            int port = 5456;
            client = new Socket("localhost",port);
            //enviando
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("et");
            
            //recebendo
            DataInputStream in = new DataInputStream(client.getInputStream());
            String Resposta = in.readUTF();
            System.out.println("recebido do servidor: " + Resposta);
          
            out.close();
            in.close();
            client.close();
        }catch (UnknownHostException e){System.out.println("Socket:"+e.getMessage());
		}catch (EOFException e){System.out.println("EOF:"+e.getMessage());
		}catch (IOException e){System.out.println("readline:"+e.getMessage());
		}finally {if(client!=null) try {client.close();}catch (IOException e){System.out.println("close:"+e.getMessage());}}
    }

}