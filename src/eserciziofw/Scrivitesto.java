package eserciziofw;
import java.io.*;

public class Scrivitesto {

	public static void main(String[] args) {
	
	try {
		FileWriter fw = new FileWriter("esempio.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello World! I just learned to write characters with java! :)");
		bw.close();
	} catch (IOException e) {
		System.out.println("Something went wrong!");
	}
		

	}

}
