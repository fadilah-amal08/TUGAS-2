
public class MainStackString {
	public static void main(String[] args) {
		System.out.println("=====Output Class Main Stack Type String=====");
		StackString st = new StackString();
		st.cetak();
		
		st.push("ABDUL WAHAB");
		st.cetak();
		
		st.push("HASMAN");
		st.cetak();
		
		st.push("NURDINA");
		st.cetak();
		
		st.push("NURFADILAH");
		st.cetak();
		
		String d1 = st.pop();
		System.out.println(d1);
		st.cetak();
		
		String d2 = st.pop();
		System.out.println(d2);
		st.cetak();
		
		String d3 = st.pop();
		System.out.println(d3);
		st.cetak();
		
		String d500 = st.pop();
		System.out.println(d500);


}
}