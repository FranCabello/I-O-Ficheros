import java.io.*;

public class uno {

	public static void main(String[] args) throws IOException {
		PrintWriter out = null;
		File fichero = new File("C:/EjerciciosStreams/uno.java");
		if (fichero.exists()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El archivo no existe");
		}
		try {
			out = new PrintWriter("C:/EjerciciosStreams/uno.txt");
			for (int i = 0; i <= 10; i++) {
				out.print(i + " ");
			}

		} finally {
			if (out != null) {
				out.close();
			}
		}

	}

}