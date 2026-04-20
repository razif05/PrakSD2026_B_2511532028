package pekan3_2511532028;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511532028 {
	
	// pilihan menu pada browser
	public static void tampilkanMenuBrowser_2511532028() {
		System.out.println("\n=====Menu Browser=====");
		System.out.println("1. Kunjungi Website");
		System.out.println("2. Balik ke Website Sebelumnya");
		System.out.println("3. Lihat Halaman Aktif");
		System.out.println("4. Keluar");
	}
	
	// Untuk mengunjungi website dengan judul dan URL
	public static void  kunjungiWebsite_2028(Stack<Website_2511532028> Web, Scanner sc) {
		String judul;
		String url;
		
		System.out.print("\nMasukkan Judul Web	: ");
		judul = sc.nextLine();
		
		System.out.print("Masukkan URL		: ");
		url = "https://" + sc.nextLine();
		
		Web.push(new Website_2511532028(judul , url));
		System.out.println("Website Dibuka");
	}
	
	// perintah kembali ke website sebelumnya
	public static void tombolbackWebsite_2028(Stack<Website_2511532028> Web) {
		if (!Web.isEmpty()) {
			Web.pop();
			System.out.println("---(Anda balik ke Website sebelumnya)---");
		} else {
			System.out.println("---(Anda belum mengunjungi Website apapun)---");
		}
	}
	
	// menampilkan website yang saat ini dibuka
	public static void tampilWebsite_2028(Stack<Website_2511532028> Web) {
		if (!Web.isEmpty()) {
			System.out.println("\n====Website saat ini====");
			System.out.println(Web.peek().toString());
		} else {
			System.out.println("---(Anda belum mengunjungi Website apapun)---");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		Stack<Website_2511532028> Website = new Stack<Website_2511532028>();
		int choice;
		
		do { 
			tampilkanMenuBrowser_2511532028();
			System.out.print("Pilih menu : ");
			choice = i.nextInt();
			i.nextLine();
			
			// Untuk memilih menu 
			switch (choice) {
				case 1:
					kunjungiWebsite_2028(Website, i);
					break;
				case 2:
					tombolbackWebsite_2028(Website);
					break;
				case 3:
					tampilWebsite_2028(Website);
					break;
				case 4:
					System.out.println("---(Keluar dari program browser)---");
					break;
						
			}
		} while (choice != 5);
		i.close();
	}

}
