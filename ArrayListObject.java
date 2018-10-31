import java.util.ArrayList;
public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("AMIN HIDAYAT", "D0217383", "E", "PAREANG-PARANG"));
	Data.add(new Mahasiswa("NASRUDDIN", "D0217534", "E", "MAJENE"));
		
	Data.forEach(data ->{
	System.out.println("NAMA   : "+data.getNama());
	System.out.println("NIM    : "+data.getNim());
	System.out.println("KELAS  : "+data.getKelas());
	System.out.println("ALAMAT : "+data.getAlamat());	
	System.out.println(" ")
	});
	}
}
