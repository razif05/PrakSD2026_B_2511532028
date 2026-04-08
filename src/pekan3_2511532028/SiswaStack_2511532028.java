package pekan3_2511532028;

import java.util.ArrayList;

class Siswa_2511532028{
	String nama;
	int nim;
	
	public Siswa_2511532028(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim : " + nim + " Nama : " + nama;
	}
}

public class SiswaStack_2511532028 {
	private ArrayList<Siswa_2511532028> stack;
	
	public SiswaStack_2511532028() {
		stack = new ArrayList<>();
	}
	
	public void push(Siswa_2511532028 mhs) {
		stack.add(mhs);
	}

	public Siswa_2511532028 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}

	public Siswa_2511532028 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String[] args) {
		SiswaStack_2511532028 studentStack = new SiswaStack_2511532028();
		
		Siswa_2511532028 mhs1 = new Siswa_2511532028("Adi", 1);
		Siswa_2511532028 mhs2 = new Siswa_2511532028("Boby", 2);
		Siswa_2511532028 mhs3 = new Siswa_2511532028("Charles", 3);
		
		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);
		
		System.out.println("Siswa di dalam stack : " );
		studentStack.tampilkanSiswa();
		
		System.out.println("Siswa teratas				: " + studentStack.peek());
		System.out.println("Mengeluarkan siswa teratas dari stack	: " + studentStack.pop());
		System.out.println("Daftar siswa setelah di pop : ");
		studentStack.tampilkanSiswa();
	}
}
