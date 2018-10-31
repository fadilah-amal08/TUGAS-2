
public class MainQueueGeneric {

	public static void main(String[] args) {
		System.out.println("=====Tampilan Untuk Class Main Queue Type String=====");
		QueueGeneric QG = new QueueGeneric();
		QG.cetak();
		
		QG.insert("Muahammad  Baqilani");
		QG.cetak();
		
		QG.insert1("D0217315");
		QG.cetak();
		
		QG.insert(19 +" Tahun");
		QG.cetak(); 
		
		QG.insert(155 +" cm");
		QG.cetak(); 
		
		String QG1 = QG.get1();
		System.out.println(QG1);
		QG.cetak();
		
		String QG2 = QG.get();
		System.out.println(QG2);
		QG.cetak();
		
		Integer QG3 = QG.get2();
		System.out.println(QG3);
		QG.cetak();
		
		Integer QG4 = QG.get3();
		System.out.println(QG4);
		QG.cetak();
		
		Float QG5 = QG.get4();
		System.out.println(QG4);
		QG.cetak();

	}

}
