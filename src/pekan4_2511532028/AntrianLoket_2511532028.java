package pekan4_2511532028;

import java.util.Scanner;

public class AntrianLoket_2511532028 {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		TugasQueue_2511532028 q_2028 = new TugasQueue_2511532028(3);
		int pilihan_2028;
		do {
			q_2028.MenuAntri_2028();
			System.out.print("Pilih menu : ");
			pilihan_2028 = z.nextInt();
			System.out.println();
			z.nextLine();
			
			switch (pilihan_2028) { 
				case 1:
					q_2028.enqueue_2028(z);;
					break;
				case 2:
					q_2028.dequeue_2028();
					break;
				case 3:
					q_2028.reverseAntri_2028();;
					break;
				case 4:
					q_2028.Tampilkan_2028();
					break;
				case 5:
					System.out.println("===Anda Keluar dari Menu Antrian===");
					break;
				
				}
		} while (pilihan_2028 != 5);
		z.close();
		

	}

}
