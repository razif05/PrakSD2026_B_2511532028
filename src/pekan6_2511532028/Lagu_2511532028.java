package pekan6_2511532028;

public class Lagu_2511532028 {
	String judul_2028;
	String penyanyi_2028;
	Lagu_2511532028 next_2028;
	Lagu_2511532028 prev_2028;
	
	public Lagu_2511532028(String judul, String penyanyi) {
		this.judul_2028 = judul;
		this.penyanyi_2028 = penyanyi;
		this.next_2028 = null;
		this.prev_2028 = null;
	}
	
	public void SetJudul_2028(String judul) {this.judul_2028 = judul;}
	public void SetPenyanyi_2028(String penyanyi) {this.penyanyi_2028 = penyanyi;}
	public String GetJudul_2028() {return judul_2028;}
	public String GetPenyanyi_2028() {return penyanyi_2028;}
	
}
