package pekan5_2511532028;

public class TambahSLL_2511532028 {
	
	public static NodeSLL_2511532028 insertAtFront_2028(NodeSLL_2511532028 head, int value) {
		NodeSLL_2511532028 new_node_2028 = new NodeSLL_2511532028(value);
		new_node_2028.next_2028 = head;
		return new_node_2028;
	}
	
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532028 insertAtEnd_2028(NodeSLL_2511532028 head, int value) {
		// buat sebuah node dengan nilai
		NodeSLL_2511532028 newNode_2028 = new NodeSLL_2511532028(value);
		// jika list kosong maka node jadi head
		if (head == null) {
			return newNode_2028;
		}
		
		// simpan head ke variabel sementara
		NodeSLL_2511532028 last_2028 = head;
		// telusuri ke node akhir
		while(last_2028.next_2028 != null) {
			last_2028 = last_2028.next_2028;
		}
		
		// ubah pointer
		last_2028.next_2028 = newNode_2028;
		return head;
	}
	
	static NodeSLL_2511532028 GetNode_2028(int data) {
		return new NodeSLL_2511532028(data);
	}
	
	static NodeSLL_2511532028 insertPos_2028(NodeSLL_2511532028 headNode, int position, int value) {
		NodeSLL_2511532028 head_2028 = headNode;
		if(position < 1)
			System.out.print("Invalid position");
		if(position == 1) {
			NodeSLL_2511532028 new_node_2028 = new NodeSLL_2511532028(value);
			new_node_2028.next_2028 = head_2028;
			return new_node_2028;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					NodeSLL_2511532028 newNode_2028 = GetNode_2028(value);
					newNode_2028.next_2028 = headNode.next_2028;
					headNode.next_2028 = newNode_2028;
					break;
				}
				headNode = headNode.next_2028;
			}
			if (position != 1) 
				System.out.print("posisi di luar jangkauan ");
		}
		return head_2028;
	}
	
	public static void printList_2028(NodeSLL_2511532028 head) {
		NodeSLL_2511532028 curr_2028 = head;
		while(curr_2028.next_2028 != null) {
			System.out.print(curr_2028.data_2028+"-->");
			curr_2028 = curr_2028.next_2028;
		}
		if(curr_2028.next_2028 == null) {
			System.out.print(curr_2028.data_2028);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// buat linked list 2->3->5->6
		NodeSLL_2511532028 head_2028 = new NodeSLL_2511532028(2);
		head_2028.next_2028 = new NodeSLL_2511532028(3);
		head_2028.next_2028.next_2028 = new NodeSLL_2511532028(5);
		head_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(6);
		// cetak list asli
		System.out.print("senarai berantai awal : ");
		printList_2028(head_2028);
		// tambah node baru di depan
		System.out.print("tambah 1 simpul di depan : ");
		int data_2028 = 1;
		head_2028 = insertAtFront_2028(head_2028, data_2028);
		// cetak updatelist
		printList_2028(head_2028);
		
		// tambah node baru di belakanag
		System.out.print("tambah 1 simpul di belakang : ");
		int data2_2028 = 7;
		head_2028 = insertAtEnd_2028(head_2028, data2_2028);
		// cetak update list
		printList_2028(head_2028);
		
		
		System.out.print("tambah 1 simpul ke data 4 : ");
		int data3_2028 = 4;
		int pos_2028 = 4;
		head_2028 = insertPos_2028(head_2028,pos_2028,data3_2028);
		// cetak update list
		printList_2028(head_2028);

	}

}
