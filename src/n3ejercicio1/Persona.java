package n3ejercicio1;

public class Persona implements Comparable <Persona>{

	private String nom;
	private String cognom;
	private String dni;

	public Persona(String nom, String cognom, String dni) {
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", dni=" + dni + "]";
	}
	
	@Override
	public int compareTo(Persona o) {
		int i = 0;
		if (Character.getNumericValue(o.getDni().charAt(0)) < Character.getNumericValue(getDni().charAt(0))) {
			i = 1;
		} else {
			i = -1;
		}

		return i;
	}

}
