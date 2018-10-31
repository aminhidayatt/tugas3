import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int yayat = -1;

	public void insert(Float value) {
		yayat++;
		kelase.add(yayat,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(yayat>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			yayat--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+yayat+" > VARIABLE: "+kelase.toString());
	}
}
