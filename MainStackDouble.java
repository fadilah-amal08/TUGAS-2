
public class MainStackDouble {
	public static void main(String[] args) {
		System.out.println("=====Output Class Main Stack Type Double=====");
		StackDouble sd = new StackDouble();
		sd.cetak();
		
		sd.push(0.1);
		sd.cetak();
		
		sd.push(0.2);
		sd.cetak();
		
		sd.push(0.3);
		sd.cetak();
		
		sd.push(0.4);
		sd.cetak();
		
		Double n1 = sd.pop();
		System.out.println(n1);
		sd.cetak();
		
		Double n2 = sd.pop();
		System.out.println(n2);
		sd.cetak();
		
		Double n3 = sd.pop();
		System.out.println(n3);
		sd.cetak();
		
		Double n5 = sd.pop();
		System.out.println(n5);
		sd.cetak();

}
}