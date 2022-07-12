package n3ejercicio1;

import java.io.File;
import java.util.ArrayList;

public class MainCSV {

	public static void main(String[] args) {
		File csv = new File("csv.csv");
		ArrayList<Persona> personas = new ArrayList <Persona>();
		personasInventadas(csv, personas);
		int decision = menuSysout();
		switch (decision) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			System.out.println("Eixint");
		}

	}

	private static void personasInventadas(File csv, ArrayList<Persona> personas) {
		
	}

	private static int menuSysout() {
		return Entrada.leerInt("-----------------------------------------------------\n" + "1.- Introduir persona.\n"
				+ "2.- Mostrar les persones ordenades per nom (A-Z).\n"
				+ "3.- Mostrar les persones ordenades per nom (Z-A).\n"
				+ "4.- Mostrar les persones ordenades per cognoms (A-Z).\n"
				+ "5.- Mostrar les persones ordenades per cognoms (Z-A).\n"
				+ "6.- Mostrar les persones ordenades per DNI (1-9).\n"
				+ "7.- Mostrar les persones ordenades per DNI (9-1).\n" + "0.- Sortir.");

	}

}
