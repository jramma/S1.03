package n2ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MainRestaurantes {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Integer> restaurantes = new HashMap<String, Integer>();
		ArrayList<Restaurante> restaurantesArray = new ArrayList<Restaurante>();
		int decision = 0;
		do {
			System.out.println("--------------------Menu----------------------");
			System.out.println("0.Salir");
			System.out.println("1.Introducir restaurante.");
			System.out.println("2.Ver lista ordenada de restaurantes.");
			decision = sc.nextInt();
			sc.nextLine();
			switch (decision) {
			case 0:
				System.out.println("Exint");
				break;
			case 1:
				addRestayrante(restaurantes, restaurantesArray);
				break;
			case 2:
				listaOrdenada(restaurantesArray);
				break;
			default:
				System.out.println("Introduce 0 o 1.");
			}
		} while (decision != 0);
		sc.close();
	}

	private static void listaOrdenada(ArrayList<Restaurante> restaurantesArray) {
		System.out.println("-------------------------------------------------");
		Collections.sort(restaurantesArray);
		restaurantesArray.forEach(n -> System.out.println(n));

	}

	private static void addRestayrante(HashMap<String, Integer> restaurantes,
			ArrayList<Restaurante> restaurantesArray) {
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
				restaurantesArray.add(restaurante);
				restaurantes.put(nom, puntuacion);
				System.out.println("Nuevo restaurante >> " + restaurante.toString());

			}
		}

	}

}
