package pekan4_2511532028;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532028 {
	public static void main(String[] args) {
		Queue<Integer> q_2028 = new LinkedList<Integer>();
		q_2028.add(1);
		q_2028.add(2);
		q_2028.add(3);
		System.out.println("Sebelum rever : " + q_2028);
		Stack<Integer> s_2028 = new Stack<Integer>();
		while(!q_2028.isEmpty()) {
			s_2028.push(q_2028.remove());
		}
		while(!s_2028.isEmpty()) {
			q_2028.add(s_2028.pop());
		}
		System.out.println("Sesudah reverse : " + q_2028);
	}

}
