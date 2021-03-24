package beadando_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Kliens {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 1234);
		String tarolni = "Kliens vagyok, kérlek tárold az üzenetem";
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println(tarolni);
		pw.flush();
		pw.close();
		s.close();

	}

}
