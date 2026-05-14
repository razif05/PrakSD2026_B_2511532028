package pekan6_2511532028;

import java.util.Scanner;

public class Musik_2511532028 {
	Scanner i = new Scanner(System.in);
	
	public static Lagu_2511532028 tambahLagu_2028(Lagu_2511532028 lagu, Scanner i) {
		System.out.println("============Tambah Lagu============");
		String judul_2028;
		String penyanyi_2028;
		
		System.out.print("Judul Lagu	: " );
		judul_2028 = i.nextLine();
		System.out.print("Nama Penyanyi	: ");
		penyanyi_2028 = i.nextLine();
		Lagu_2511532028 newLagu_2028 = new Lagu_2511532028(judul_2028, penyanyi_2028);
		if (lagu == null) {
			return newLagu_2028;
		}
		Lagu_2511532028 tail_2028 = lagu;	
		
		while (tail_2028.next_2028 != null) {
			tail_2028 = tail_2028.next_2028;
		}
		
		tail_2028.next_2028 = newLagu_2028;
		newLagu_2028.prev_2028 = tail_2028;
		System.out.println("====Lagu Berhasil Ditambahkan====");
		return lagu;	
		
	}
	
	public static Lagu_2511532028 hapusLaguAwal_2028(Lagu_2511532028 lagu) {
		if (lagu == null ) {
			System.out.println("List lagu kosong");
			return null;
		}
		Lagu_2511532028 hapuslagu_2028 = lagu;
		System.out.println("============Hapus Lagu============");
		System.out.println("Lagu	: " + hapuslagu_2028.judul_2028 
				+ "\nPenyanyi	: " + hapuslagu_2028.penyanyi_2028);
		System.out.println("==========Berhasil dihapus==========");
		hapuslagu_2028 = hapuslagu_2028.next_2028;
		if (hapuslagu_2028 != null) {
			hapuslagu_2028.prev_2028 = null;
		}
		return hapuslagu_2028;
	}
	
	public static void tampilMaju_2028(Lagu_2511532028 lagu) {
		if (lagu == null) {
			System.out.println("List Playlist kosong");
			return;
		}
		System.out.println("============List Playlist Lagu Dari Awal============");
		Lagu_2511532028 currlagu_2028 = lagu;
		while (currlagu_2028 != null) {
			System.out.print(currlagu_2028.judul_2028 + "-" + currlagu_2028.penyanyi_2028 + " <--> ");
			currlagu_2028 = currlagu_2028.next_2028;
		}
		System.out.println();
	}
	
	public static void tampilMundur_2028(Lagu_2511532028 lagu) {
		if (lagu == null) {
			System.out.println("List Playlist kosong");
			return;
			}
		System.out.println("============List Playlist Lagu Dari Akhir============");
		Lagu_2511532028 back_2028 = lagu;
		
		while (back_2028.next_2028 != null) {
			back_2028 = back_2028.next_2028;
		}
		
		while ( back_2028 != null) {
			System.out.print(back_2028.judul_2028 + "-" + back_2028.penyanyi_2028 + " <--> ");
			back_2028 = back_2028.prev_2028;
		}	
		System.out.println();
	}
	
	public static boolean cariLagu_2028(Lagu_2511532028 lagu, Scanner i) {
		if (lagu == null) {return false;}
		Lagu_2511532028 currlagu_2028 =  lagu;
		String judul_2028;
		System.out.println("============Cari Lagu============");
		System.out.print("Judul Lagu	: ");
		judul_2028 = i.nextLine();
		while (currlagu_2028 != null) {
			if (judul_2028.equalsIgnoreCase(currlagu_2028.judul_2028)) {
			System.out.println("Judul Lagu	: " + currlagu_2028.judul_2028);
			System.out.println("Penyanyi Lagu	: " + currlagu_2028.penyanyi_2028);
			return true;
			}
			currlagu_2028 = currlagu_2028.next_2028;
		}
		return false;
	}
	
	public static void MenuMusik_2028() {
		System.out.println("\n=====Menu Playlist Musik=====");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Hapus Lagu Pertama");
		System.out.println("3. Liat Playlist (dari awal)");
		System.out.println("4. Liat Playlist (dari akhir)"); 
		System.out.println("5. Cari Lagu");
		System.out.println("6. Keluar");
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Lagu_2511532028 Lagu_2028 = null;
		int pilihan_2028;
		do {
			MenuMusik_2028();
			System.out.print("Pilih menu : ");
			pilihan_2028 = s.nextInt();
			System.out.println();
			s.nextLine();
			
			switch (pilihan_2028) { 
				case 1:
					Lagu_2028 = tambahLagu_2028(Lagu_2028,s);
					break;
				case 2:
					Lagu_2028 = hapusLaguAwal_2028(Lagu_2028);
					break;
				case 3:
					tampilMaju_2028(Lagu_2028);
					break;
				case 4:
					tampilMundur_2028(Lagu_2028);
					break;
				case 5:
					if (cariLagu_2028(Lagu_2028,s)) {
						System.out.println("====ketemu====");
					} else {
						System.out.println("====tidak ketemu atau list kosong====");
					}
					break;
				case 6:
					System.out.println("===Anda Keluar dari Menu Playlist===");
					break;
				}
		
		} while (pilihan_2028 != 6);
		
	}

}
