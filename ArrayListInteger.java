import java.util.ArrayList;
public class ArrayListInteger {
public static void main (String [] args){
		System.out.println("\t\t\t=====OUTPUT ArrayList TYPE INTEGER=====");
		ArrayList<Integer> mid = new ArrayList<Integer>();
		//Menambahkan
		mid.add(89);
		mid.add(70);
		mid.add(88);
		mid.add(80);
		mid.add(92);
		mid.add(95);
		System.out.println("Nilai Mid Test" + mid);
		
		ArrayList<Integer> FinalTest = (ArrayList<Integer>)mid.clone();
		FinalTest.add(99);
		System.out.println("Nilai Mid Test Mahasiswa" +mid);
		System.out.println("Update Nilai Mid Test Mhasiswa " +FinalTest);
		
		System.out.println("Kosongkah Nilai Mid Test Mahasiswa  : " +mid.isEmpty());
		if (mid.contains(70))
		System.out.println("Ada Nilai 70");
		else
		System.out.println("Tidak Ada Nilai 70");		
			
		}
	}

