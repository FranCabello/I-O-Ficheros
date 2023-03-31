import java.io.*;

public class cuatro {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		FileReader f_in = new FileReader("C:/EjerciciosStreams/datos.txt");
		in = new BufferedReader(f_in);

		RandomAccessFile rf = null;
		rf = new RandomAccessFile("datosAleatorio.txt", "rw");

		String linea;

		while ((linea = in.readLine()) != null) {
			rf.writeChars(linea);
			rf.writeChars("\n");

		}

		in.close();
		rf.close();

	}

}