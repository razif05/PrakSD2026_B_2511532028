package pekan4_2511532028;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511532028 {

	public static void main(String[] args) {
		Queue<Integer> q_2028 = new LinkedList<>();
		// tambah elemen dengan loop (0,1,2,3,4,5)
		for(int i = 0; i < 6; i++)
			q_2028.add(i);
		// Menampilkan Antrian
		System.out.println("Elemen Antian = " + q_2028);
		// menghapus antrian terdepan 
		int hapus = q_2028.remove();
		System.out.println("Hapus elemen = " + hapus);
		System.out.println(q_2028);
		// melihat elemen/antrian di deoan
		int depan = q_2028.peek();
		System.out.println("Kepala Antrian = " + depan);
		
		int banyak = q_2028.size();
		System.out.println("Size Antrian = " + banyak);
	}

}
