import java.util.ArrayList;
public class ArrayListString {
public static void main (String [] args){
		System.out.println("\t\t\t=====OUTPUT ArrayList TYPE STRING=====");
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		//Menambahkan
		Mahasiswa.add("Nurfadilah");
		Mahasiswa.add("Nuramaliah");
		Mahasiswa.add("Nurdina");
		Mahasiswa.add("Nur Indah Sari");
		Mahasiswa.add("Nur Aisyah");
		Mahasiswa.add("Nurkomala Sari");
		System.out.println(Mahasiswa);
		
		ArrayList<String> Mahasiswa1 = (ArrayList<String>)Mahasiswa.clone();
		Mahasiswa1.add("Nurhikmah");
		System.out.println("Mahasiswa" +Mahasiswa);
		System.out.println("Mahasiswa1" +Mahasiswa1);
		
		System.out.println("Kosongkah : " +Mahasiswa.isEmpty());
		if (Mahasiswa.contains("Nuramaliah"))
		System.out.println("Ada Nama Nuramaliah");
		else
		System.out.println("Tidak Ada Nama Nuramaliah");		
			
		}
	}

