import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

// Creamos la clase Fichero y sus atributos
public class Fichero {
	private File fichero;
	private String contenido;

	// Constructor por defecto
	public Fichero() {

	}

	// Constructor de Fichero
	public Fichero(File fichero) {
		this.fichero = fichero;
		this.contenido = "";
		leerContenido();
	}

	// Método para leer el contenido del fichero usando BufferedReader
	public void leerContenido() {
		String linea = null;
		FileReader fr = null;
		BufferedReader br = null;
		StringBuilder aux = new StringBuilder();
		try {
			fr = new FileReader(this.fichero);
			br = new BufferedReader(fr);
			try {
				while ((linea = br.readLine()) != null) {
					aux.append(linea);
					aux.append("\n");
				}
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error E/S: " + e);
		}
		this.contenido = aux.toString();

	}

	public String getContenido() {
		return contenido;
	}

	// Métodos para contar las líneas y caracteres del fichero

	public int getLineas() {
		if (this.contenido.equals("")) {
			return 0;
		} else {
			return this.contenido.split("\n").length;
		}
	}

	public int getCaracteres() {
		return this.contenido.replaceAll("\\s+", "").replace("\n", "").length();
	}

	// Método principal para prueba de la clase
	public static void main(String[] args) {
		int lineas = 0;
		int caracteres = 0;
		String contenido = null;

		LinkedList<File> listFicheros = new LinkedList<>();

		for (int i = 1; i <= 1; i++) {
			listFicheros.add(new File("E:\\fichero.txt"));
		}
		for (int i = 0; i < listFicheros.size(); i++) {
			Fichero archivo = new Fichero(listFicheros.get(i));
			contenido = archivo.getContenido();
			lineas += archivo.getLineas();
			caracteres += archivo.getCaracteres();

		}
		System.out.println(contenido);
		System.out.println("Lineas: " + lineas + "\nCaracteres: " + caracteres);
	}

}