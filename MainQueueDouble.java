
public class MainQueueDouble {

	public static void main(String[] args) {
		System.out.println("=====Tampilan Untuk Class Main Queue Type Double=====");
		QueueDouble QD = new QueueDouble();
		QD.cetak();
		
		QD.insert(3.23);
		QD.cetak();
		
		QD.insert(3.30);
		QD.cetak();
		
		QD.insert(3.78);
		QD.cetak(); 
		
		QD.insert(4.00);
		QD.cetak();
		
		QD.insert(3.98);
		QD.cetak();
		
		Double QD1 = QD.get();
		System.out.println(QD1);
		QD.cetak();
		
		Double QD2 = QD.get();
		System.out.println(QD2);
		QD.cetak();
		
		Double QD3 = QD.get();
		System.out.println(QD3);
		QD.cetak();
		
		Double QD4 = QD.get();
		System.out.println(QD4);
		QD.cetak();
		
		Double QD5 = QD.get();
		System.out.println(QD5);
		QD.cetak();
	

	}

}
