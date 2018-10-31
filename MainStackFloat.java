
public class MainStackFloat {
	public static void main(String[] args) {
		System.out.println("=====Output Class Main Stack Type Float=====");
		StackFloat SF = new StackFloat();
		SF.cetak();
		
		SF.push((float) 0.001);
		SF.cetak();
		
		SF.push((float) 0.002);
		SF.cetak();
		
		SF.push((float) 0.003);
		SF.cetak();
		
		SF.push((float) 0.004);
		SF.cetak();
		
		SF.push((float) 0.005);
		SF.cetak();

		
		Float SF1 = SF.pop();
		System.out.println(SF1);
		SF.cetak();
		
		Float SF2 = SF.pop();
		System.out.println(SF2);
		SF.cetak();
		
		Float SF3 = SF.pop();
		System.out.println(SF3);
		SF.cetak();
		
		Float SF4 = SF.pop();
		System.out.println(SF4);
		SF.cetak();
		
		Float SF5 = SF.pop();
		System.out.println(SF5);
		SF.cetak();


}
}