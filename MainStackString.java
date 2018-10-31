public class MainStackString {
public static void main(String[] args) {
		classstackstring st= new classstackstring();
		
		st.push("yayat");
    st.push("amin");
		st.push("yusuf");
		st.push("fajrin");
		
		String d0=st.pop();
		System.out.println(d0);
		st.cetak();
	}
}
