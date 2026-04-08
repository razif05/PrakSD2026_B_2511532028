package pekan3_2511532028;

import java.util.Stack;
import java.util.Scanner;

public class StackPostfix_2511532028 {
	public static int postfixEvaluate_2511532028( String expression ) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				s.push(input.nextInt());
			} else {
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+")) {
					s.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s.push(operand1 * operand2);
				} else {
					s.push(operand1 / operand2);
				}
			}
		}
		input.close();
		return s.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_2511532028("5 2 4 * + 7 -"));
	}

}
