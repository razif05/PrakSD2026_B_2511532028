package pekan1_2511532028;

import java.util.Scanner;

public class JamDriver2_2511532028 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("=== Program Driver Objek Jam ===");
		// 1. input jam pertama
		System.out.println("\n--- Input Jam ---");
		Jam_2511532028 j1 = buatJamDariInput(i);
		
		// w. Input Jam Kedua
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511532028 j2 = buatJamDariInput(i);
		
		// 3. Menampilkan Data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)			: " + j1.toString());
		System.out.println("Jam 2 (String)			: " + j2.toString());
		System.out.println("Jam 1 dalam detik		: " + j1.toSeconds());
		System.out.println("Jam 2 dalam detik		: " + j2.toSeconds());
		
		// 4. Operasi Relasional (perbandingan)
		int perbadingan = j1.compareTo(j2);
		if(perbadingan > 0) {
			System.out.println("Status					: Jam 1 lebih lambat (setelah) Jam 2");	
		} else if (perbadingan < 0  ) {
			System.out.println("Status					: Jam 1 lebih awal (setelah) Jam 2");
		}else {
			System.out.println("Status					: Jam 1 dan Jam 2 sama persis");
		}
		
		// 5. Operasi Aritmatika
		System.out.println("Durasi (J1 ke J2)			: " + Jam_2511532028.durasiDetik(j1, j2) + " detik" );
		
		Jam_2511532028 jNext = j1.nextSecond();
		System.out.println("Jam 1 Detik Berikutnya 		: " + jNext);
		
		Jam_2511532028 jPrev = j1.prevSecond();
		System.out.println("Jam 1 Detik Sebelumnya 		: " + jPrev);
		
		//6. Operasi Penjumlahan Jam
		Jam_2511532028 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 = J2				: " + jHasilPlus);
		
		i.close();
		System.out.println("\nProgram Selesai.");
	}
	
	
	private static Jam_2511532028 buatJamDariInput(Scanner sc) {
		int h, m, s;
		while (true) {
			System.out.print("Masukkan Jam (0-23)		: ");
			h = sc.nextInt();
			System.out.print("Masukkan Menit (0-59)		: ");
			m = sc.nextInt();
			System.out.print("Masukkan Detik (0-59)		: ");
			s = sc.nextInt();
			
			// memanggil method isValid
			if (Jam_2511532028.isValid(h, m, s)) {
				return new Jam_2511532028(h, m, s);
			} else {
				System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
			}
		}
	}
}
