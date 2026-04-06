package pekan1_2511532028;

import java.util.Scanner;

public class driverMobil_2511532028 {

	public static void main(String[] args) {
			Scanner i = new Scanner(System.in);
			String jawab;
			
			mobilADT_2511532028 garasi = new mobilADT_2511532028("", 0, "", 0, "");
			System.out.println("========Dealership Sport Car========");
			
			while (true) {
				System.out.print("Ingin Menambahkan mobil (yes/no) : ");
				jawab = i.next();
				i.nextLine();
				
				if (jawab.equalsIgnoreCase("no")) { 
					garasi.tampil();
					System.out.println();
					while (true) {
						System.out.println("Ingin menghapus mobil dari daftar (yes/no) : ");
						jawab = i.next();
						i.nextLine();
						if (jawab.equalsIgnoreCase("no")) {
							i.close();
							break;
						}
						garasi.hapusNama(i);
					}
					break;
				}
				System.out.println("------Spesifikasi Mobil-------");
				garasi.tambahMobil(i);
			}
			garasi.tampil();
			
		}

}
