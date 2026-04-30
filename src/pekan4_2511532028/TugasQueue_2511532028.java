package pekan4_2511532028;

import java.util.Scanner;

public class TugasQueue_2511532028 {
	Scanner i = new Scanner(System.in);
	int front_2028, rear_2028, size_2028;
	int kapasitas_2028;
	String antri_2028[];
	// String pelanggan_2028;
	
	public TugasQueue_2511532028(int kapasitas) {
		this.kapasitas_2028 = kapasitas;
		front_2028 = this.size_2028 = 0;
		rear_2028 = kapasitas - 1;
		antri_2028 = new String[this.kapasitas_2028];
	}
	
	public static void MenuAntri_2028() {
		System.out.println("\n=====Menu Antrian Loket Pelayanan=====");
		System.out.println("1. Tambah Pelanggan");
		System.out.println("2. Hapus Pelanggan");
		System.out.println("3. Reverse Antrian Pelanggan");
		System.out.println("4. Tampilkan Antrian");
		System.out.println("5. Keluar");
	}
	
	boolean isEmpty(TugasQueue_2511532028 q) {
		return (q.size_2028 == 0);
	}
	
	boolean isFull(TugasQueue_2511532028 q) {
		return (q.size_2028 == q.kapasitas_2028);
	}
	
	public void enqueue_2028(Scanner i) {
		if(isFull(this)) {
			System.out.println("Antrian Penuh");
			return;
		}
		this.rear_2028 = (this.rear_2028 + 1) % this.kapasitas_2028;	
		System.out.print("Masukkan nama pelanggan : ");
		String pelanggan_2028  = i.nextLine();
		this.antri_2028[this.rear_2028] = pelanggan_2028;
		this.size_2028 = this.size_2028 + 1;
		System.out.println(pelanggan_2028 + " berhasil di tambahkan");
	}
	
	public String dequeue_2028() {
		if(isEmpty(this)) {
			System.out.println("Antrian Kosong");
			return null;
		}
		String pelanggan_2028 = this.antri_2028[this.front_2028];
		this.front_2028 = (this.front_2028 + 1) % this.kapasitas_2028; // Circular Queue : saat front == kapasitas, front balik ke index 0
		this.size_2028 = this.size_2028 - 1;
		System.out.println(pelanggan_2028 + " sudah diberikan pelayanan loket");
		return pelanggan_2028;
	}
	
	public void reverseAntri_2028() {
		System.out.println("====Hasil Reverse Antrian====");
		for(int i = 0; i < this.size_2028; i++) {
			if (i == (this.size_2028/2))
				break;
			String temp = this.antri_2028[this.front_2028+i];
			this.antri_2028[this.front_2028+i] = this.antri_2028[this.rear_2028-i];
			this.antri_2028[this.rear_2028-i] = temp;
			
			//System.out.print((hasil_2028) + " ");
		}
		System.out.print("[ ");
		for(int i = 0; i < this.size_2028; i++) {
			System.out.print(" " + this.antri_2028[this.front_2028+i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	public void Tampilkan_2028() {
		System.out.println("====Tampilan dari Antrian Loket====");
		System.out.print("[ ");
		for(int i = 0; i < this.size_2028; i++) {
			System.out.print(this.antri_2028[this.front_2028 + i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	

}
