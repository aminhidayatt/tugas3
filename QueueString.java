import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int yayat = -1;

	public void insert(String value) {
		yayat++;
		kelase.add(yayat,value);
	}
	public String get() {
		String value = "KOSONG";
		if(yayat>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			yayat--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+yayat+" > KELAS E: "+kelase.toString());
	}
}
