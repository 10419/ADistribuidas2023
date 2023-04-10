import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        final String host="127.0.0.1";
        final int puerto=6057;
        Socket s = new Socket(host,puerto);
        DataInputStream datI= new DataInputStream(s.getInputStream());
        System.out.println(datI.readUTF());
        DataOutputStream datO= new DataOutputStream(s.getOutputStream());
        datO.writeUTF("mensaje desde el cliente");
        s.close();

    }
}
