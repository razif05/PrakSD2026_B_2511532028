package pekan3_2511532028;

public class Website_2511532028 {
	String Judul_2028;
	String URL_2028;
	int top = 0;
	//static final int max = 20;
	
	public Website_2511532028(String judul, String url) {
		this.Judul_2028 = judul; this.URL_2028 = url;
	}
	
	// mutator
	public void setJudul(String judul) {this.Judul_2028 = judul;}
	public void setUrl(String url) { this.URL_2028 = url;}

	// selektor
	public String getJudul() {return Judul_2028;}
	public String getUrl() {return URL_2028;}
	
	// menghindari terjadinya tampilan hashcode
	public String toString() {
		return " Judul	: " + Judul_2028 + "\n URL	: " + URL_2028;
	}
	

}
