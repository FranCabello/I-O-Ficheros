import java.io.*;

public class tres {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("C:/EjerciciosStreams/datos.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String cadena = entrada.readLine();
			while (cadena != null) {
				System.out.println(cadena);
				cadena = entrada.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}