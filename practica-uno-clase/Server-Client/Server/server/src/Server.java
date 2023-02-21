import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static void main(String[] args) {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        // puerto de nuestro servidor
        final int PUERTO = Integer.parseInt(System.getenv("PORT"));

        try {
            // Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            // Siempre estara escuchando peticiones
            while (true) {

                // Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Esperando mensaje ...");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                // Leo el mensaje que me envia
                String mensaje = in.readUTF();

                String[] nombre = mensaje.split(" ");

                String root = System.getenv("USERNAME");

                if (nombre[1].trim().equalsIgnoreCase(root.trim())) {
                    out.writeUTF("¡Hola Administrador!");
                } else {
                    out.writeUTF("¡Hola " + nombre[1] + "!");
                }

                // Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
