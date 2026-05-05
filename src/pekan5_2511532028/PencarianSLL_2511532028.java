package pekan5_2511532028;

public class PencarianSLL_2511532028 {
	static boolean searchKey_2028(NodeSLL_2511532028 head, int key) {
		NodeSLL_2511532028 curr_2028 = head;
		while (curr_2028 != null) {
			if (curr_2028.data_2028 == key)
				return true;
			curr_2028 = curr_2028.next_2028;
		}
		return false;
	}
	
	public static void traversal(NodeSLL_2511532028 head) {
		// mulai dari head
		NodeSLL_2511532028 curr_2028 = head;
		// telusuri sampai pointer null
		while (curr_2028 != null) {
			System.out.print(" " + curr_2028.data_2028);
			curr_2028 = curr_2028.next_2028;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2511532028 head_2028 = new NodeSLL_2511532028(14);
		head_2028.next_2028 = new NodeSLL_2511532028(21);
		head_2028.next_2028.next_2028 = new NodeSLL_2511532028(13);
		head_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(30);
		head_2028.next_2028.next_2028.next_2028.next_2028 = new NodeSLL_2511532028(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head_2028);
		// data yang akan di cari
		int key_2028 = 30;
		System.out.print("cari data " + key_2028 + " = ");
		if (searchKey_2028(head_2028, key_2028))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada ");
	}

}
