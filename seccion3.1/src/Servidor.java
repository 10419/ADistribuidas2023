import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException {
        final int puerto=6057;
        ServerSocket ss=new ServerSocket(puerto);
        System.out.println("Servidor iniciado");
        while (true){
            Socket co2 = ss.accept();
            System.out.println("Cliente conectado");
            DataInputStream dataS= new DataInputStream(co2.getInputStream());
            DataOutputStream dataO= new DataOutputStream(co2.getOutputStream());
            dataO.writeUTF("Respuesta desde el servidor");
            System.out.println("el mensjae es desde el cleinte:" + dataS.readUTF());
            co2.close();
            System.out.println("cliente desconectado");
        }
    }
}