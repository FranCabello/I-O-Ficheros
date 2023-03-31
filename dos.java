import java.io.*;

public class dos {

	public static void main(String[] args) throws IOException {
		PrintWriter out = null;

		BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la base del tri�ngulo: ");
		String b = n.readLine();

		System.out.println("Introduzca la altura del tri�ngulo:  ");
		String a = n.readLine();

		int base = Integer.parseInt(b);
		int altura = Integer.parseInt(a);

		try {

			out = new PrintWriter("C:/EjerciciosStreams/dos.txt");
			int area = base * altura;
			out.print(area + " ");

		} finally {
			if (out != null) {
				out.close();
			}
		}

	}

}