package pekan5_2511532028;

import java.util.Scanner;

public class RumahSakit_2511532028 {
	
	
	public static void MenuRS_2028() {
		System.out.println("\n=====Menu Antrian Rumah Sakit=====");
		System.out.println("1. Daftarkan Pasien");
		System.out.println("2. Panggil Pasien");
		System.out.println("3. Tampilkan Pasien");
		System.out.println("4. Cari Pasien"); 
		System.out.println("5. Cek Status Antrian");
		System.out.println("6. Keluar");
		
	}
	
	
	static boolean cariPasien_2028(Pasien_2511532028 pasien, Scanner s) {
		Pasien_2511532028 bantu_2028 = pasien;
		if (pasien == null) {
			return false;
		}
		System.out.println("========Pencarian Nama Pasien========");
		System.out.print("Nama Pasien : ");
		String caripasien_2028 = s.nextLine();
		System.out.println("==================================\n");
		while (bantu_2028 != null) {
			if (caripasien_2028.equalsIgnoreCase(bantu_2028.pasien_2028)) {
				System.out.println("===========Data Pasien===========");
				System.out.println("Nama Pasien	: " + bantu_2028.pasien_2028);
				System.out.println("Keluhan Pasien	: "  + bantu_2028.keluhan_2028 );
				return true; 
				}
			bantu_2028 = bantu_2028.next_2028;
		}
		return false;
	}
	
	
	static void statusAntri_2028(Pasien_2511532028 pasien) {
		Pasien_2511532028 status_2028 = pasien;
		int banyakpasien_2028 = 0;
		System.out.println("==========Status Antrian==========");
		if (pasien == null)  {
			System.out.println("===={Pasien Tidak Ada}====");
			return ;
		}
		while (status_2028 != null) {
			++banyakpasien_2028;
			status_2028 = status_2028.next_2028;
		}
		System.out.print("Banyak Pasien : ");
		System.out.println(banyakpasien_2028);
	}
	
	
	public static void printAntri_2028(Pasien_2511532028 pasien) {
		Pasien_2511532028 antri_2028 = pasien;
		if (pasien == null) {
			System.out.println("Antrian kosong");
			return;
		}
		System.out.println("======Antrian Rumah Sakit======");
		while(antri_2028.next_2028 != null) {
			System.out.print(antri_2028.nomor_antri_2028 + ". " + antri_2028.pasien_2028 + 
					" [" +antri_2028.keluhan_2028 + "]" + " --> ");
			antri_2028 = antri_2028.next_2028;
		}
		if(antri_2028.next_2028 == null) {
			System.out.print(antri_2028.nomor_antri_2028 + ". " 
		+ antri_2028.pasien_2028 + " [" +antri_2028.keluhan_2028 + "]");
		}
		System.out.println();
	}
	
	
	public static Pasien_2511532028 MasukanPasien_2028(Pasien_2511532028 pasien, Scanner s) {
		//
		String nama_2028;
		String keluhan_2028;
		System.out.println("===========Data Pasien===========");
		System.out.print("Nama Pasien	: ");
		nama_2028 = s.nextLine();
		nama_2028 = nama_2028.substring(0,1).toUpperCase() + nama_2028.substring(1);
		System.out.print("Keluhan Pasien	: ");
		keluhan_2028 = s.nextLine();
		System.out.println();
		Pasien_2511532028 antribaru_2028 = new Pasien_2511532028(nama_2028, keluhan_2028);
		if (pasien == null) {
			antribaru_2028.nomor_antri_2028 = 1;
			return antribaru_2028;
		}
		Pasien_2511532028 lastantri = pasien;
		while (lastantri.next_2028 != null) {
			lastantri = lastantri.next_2028;
		}
		antribaru_2028.nomor_antri_2028 =
		        lastantri.nomor_antri_2028 + 1;
		lastantri.next_2028 = antribaru_2028;
		return pasien;
	}
	
	
	public static Pasien_2511532028 panggilPasien_2028(Pasien_2511532028 pasien) {
		if (pasien == null) {
			System.out.println("Antrian Kosong ");
			return null;
		}
		// head = head.next
		System.out.println("===========Data Pasien===========");
		System.out.println("Nama Pasien	: " + pasien.pasien_2028);
		System.out.println("Keluhan Pasien	: "  + pasien.keluhan_2028 );
		System.out.println("Status Pasien	: Sudah mendapat pelayanan atau pengobatan");
		pasien = pasien.next_2028;
		Pasien_2511532028 bantu = pasien;
		while (bantu != null) {
			bantu.nomor_antri_2028--;
		bantu = bantu.next_2028;
		}
		return pasien;
	}
	
	

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pasien_2511532028 pasien_2028 = null;
		int pilihan_2028;
		do {
			MenuRS_2028();
			System.out.print("Pilih menu : ");
			pilihan_2028 = s.nextInt();
			System.out.println();
			s.nextLine();
			
			switch (pilihan_2028) { 
				case 1:
					pasien_2028 = MasukanPasien_2028(pasien_2028,s);
					break;
				case 2:
					pasien_2028 = panggilPasien_2028(pasien_2028);
					break;
				case 3:
					printAntri_2028(pasien_2028);
					break;
				case 4:
					if (cariPasien_2028(pasien_2028,s))
						System.out.println("========{ketemu}========");
					else
						System.out.println("==={pasien tidak ada atau antrian kosong}===");
					break;
				case 5:
					statusAntri_2028(pasien_2028);
					break;
				case 6:
					System.out.println("===Anda Keluar dari Menu Antrian===");
					break;
				}
		
		} while (pilihan_2028 != 6);
		
	}
}
