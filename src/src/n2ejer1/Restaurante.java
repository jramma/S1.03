package n2ejer1;

public class Restaurante {
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
	
	
}
