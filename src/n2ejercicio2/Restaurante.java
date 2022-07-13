package n2ejercicio2;

public class Restaurante implements Comparable <Restaurante> {
	private String nom;
	private int puntuacion;
	public Restaurante(String nom, int puntuacion) {
		this.nom = nom;
		this.puntuacion = puntuacion;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "Restaurante [nom=" + nom + ", puntuacion=" + puntuacion + "]";
	}
	@Override
	public int compareTo(Restaurante o) {
		int posicion = 0;
		if(o.getPuntuacion()< getPuntuacion()) {
			posicion =-1;
		}else {
			posicion = 1;
		}
		
		return posicion;
	}
	
	
}
