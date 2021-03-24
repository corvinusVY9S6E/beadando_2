package beadando_2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Futtathato implements Runnable {
	private Socket s;
	
	public Futtathato(Socket s) {
		this.s=s;
	}

	@Override
	public void run() {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter("log.txt");
			String sor = bf.readLine();
			String idobelyeg = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String tarolt=idobelyeg+", "+sor;
			pw.println(tarolt);
			System.out.println("Tárolásra került a szerveren: "+tarolt);
			bf.close();
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
