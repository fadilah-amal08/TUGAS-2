import java.util.ArrayList;
public class ArrayListFloat {
public static void main (String [] args){
		System.out.println("\t\t\t=====OUTPUT ArrayList TYPE FLOAT=====");
		ArrayList<Float> TypeFloat = new ArrayList<Float>();
		//Menambahkan
		TypeFloat.add((float)155.50);
		TypeFloat.add((float)170.78);
		TypeFloat.add((float)165.75);
		TypeFloat.add((float)168.00);
		TypeFloat.add((float)152.50);
		TypeFloat.add((float)150.95);
		System.out.println("Tinggi Badan Mahasiswa" +TypeFloat);
		
		ArrayList<Float> TypeFloat1 = (ArrayList<Float>)TypeFloat.clone();
		TypeFloat1.add((float)160.00);
		System.out.println("Tinggi Badan Mahasiswa" +TypeFloat);
		System.out.println("Update Tinggi Badan Mahasiswa " +TypeFloat1);
		
		System.out.println("Kosongkah Tinggi Badan Mahasiswa  : " +TypeFloat.isEmpty());
		if (TypeFloat.contains((float)165.75))
		System.out.println("Ada Tinggi Badan 165.75 ");
		else
		System.out.println("Tidak Ada Tinggi Badan 165.75");		
			
		}
	}

