package ClientServer;
import java.io.*;
import java.net.*;


public class Client {

	    public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("10.107.204.211",4999);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Is it Working");
		pr.flush();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		
		String str=br.readLine();
		System.out.println("Server :"+str);

	}

}
