package beadando_2;

import java.io.IOException;
import java.net.ServerSocket;

public class Szerver {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1234);
		while(true) {
			new Thread(new Futtathato(ss.accept())).start();
		}
	}

}
