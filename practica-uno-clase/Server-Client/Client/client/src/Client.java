import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) {

        // Host del servidor
        final String HOST = "server";
        // Puerto del servidor
        final int PUERTO = Integer.parseInt(System.getenv("PORT"));
        DataInputStream in;
        DataOutputStream out;

        try {
            // Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            // Capturo el nombre del cliente
            String nombreCliente = leerStringConsola("Ingrese el mensaje: ");

            // Envio un mensaje al cliente
            out.writeUTF(nombreCliente);

            // Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String leerStringConsola(String mensaje) {
        String captura = "";
        System.out.print(mensaje);
        try (Scanner teclado = new Scanner(System.in)) {
            captura = teclado.nextLine();
        }
        return captura;
    }

}