package ClientServer;
import java.io.*;
import java.net.*;

public class Server {

		    public static void main(String[] args) throws UnknownHostException, IOException {
			ServerSocket ss = new ServerSocket(4999);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(in);
			
			String str=br.readLine();
			System.out.println("Client :"+str);
			
			PrintWriter pr = new PrintWriter(s.getOutputStream());
			pr.println("yes");
			pr.flush();
			}
		}


