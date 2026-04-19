package pekan2_2511532028;

public class Musik_2511532028 {
	String judul_2028;
	String penyanyi_2028;
	int durasi_2028;
	
	public Musik_2511532028 (String judul, String penyanyi, int durasi) {
		this.judul_2028 = judul;
		this.penyanyi_2028 = penyanyi;
		this.durasi_2028 = durasi;
	}
	
	public void setJudul_2028(String judul) { this.judul_2028 = judul;	};
	public void setPenyanyi_2028(String penyanyi) {	this.penyanyi_2028 = penyanyi;};
	public void setDurasi_2028(int durasi) { this.durasi_2028 = durasi;	};
	
	public String getJudul_2028() { return judul_2028; }
	public String getPenyanyi_2028() { return penyanyi_2028; }
	public int getDurasi_2028() { return durasi_2028; }
	
	@Override
	public String toString() {
		return judul_2028 + " - " + penyanyi_2028 + " < Durasi : " + durasi_2028 + " > "+"\n-----------------------------"; 
	}

	
}
