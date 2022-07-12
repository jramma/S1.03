package n2ejer1;

import java.util.HashMap;
import java.util.Scanner;

public class MainRestaurantes {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Integer> restaurantes = new HashMap<String, Integer>();
		int decision = 0;
		do {
			System.out.println("--------------------Menu----------------------");
			System.out.println("0.Salir");
			System.out.println("1.Introducir restaurante.");
			decision = sc.nextInt();
			sc.nextLine();
			switch (decision) {
			case 0:
				System.out.println("Exint");
				break;
			case 1:
				addRestayrante(restaurantes);
				break;
			default:
				System.out.println("Introduce 0 o 1.");
			}
		} while (decision != 0);
		sc.close();
	}

	private static void addRestayrante(HashMap<String, Integer> restaurantes) {
		System.out.println("Introduce el nombre:");
		String nom = sc.nextLine();
		System.out.println("Introduce puntuacion:");
		int puntuacion = sc.nextInt();
		sc.nextLine();
		Boolean yaExiste = false;
		try {
			if (restaurantes.get(nom) != puntuacion) {
				restaurantes.put(nom, puntuacion);
				
			} else {
				System.out.println("Ya existe un restaurante con este nombre y puntuacion");
				yaExiste = true;
			}
		} catch (Exception e) {
			e.getMessage();

		} finally {
			Restaurante restaurante = new Restaurante(nom, puntuacion);
			if (!yaExiste) {
				restaurantes.put(nom, puntuacion);
				System.out.println("Nuevo restaurante >> " + restaurante.toString());

			}
		}

	}

}
