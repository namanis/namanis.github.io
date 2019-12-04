

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class EntradaSaida {
public static void main (String [] args){
	OutputStream os = new FileOutputStream("log.txt");
	System.setErr(new PrintStream(os)); // SET SYSTEM.ERR
	System.err.println("Error");
}
}
