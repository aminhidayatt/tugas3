import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int yayat = -1;

	public void insert(Double value) {
		yayat++;
		kelase.add(yayat,value);
	}
	public Double get() {
		Double value = 0.1;
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
