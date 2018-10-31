import java.util.ArrayList;
public class StackString {
	ArrayList<String> mahasiswa = new ArrayList<String>();
	int mhs = -1;
	
	public void push(String value){
		mhs = mhs + 1;
		mahasiswa.add(mhs, value);
	}
	
	public String pop(){
		String value = "MELAMPAUI BATAS !";
		if(!mahasiswa.isEmpty()){
			value = mahasiswa.get(mhs);
			mahasiswa.remove(mhs);
			mhs = mhs - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("MHS :" +mhs+" # MAHASISWA : "+mahasiswa.toString());
	}
}


