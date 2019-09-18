package durgaFileInputOutput;
import java.io.*;
public class PrintWriterDemo {
        public static void main(String[] args) throws Exception {
		PrintWriter pw= new PrintWriter("PrintWriterDemo.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("Durga");
		pw.flush();
		pw.close();
}
}
