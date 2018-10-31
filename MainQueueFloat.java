
public class MainQueueFloat {

	public static void main(String[] args) {
		System.out.println("=====Tampilan Untuk Class Main Queue Type Float=====");
		QueueFloat QF = new QueueFloat();
		QF.cetak();
		
		QF.insert((float)65.67);
		QF.cetak();
		
		QF.insert((float)88.59);
		QF.cetak();
		
		QF.insert((float)89.788);
		QF.cetak(); 
		
		QF.insert((float)97.0098);
		QF.cetak();
		
		QF.insert((float)70.985);
		QF.cetak();
		
		Float QF1 = QF.get();
		System.out.println(QF1);
		QF.cetak();
		
		Float QF2 = QF.get();
		System.out.println(QF2);
		QF.cetak();
		
		Float QF3 = QF.get();
		System.out.println(QF3);
		QF.cetak();
		
		Float QF4 = QF.get();
		System.out.println(QF4);
		QF.cetak();
		
		Float QF5 = QF.get();
		System.out.println(QF5);
		QF.cetak();
	

	}

}
