package pekan1_2511532028;

import java.util.Scanner;

public class mobilADT_2511532028 {
	Scanner i = new Scanner(System.in);
	private String nama;
	private int tahun;
	private String cc;
	private long harga;
	private String merk;
	String ptahun;
	String pharga;
	int z = 41;
	// Node Linked list
	mobilADT_2511532028 next;
	mobilADT_2511532028 head;
	

	// Konstruktor
	public mobilADT_2511532028(String n, int thn, String c, long h, String m) {
		this.nama = n; this.tahun = thn; this.cc = c; this.harga = h; this.merk = m; this.next = null;
	}
	
	// Selektor
	public String getNama() { return nama; }
	public int getTahun() { return tahun; }
	public String getCC() { return cc; }
	public long getHarga() { return harga; }
	public String getMerk() { return merk; }
	
	// Mutator
	public void setNama(String n) { this.nama = n; }
	public void setTahun(int thn) { this.tahun = thn; }
	public void setCC(String c) { this.cc = c; }
	public void setHarga(long h) { this.harga = h; }
	public void setMerk(String m) { this.merk = m; }
	
	
	void tambahMobil(Scanner sc) {
		int thn;
		long h;
		String n, c, m;
		
		System.out.print("Nama mobil		: ");
		n = i.nextLine().toUpperCase();
		
		System.out.print("Tahun			: ");
		thn = i.nextInt();
		i.nextLine();
		
		System.out.print("Cubic Centimeter(cc)	: ");
		c = i.next();
		i.nextLine();
		
		System.out.print("harga			: ");
		h = i.nextLong();
		i.nextLine();
		
		System.out.print("Merek mobil		: ");
		m = i.next().toUpperCase();
		i.nextLine();
		
		mobilADT_2511532028 mbg = new mobilADT_2511532028(n, thn, c, h, m);
		mbg.next = head;
		head = mbg;
	}
	
	void hapusNama(Scanner in) {
		String nama;
		mobilADT_2511532028 current = head;
	    mobilADT_2511532028 prev = null;
	    
		System.out.println("Nama mobil (yang ingin di hapus) : ");
		nama = i.nextLine();
	    
		
	    while (current != null) {
	        if (current.nama.equalsIgnoreCase(nama)) {
	            if (prev == null) {
	                head = current.next;
	            } else {
	                prev.next = current.next;
	            }

	            System.out.println("Data dihapus");
	            return;
	        }
	        prev = current;
	        current = current.next;
	    }
	    System.out.println("Data tidak ditemukan");
	}
	
	
    void tampil() {
        mobilADT_2511532028 current = head;
        System.out.println("========Daftar Mobil========");
        while (current != null) {
        	for(int i=1; i <= z; i++ ) {
        		System.out.print("-");
        	}
        	System.out.println();
        	System.out.println("Nama			: " + current.nama);
        	System.out.println("Tahun			: " + current.tahun);
        	System.out.println("Cubic Centimete(cc)	: " + current.cc);
        	System.out.println("Harga			: " + current.harga);
        	System.out.println("Merk			: " + current.merk);
        	
            current = current.next;
            System.out.println();
        }
       for(int i=1; i <= z; i++ ) {
    		System.out.print("-");
    	}
       System.out.println();
       System.out.println("null");
       for(int i=1; i <= z; i++ ) {
   		System.out.print("-");
    }
    }
	
}

