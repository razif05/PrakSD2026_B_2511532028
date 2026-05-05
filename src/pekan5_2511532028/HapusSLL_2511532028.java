package pekan5_2511532028;

public class HapusSLL_2511532028 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511532028 deleteHead_2028(NodeSLL_2511532028 head) {
		// jika SLL kosong
		if (head == null)
			return null;
		// pindahkan head ke node berikutnya
		head = head.next_2028;
		// return head ke node berikutnya 
		return head;
	}
	
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532028 removeLastNode(NodeSLL_2511532028 head) {
		// jika list kosong, return null
		if (head == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head.next_2028 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511532028 secondLast_2028 = head;
		while (secondLast_2028.next_2028.next_2028 != null) {
			secondLast_2028 = secondLast_2028.next_2028;
		}
		// hapus node terakhir
		secondLast_2028.next_2028 = null;
		return head;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532028 deleteNode_2028(NodeSLL_2511532028 head, int position) {
		NodeSLL_2511532028 temp_2028 = head;
		NodeSLL_2511532028 prev_2028 = null;
		// jika linked list null
		if (temp_2028 == null)
			return head;
		// kasus 1 : head di hapus
		if (position == 1) {
			head = temp_2028.next_2028;
			return head;
		}
		// kasus 2 :  menghapus node di tengah
		// telusuri ke node yang di hapus
		
		for(int i = 1; temp_2028 != null && i < position; i++) {
			prev_2028 = temp_2028;
			temp_2028 = temp_2028.next_2028;
		}
		// jika di temukan, hapus node
		if (temp_2028 != null) {
			prev_2028.next_2028 = temp_2028.next_2028;
		} else {
			System.out.println("Data tidak ada ");
		}
		return head;
	}
	// fungsi mencetak SLL
	public static void printList_2028(NodeSLL_2511532028 head) {
		NodeSLL_2511532028 curr_2028 = head;
		while (curr_2028.next_2028  != null) {
			System.out.print(curr_2028.data_2028 + " --> ");
			curr_2028 = curr_2028.next_2028;
		}
		if (curr_2028.next_2028 == null) {
			System.out.print(curr_2028.data_2028);
		}
		System.out.println();
	}
	
	// kelas main
	public static void main(String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5
		NodeSLL_2511532028 head_2028 = new NodeSLL_2511532028(1);
		head_2028.next_2028 = new NodeSLL_2511532028(2);
		head_2028.next_2028.next_2028 = new NodeSLL_2511532028(3);
		head_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(4);
		head_2028.next_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(5);
		head_2028.next_2028.next_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(6);
		// cetak list awal
		System.out.println("List awal :");
		printList_2028(head_2028);
		// hapus head
		head_2028 = deleteHead_2028(head_2028);
		System.out.println("List setelah head di hapus : ");
		printList_2028(head_2028);
		// hapus node terakhir
		head_2028 = removeLastNode(head_2028);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_2028(head_2028);
		// hapus node pada posisi 2
		int position_2028 = 2;
		head_2028 = deleteNode_2028(head_2028, position_2028);
		// print list setelah di hapus
		System.out.println("List setelah posisi 2 dihapus : ");
		printList_2028(head_2028);
	}

}
