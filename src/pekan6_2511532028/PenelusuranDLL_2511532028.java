package pekan6_2511532028;

public class PenelusuranDLL_2511532028 {
	static void forwardTraversal_2028(NodeDLL_2511532028 head) {
		// memulai penelusuran dari head
		NodeDLL_2511532028 curr_2028 = head;
		//lanjutkan sampai akhir
		while (curr_2028 != null) {
			//print data
			System.out.print(curr_2028.data_2028 + " <--> ");
			// pindah ke node berikutnya
			curr_2028 = curr_2028.next_2028;
		}
		System.out.println();
	}
	
	// fungsi penelusuran mundur
	static void backwardTraversal_2028(NodeDLL_2511532028 tail) {
		// mulai dari akhir
		NodeDLL_2511532028 curr_2028 = tail;
		// lanjut
		while (curr_2028 != null) {
			// cetak data
			System.out.print(curr_2028.data_2028 + " <--> ");
			// pindah ke node sebelumnya
			curr_2028 = curr_2028.prev_2028;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511532028 head_2028 = new NodeDLL_2511532028(1);
		NodeDLL_2511532028 second_2028 = new NodeDLL_2511532028(2);
		NodeDLL_2511532028 third_2028 = new NodeDLL_2511532028(3);
		
		head_2028.next_2028 = second_2028;
		second_2028.prev_2028 = head_2028;
		second_2028.next_2028 = third_2028;
		third_2028.prev_2028 = second_2028;
		
		System.out.println("Penelusuran maju : ");
		forwardTraversal_2028(head_2028);
		
		System.out.println("Penelusuran mundur : ");
		backwardTraversal_2028(third_2028);
	}

}
