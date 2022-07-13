package n3ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MainCSV {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		File lista = personasInventadas(personas);
		personas.forEach(n -> System.out.println(n));

		int decision = 0;
		do {
			decision = menuSysout();
			switch (decision) {
			case 1:
				introducirPersona(lista, personas);
				break;
			case 2:
				porNombre(personas);
				break;
			case 3:
				porNombreReverse(personas);

				break;
			case 4:
				porCognom(personas);
				break;
			case 5:
				porCognomReverse(personas);

				break;
			case 6:
				ordenDni(personas);
				break;
			case 7:
				ordenDniReverse(personas);
				break;
			default:
				System.out.println("Eixint");
			}
		} while (decision > 0 || decision < 8);
	}

	private static void porCognomReverse(ArrayList<Persona> personas) {
		Collections.sort(personas, new CompararCognom());
		Collections.reverse(personas);
		personas.forEach(n -> System.out.println(n));
	}

	private static void porCognom(ArrayList<Persona> personas) {
		Collections.sort(personas, new CompararCognom());
		personas.forEach(n -> System.out.println(n));
	}

	private static void porNombreReverse(ArrayList<Persona> personas) {
		Collections.sort(personas, new CompararNombre());
		Collections.reverse(personas);
		personas.forEach(n -> System.out.println(n));
	}

	private static void porNombre(ArrayList<Persona> personas) {
		Collections.sort(personas, new CompararNombre());
		personas.forEach(n -> System.out.println(n));

	}

	private static void ordenDniReverse(ArrayList<Persona> personas) {
		Collections.sort(personas);
		Collections.reverse(personas);
		personas.forEach(n -> System.out.println(n));
		sc.nextLine();
	}

	private static void ordenDni(ArrayList<Persona> personas) {
		Collections.sort(personas);
		personas.forEach(n -> System.out.println(n));
		sc.nextLine();
	}

	private static void introducirPersona(File lista, ArrayList<Persona> personas) {
		String nombre = Entrada.leerString("Introduzca el nombre de la persona");
		String apellido = Entrada.leerString("Introduzca el apellido de la persona");
		String dni = Entrada.leerString("Introduzca el DNI de la persona");
		Persona personaAbuscar = new Persona(nombre, apellido, dni);
		Persona encontrado = buscarPersona(personaAbuscar, personas);
		if (encontrado != null) {
			System.out.println("Esta persona ya existe.");
		} else {
			personas.add(personaAbuscar);
			try {
				FileOutputStream is = new FileOutputStream(lista);
				OutputStreamWriter osw = new OutputStreamWriter(is);
				Writer w = new BufferedWriter(osw);
				w.write(personaAbuscar.getNom() + "," + personaAbuscar.getCognom() + "," + personaAbuscar.getDni()
						+ "\n");
				w.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Persona creada>> " + personaAbuscar.toString());
		}
	}

	private static Persona buscarPersona(Persona personaAbuscar, ArrayList<Persona> personas) {
		Persona buscada = null;
		int i = 0;
		while (i < personas.size() && buscada == null) {
			i++;
			if (personas.get(i).equals(personaAbuscar)) {
				buscada = personas.get(i);
			}

		}

		return buscada;
	}

	private static File personasInventadas(ArrayList<Persona> personas) {
		// aqui me invento personas y las añado al csv solo para probar el código
		// Tambien creo y escribo el csv
		File csvFile = new File("lista.csv");
		Persona persona1 = new Persona("Andreu", "Ballesto", "34835767J");
		Persona persona2 = new Persona("Miquel", "Bayona ", "48743957B");
		Persona persona3 = new Persona("Guillem", "Capdevila", "33957834J");
		Persona persona4 = new Persona("Albert", "Carbonell", "77364986R");
		Persona persona5 = new Persona("Ferran", "Casas", "23047848P");
		Persona persona6 = new Persona("Maria", "Casellas", "47102244S ");
		Persona persona7 = new Persona("Genis", "Ciutat ", "39718459N ");
		personas.add(persona7);
		personas.add(persona6);
		personas.add(persona5);
		personas.add(persona4);
		personas.add(persona3);
		personas.add(persona2);
		personas.add(persona1);
		try {
			csvFile.createNewFile();
			FileOutputStream is = new FileOutputStream(csvFile);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);
			for (int i = 0; i < personas.size(); i++) {
				w.write(personas.get(i).getNom() + "," + personas.get(i).getCognom() + "," + personas.get(i).getDni()
						+ "\n");
			}
			w.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return csvFile;
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
