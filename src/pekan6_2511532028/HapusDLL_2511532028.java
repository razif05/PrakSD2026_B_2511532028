package pekan6_2511532028;

public class HapusDLL_2511532028 {
	// fungsi menghapus node awal
	public static NodeDLL_2511532028 delHead_2028(NodeDLL_2511532028 head) {
		if (head == null)
			return null;
		//NodeDLL_2511532028 temp_2028 = head;
		head = head.next_2028;
		if (head != null) {
			head.prev_2028 = null;
		}
		return head;
	}
	
	// fungsi menghapus di akhir
	public static NodeDLL_2511532028 delLast_2028(NodeDLL_2511532028 head) {
		if (head == null) {
			return null;
		}
		if (head.next_2028 == null) {
			return null;
		}
		NodeDLL_2511532028 curr_2028 = head;
		while (curr_2028.next_2028 != null) {
			curr_2028 = curr_2028.next_2028;
		}
		// update pointer previous node
		if (curr_2028.prev_2028 != null) {
			curr_2028.prev_2028.next_2028 = null;
		}
		return head;
	}
	
	public static NodeDLL_2511532028 delPos_2028(NodeDLL_2511532028 head, int pos) {
		if (head == null) {
			return head;
		}
		NodeDLL_2511532028 curr_2028 = head;
		for (int i = 1; curr_2028 != null && i < pos; ++i) {
			curr_2028 = curr_2028.next_2028;
		}
		if (curr_2028 == null) {
			return head;
		}
		
		if (curr_2028.prev_2028 != null) {
			curr_2028.prev_2028.next_2028 = curr_2028.next_2028;
		}
		if (curr_2028.next_2028 != null) {
			curr_2028.next_2028.prev_2028 = curr_2028.prev_2028;
		}
		
		if (head == curr_2028) {
			head = curr_2028.next_2028;
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
		NodeDLL_2511532028 head_2028 = new NodeDLL_2511532028(1);
		head_2028.next_2028 = new NodeDLL_2511532028(2);
		head_2028.next_2028.prev_2028 = head_2028;
		head_2028.next_2028.next_2028 = new NodeDLL_2511532028(3);
		head_2028.next_2028.next_2028.prev_2028 = head_2028.next_2028;
		head_2028.next_2028.next_2028.next_2028 = new NodeDLL_2511532028(4);
		head_2028.next_2028.next_2028.next_2028.prev_2028 = head_2028.next_2028.next_2028;
		head_2028.next_2028.next_2028.next_2028.next_2028 = new NodeDLL_2511532028(5);
		head_2028.next_2028.next_2028.next_2028.next_2028.prev_2028 = head_2028.next_2028.next_2028.next_2028;
		
		System.out.print("DLL Awal : ");
		printlist_2028(head_2028);
		
		System.out.print("Setelah head di hapus : ");
		head_2028 = delHead_2028(head_2028);
		printlist_2028(head_2028);
		
		System.out.print("Setelah node terakhir di hapus : ");
		head_2028 = delLast_2028(head_2028);
		printlist_2028(head_2028);
		
		System.out.print("menghapus node ke-2 : ");
		head_2028 = delPos_2028(head_2028, 2);
		
		printlist_2028(head_2028);
	}

}
