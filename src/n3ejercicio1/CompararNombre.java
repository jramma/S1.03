package n3ejercicio1;

import java.util.Comparator;

public class CompararNombre implements Comparator <Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int i=0;
		if(o1.getNom().compareTo(o2.getNom())<0) {
			i = -1;
		}else {
			i=1;
		}

		return i;
	}

}
