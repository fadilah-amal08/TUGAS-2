import java.util.ArrayList;

public class QueueString {
	ArrayList<String> mahasiswa = new ArrayList<String>();
	int nama = -1;
	
	public void insert(String value){
		nama++; //=ecor + 1;
		mahasiswa.add(nama, value);
	}
	
	public String get(){
		String value = "kosong";
		if(!mahasiswa.isEmpty()){
		value = mahasiswa.get(0);
		mahasiswa.remove(0);
		nama--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("Nama :" +nama+" # Mahasiswa : "+mahasiswa.toString());
	}

}
