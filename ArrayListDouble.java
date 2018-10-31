import java.util.ArrayList;
public class ArrayListDouble {
public static void main (String [] args){
		System.out.println("\t\t\t=====OUTPUT ArrayList TYPE DOUBLE=====");
		ArrayList<Double> TypeDouble = new ArrayList<Double>();
		//Menambahkan
		TypeDouble.add(3.89);
		TypeDouble.add(3.75);
		TypeDouble.add(2.88);
		TypeDouble.add(3.85);
		TypeDouble.add(2.92);
		TypeDouble.add(3.95);
		System.out.println("Nilai IPK Mahasiswa" + TypeDouble);
		
		ArrayList<Double> TypeDouble1 = (ArrayList<Double>)TypeDouble.clone();
		TypeDouble1.add(4.00);
		System.out.println("Nilai IPK Mahasiswa" +TypeDouble);
		System.out.println("Update Nilai IPK Mhasiswa " +TypeDouble1);
		
		System.out.println("Kosongkah Nilai IPK Mahasiswa  : " +TypeDouble.isEmpty());
		if (TypeDouble.contains(2.88))
		System.out.println("Ada Nilai IPK 2.88");
		else
		System.out.println("Tidak Ada Nilai IPK 2.88");		
			
		}
	}

