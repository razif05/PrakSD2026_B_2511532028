package pekan2_2511532028;

public class Mahasiswa_2511532028 {
	String nim_2028;
	String nama_2028;
	String prodi_2028;
	Mahasiswa_2511532028(String nim, String nama, String prodi ) {
		this.nim_2028 = nim;
		this.nama_2028 = nama;
		this.prodi_2028 = prodi;
	}
	@Override
	public String toString() {
		return "Nim : " + nim_2028 + ", Nama : " + nama_2028 + ", Prodi : " + prodi_2028;
	}

}
