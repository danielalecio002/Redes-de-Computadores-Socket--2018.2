import java.net.*;
import java.io.*;
import java.util.Calendar;

public class serverTCP{
    public static void main(String []args){
        int port = 5456;
        try{
            ServerSocket listenSocket = new ServerSocket(port);
          
            while(true){
                 Socket Socketcliente = listenSocket.accept();
                 Connection con = new Connection(Socketcliente);
                        
            }
        }catch(IOException e){
            System.out.println("Listen socket:" + e.getMessage());
        }
    }
}
class Connection extends Thread{
DataInputStream in;
DataOutputStream out;
Socket Socketclient;
public Connection(Socket clientsocket){
    try{
        Socketclient = clientsocket;
        in = new DataInputStream(Socketclient.getInputStream());
        out = new DataOutputStream(Socketclient.getOutputStream());
        this.start();
    }catch(IOException e){
        System.out.println("Connection:"+e.getMessage());
    }
    
}
public void run(){
try{
     String[] msg = {"Bom dia!","Seja feliz!","Seja Bem vindo!","Seja Alegre","Muitas Felicidades",
                    "Bueno Dias!","Alegre-se!","Anime-se","Seja feliz!","Tenha um ótimo dia!",
                    "Conquiste seus objetivos!","Viva Bem!","Nao desista!","Lute Lute!","Ame !",
                    "Seja forte!","Mais um dia que começa!","Sonhe Alto!","Ame as pessoas!","Vai dar certo!",
                    "Esperança!","Faça mudanças!","Agradeça sempre!","Seja carinhoso!","Ame as coisa simples!",
                    "Nunca fale nunca!","Seja persistente!","Não desanime-se!","Fé!","No fim tudo dar certo!"
                
                           }; 
    String comando = in.readUTF();
    
    Calendar data = Calendar.getInstance();  
    int dia = data.get(Calendar.DAY_OF_MONTH);
   
    String DATA = data.getTime().toString();
   
    if(comando.trim().equals("Get")){
                switch(dia){
                    case 1:
                        out.writeUTF(DATA + " " + msg[0] );
                    case 2:
                        out.writeUTF(DATA + " "+ msg[1] );
                    case 3:
                        out.writeUTF(DATA + " " + msg[2] );
                    case 4:
                        out.writeUTF(DATA + " " + msg[3] );
                    case 5:
                        out.writeUTF(DATA + " " + msg[4] );
                    case 6:
                        out.writeUTF(DATA + " " + msg[5] );
                    case 7:
                        out.writeUTF(DATA + " " + msg[6] );
                    case 8:
                        out.writeUTF(DATA + " " + msg[7] );
                    case 9:
                        out.writeUTF(DATA + " " + msg[8] );
                    case 10:
                        out.writeUTF(DATA + " " + msg[9] );
                    case 11:
                        out.writeUTF(DATA + " " + msg[10] );
                    case 12:
                        out.writeUTF(DATA + " " + msg[11] );
                    case 13:
                        out.writeUTF(DATA + " " + msg[12] );
                    case 14:
                        out.writeUTF(DATA + " " + msg[13] );
                    case 15:
                        out.writeUTF(DATA + " " + msg[14] );    
                    case 16:
                        out.writeUTF(DATA + " " + msg[15] );
                    case 17:
                        out.writeUTF(DATA + " " + msg[16] );
                    case 18:
                        out.writeUTF(DATA + " " + msg[17] );
                    case 19:
                        out.writeUTF(DATA + " " + msg[18] );
                    case 20:
                        out.writeUTF(DATA + " " + msg[19] );
                    case 21:
                        out.writeUTF(DATA + " " + msg[20] );
                    case 22:
                        out.writeUTF(DATA + " " + msg[21] );
                    case 23:
                        out.writeUTF(DATA + " " + msg[22] );
                    case 24:
                        out.writeUTF(DATA + " " + msg[23] );
                    case 25:
                        out.writeUTF(DATA + " " + msg[24] );
                    case 26:
                        out.writeUTF(DATA + " " + msg[25] );
                    case 27:
                        out.writeUTF(DATA + " " + msg[26] );
                    case 28:
                        out.writeUTF(DATA + " " + msg[27] );
                    case 29:
                        out.writeUTF(DATA + " " + msg[28] );
                    case 30:
                        out.writeUTF(DATA + " " + msg[29] );         
               }
     }else{
         out.writeUTF("Comand not found!");
        }
}catch(IOException e){
    System.out.println("Connection:"+e.getMessage());
}
}
}

