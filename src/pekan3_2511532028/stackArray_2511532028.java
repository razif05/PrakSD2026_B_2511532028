package pekan3_2511532028;

public class stackArray_2511532028 {
	static final int max = 1000;
	int top;
	int a[] = new int[max];
	boolean isEmpty_2511532028()
	{
		return (top < 0);
	}
	stackArray_2511532028()
	{
		top = -1;
	}
	boolean push_2511532028(int x) 
	{
		if (top >= (max -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x+ " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2511532028()
	{
		if (top < 0) {
			System.out.print("Stack Underflow");
			return 0;
		}
		else  {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511532028() 
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print_2511532028() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
	}
}
