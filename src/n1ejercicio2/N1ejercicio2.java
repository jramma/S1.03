package n1ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class N1ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		Iterator<Integer> it = numbers.iterator();
		int i=1;
		while(it.hasNext()) {
			  it.next();
			numbers2.add(numbers.get(numbers.size()-i));
			i++;
		}
		
		System.out.println(numbers);
		System.out.println(numbers2);
	}
}
