package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MesesMain {

	public static void main(String[] args) {
		Month enero = new Month("enero");
		Month febrero = new Month("febrero");
		Month marzo = new Month("marzo");
		Month abril = new Month("abril");
		Month mayo = new Month("mayo");
		Month junio = new Month("junio");
		Month julio = new Month("julio");
		Month septiembre = new Month("septiembre");
		Month octubre = new Month("octubre");
		Month noviembre = new Month("noviembre");
		Month diciembre = new Month("diciembre");
		ArrayList<Month> meses = new ArrayList<Month>();
		meses.add(enero);
		meses.add(febrero);
		meses.add(marzo);
		meses.add(abril);
		meses.add(mayo);
		meses.add(junio);
		meses.add(julio);
		meses.add(septiembre);
		meses.add(octubre);
		meses.add(noviembre);
		meses.add(diciembre);
		System.out.println(meses);
		Month agosto = new Month("agosto");
		System.out.println("    meses.add(8, agosto); en ArrayList>");
		meses.add(8, agosto);

		System.out.println(meses);
		System.out.println("-----------------");
		System.out.println("-----------------");

		HashSet<Month> meses1 = new HashSet<Month>(meses);
		meses1.add(diciembre);
		meses.add(diciembre);
		System.out.println("Trato de duplicar diciembre en ArrayL y HashSet:");
		System.out.println(meses);
		System.out.println(meses1);
		System.out.println("HashSet no tiene diciembre duplicado*");
		System.out.println("-----------------------------------------------------");
		System.out.println("Bucle for e iterator:");
		for (int i = 0; i < meses1.size(); i++) {
			System.out.print(meses.get(i) + " ");
		}
		System.out.println(" ");
		Iterator<Month> it = meses1.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
