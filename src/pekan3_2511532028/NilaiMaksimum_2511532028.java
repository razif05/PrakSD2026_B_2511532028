package pekan3_2511532028;

import java.util.Stack;

public class NilaiMaksimum_2511532028 {
	public static int max_2511532028(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue = s.pop();
		backup.push(maxValue);
		while (!s.isEmpty()) {
			int next = s.pop();
			backup.push(next);
			maxValue = Math.max(maxValue, next);
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxValue;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("Isi stack	: " + s);
		System.out.println("Stack Teratas	: " + s.peek());
		System.out.println("Nilai Maksimum	: " + max_2511532028(s));
	}

}
