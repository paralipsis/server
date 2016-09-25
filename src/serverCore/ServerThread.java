package serverCore;

import java.net.*;
import java.io.*;
/**
 * Created by Kelvin Meyer on 2016/09/24.
 * MYRKEL002
 */
public class ServerThread extends Thread {
        private Socket socket = null;

        public ServerThread(Socket socket) {
            super("ServerThread");
            this.socket = socket;
        }

        public void run() {
            try (
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ) {
                String inputLine, outputLine;
                inputLine = in.readLine();
                ServerProtocol sp = new ServerProtocol(inputLine);
                outputLine = sp.processRequest();
                out.println(outputLine);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
