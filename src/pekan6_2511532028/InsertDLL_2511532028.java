package pekan6_2511532028;

public class InsertDLL_2511532028 {
	
	static NodeDLL_2511532028 InsertBegin_2028(NodeDLL_2511532028 head, int data) {
		// buat mode baru
		NodeDLL_2511532028 new_node_2028 = new NodeDLL_2511532028(data);
		
		// 
		new_node_2028.next_2028 = head;
		// jadikan printer prev head ke new node
		if (head != null) {
			head.prev_2028 = new_node_2028;
		}
		
		return new_node_2028;
	}
	
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511532028 InsertEnd_2028(NodeDLL_2511532028 head, int newData) {
		// buat node baru
		NodeDLL_2511532028 newNode_2028 = new NodeDLL_2511532028(newData);
		// jika dll null jadikan head
		if (head == null) {
			head = newNode_2028;
		}
		else {
			NodeDLL_2511532028 curr_2028 = head;
			while (curr_2028.next_2028 != null) {
				curr_2028 = curr_2028.next_2028;
			}
			curr_2028.next_2028 = newNode_2028;
			newNode_2028.prev_2028 = curr_2028;
		}
		return head;
	}
	
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532028 InsertAtPosition_2028(NodeDLL_2511532028 head, int pos, int new_data) {
		// buat node baru
		NodeDLL_2511532028 new_node_2028 = new NodeDLL_2511532028(new_data);
		if (pos == 1) {
			new_node_2028.next_2028 = head;
			if (head != null) {
				head.prev_2028 = new_node_2028;
			}
			head = new_node_2028;
			return head;
		}
		NodeDLL_2511532028 curr_2028 = head;
		for (int i = 1; i < pos - 1 && curr_2028 != null; i++) {
			curr_2028 = curr_2028.next_2028;
		}
		if (curr_2028 == null) {
			System.out.println("Posisi tidak ada");
			return head;
		}
		new_node_2028.prev_2028 = curr_2028;
		new_node_2028.next_2028 = curr_2028.next_2028;
		curr_2028.next_2028 = new_node_2028;
		if (new_node_2028.next_2028 != null) {
			new_node_2028.next_2028.prev_2028 = new_node_2028;
		}
		return head;
	}
	
	public static void printlist_2028(NodeDLL_2511532028 head) {
		NodeDLL_2511532028 curr_2028 = head;
		while (curr_2028 != null) {
			System.out.print(curr_2028.data_2028 + " <--> ");
			curr_2028 = curr_2028.next_2028;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// membuat dll 2 <->
		NodeDLL_2511532028 head_2028 = new NodeDLL_2511532028(2);
		head_2028.next_2028 = new NodeDLL_2511532028(3);
		head_2028.next_2028.prev_2028 = head_2028;
		head_2028.next_2028.next_2028 = new NodeDLL_2511532028(5);
		head_2028.next_2028.next_2028.prev_2028 = head_2028.next_2028;
		// Cetak DLL awal
		System.out.print("DLL Awal : ");
		printlist_2028(head_2028);
		// tambal 1 di awal
		head_2028 = InsertBegin_2028(head_2028, 1);
		System.out.print("simpul 1 di tambah di awal : ");
			printlist_2028(head_2028);
		// tambah 6 di akhir
		System.out.print("simpul 6 di tambah di akhir : ");
		int data_2028 = 6;
		head_2028 = InsertEnd_2028(head_2028, data_2028);
		printlist_2028(head_2028);
		// menambah node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4 : ");
		int data2_2028 = 4;
		int pos_2028 = 4;
		head_2028 = InsertAtPosition_2028(head_2028, pos_2028, data2_2028);
		printlist_2028(head_2028);
		
		
		

	}

}
