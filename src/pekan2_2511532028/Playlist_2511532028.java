package pekan2_2511532028;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532028 {
	public static void tambahLagu_2511532028(ArrayList<Musik_2511532028> lagubaru, Scanner sc) {
		String lagu_2028;
		String penyanyi_2028;
		int durasi_2028;
		
		System.out.print("Masukkan Lagu		: ");
		lagu_2028 = sc.nextLine();
		lagu_2028 = lagu_2028.substring(0,1).toUpperCase() + lagu_2028.substring(1);
		
		System.out.print("Masukkan Nama Penyanyi	: ");
		penyanyi_2028 = sc.nextLine();
		penyanyi_2028 = penyanyi_2028.substring(0,1).toUpperCase() + penyanyi_2028.substring(1);
		
		System.out.print("Masukkan Durasi(detik)	: ");
		durasi_2028 = sc.nextInt();
		sc.nextLine();
		
		lagubaru.add(new Musik_2511532028(lagu_2028, penyanyi_2028, durasi_2028));
		System.out.println(" Lagu berhasil di tambahkan "); 
		
	}
	
	
	public static void tampilkanMenuPlaylist_2511532028() {
		System.out.println("\nMenu Playlist : ");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Tampilkan Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}
	
	public static void tampilkanLagu_2511532028(ArrayList<Musik_2511532028> lagubaru) {
		if(lagubaru.isEmpty()) {
			System.out.println("Playlist masih kosong");
		} else {
			System.out.println("======Playlist Lagu (2511532028)======");
			for(int i = 0; i < lagubaru.size(); i++) {
				System.out.println((i+1)+ ". " + lagubaru.get(i));
			}
		}
	}
	
	public static void hapusLagu_2511532028(ArrayList<Musik_2511532028> lagubaru, Scanner sc) {
		System.out.print("Masukkan urutan lagu keberapa yang ingin di hapus : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index <= lagubaru.size()) {
			lagubaru.remove(index);
			System.out.println("Lagu berhasil dihapus dari playlist");
		} else {
			System.out.println("Diluar kapasitas lagu yang ada dalam playlist");
		}
	}
	
	public void banyakLagu_2511532028(ArrayList<Musik_2511532028> lagubaru, Scanner sc) {
		System.out.println("Ada "+lagubaru.size() +" lagu di playlist kamu " );
	}
	

	public static void main(String[] args) {
		ArrayList<Musik_2511532028> PlaylistLagu_2028 = new ArrayList<Musik_2511532028>();
		Scanner i = new Scanner(System.in);
		int choice;
		
		do { 
			tampilkanMenuPlaylist_2511532028();
			System.out.print("Pilih menu : ");
			choice = i.nextInt();
			i.nextLine();
			
			
			switch (choice) {
				case 1:
					tambahLagu_2511532028(PlaylistLagu_2028, i);
					break;
				case 2:
					tampilkanLagu_2511532028(PlaylistLagu_2028);
					break;
				case 3:
					hapusLagu_2511532028(PlaylistLagu_2028, i);
					break;
				case 4:
					System.out.println("Keluar dari program lagu.");
					break;
						
			}
		} while (choice != 5);
		i.close();
	}


	}


