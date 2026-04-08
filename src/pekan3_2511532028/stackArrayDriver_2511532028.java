package pekan3_2511532028;

public class stackArrayDriver_2511532028 {

	public static void main(String[] args) {
		stackArray_2511532028 s = new stackArray_2511532028();
		s.push_2511532028(10);
		s.push_2511532028(20);
		s.push_2511532028(30);
		System.out.print("Elemen pada Stack : ");
		s.print_2511532028();
		System.out.println("\n" + s.pop_2511532028() + " dikeluarkan dari stack ");
		System.out.println("Elemen teratas adalah : " + s.peek_2511532028());
		System.out.print("Elemen pada stack : ");
		s.print_2511532028();

	}

}
