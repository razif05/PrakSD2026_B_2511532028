package pekan4_2511532028;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class IteratorQueue_2511532028 {

	public static void main(String[] args) {
		Queue<String> q_2028 = new LinkedList<>();
		
		q_2028.add("Praktikum");
		q_2028.add("Struktur");
		q_2028.add("Data");
		q_2028.add("Dan");
		q_2028.add("Algoritma");
		Iterator<String> iterator_2028 = q_2028.iterator();
		while (iterator_2028.hasNext()) {
			System.out.print(iterator_2028.next() + " ");
		}

	}

}
