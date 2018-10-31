
public class MainQueueString {

	public static void main(String[] args) {
		System.out.println("=====Tampilan Untuk Class Main Queue Type String=====");
		QueueString QS = new QueueString();
		QS.cetak();
		
		QS.insert("Muahammad  Baqilani");
		QS.cetak();
		
		QS.insert("Wira Prayana Yaskur");
		QS.cetak();
		
		QS.insert("Husnul Fahmi");
		QS.cetak(); 
		
		QS.insert("Nurfadilah");
		QS.cetak();
		
		QS.insert("Nurdina");
		QS.cetak();
		
		String QS1 = QS.get();
		System.out.println(QS1);
		QS.cetak();
		
		String QS2 = QS.get();
		System.out.println(QS2);
		QS.cetak();
		
		String QS3 = QS.get();
		System.out.println(QS3);
		QS.cetak();
		
		String QS4 = QS.get();
		System.out.println(QS4);
		QS.cetak();
		
		String QS5 = QS.get();
		System.out.println(QS5);
		QS.cetak();
	

	}

}
