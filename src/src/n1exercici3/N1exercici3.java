package n1exercici3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

public class N1exercici3 {

	public static void main(String[] args) throws IOException {
		HashMap<String, String> paisesYcapitales = new HashMap<String, String>();
		HashMap<String, Integer> puntuaciones = new HashMap<String, Integer>();
		leerFichero(paisesYcapitales);
		int i = 0, puntuacion = 0;
		String nombre = Entrada.leerString("Introduce tu nombre");
		Object[] keys = paisesYcapitales.keySet().toArray();
		// System.out.println(paisesYcapitales);
		do {
			Object pais = keys[new Random().nextInt(keys.length)];
			String capital = Entrada.leerString("Introduce la capital de " + pais);

			if (paisesYcapitales.get(pais).equalsIgnoreCase(capital)) {
				puntuacion++;
				System.out.println("ACERTASTE!!");
			} else {
				System.out.println("fallaste :(");
			}

			i++;
		} while (i < 10);
		escribirFichero(nombre, puntuacion, puntuaciones);
		// System.out.print(paisesYcapitales.toString());
		System.out.println("Tu puntuacion : " + puntuacion + "/10");
		System.out.println(puntuaciones.toString().replace("]", "\n"));
		System.out.println("Game over");

	}

	private static void escribirFichero(String nombre, Integer puntuacion, HashMap<String, Integer> puntuaciones)
			throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("src/clasificacion.txt", true);
			pw = new PrintWriter(fichero);
			pw.write("- " + nombre + " : " + puntuacion + ".\n");
			puntuaciones.put(nombre, puntuacion);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fichero.close();

				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		pw.close();

	}

	private static void leerFichero(HashMap<String, String> paisesYcapitales) {
		int i = 0;
		try {
			FileReader fr = new FileReader("src/countries.txt");
			BufferedReader bf = new BufferedReader(fr);
			String linea;
			while ((linea = bf.readLine()) != null && i < 51) {
				String[] cadenas = linea.split(" ");
				paisesYcapitales.put(cadenas[0], cadenas[1]);
				i++;
			}
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();
		}
	}

}
