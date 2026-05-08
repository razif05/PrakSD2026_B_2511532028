package pekan5_2511532028;

import java.util.Scanner;

public class Pasien_2511532028 {
	Scanner s = new Scanner(System.in);
	String pasien_2028;
	String keluhan_2028;
	int nomor_antri_2028;
	static int counter_2028;
	Pasien_2511532028 next_2028;
	
	
	public Pasien_2511532028(String pasien, String keluhan) { 
		this.nomor_antri_2028 = ++counter_2028;
		this.pasien_2028 = pasien;
		this.keluhan_2028 = keluhan;
		this.next_2028 = null;
	}
	

}
