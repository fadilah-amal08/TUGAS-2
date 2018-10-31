import java.util.ArrayList;

public class QueueGeneric {
	ArrayList<String> TypeString = new ArrayList<String>();
	int Nama = -1;
	
	public void insert(String value){
		 Nama++; 
		TypeString.add(Nama, value);
	}
	
	public String get1(){
		String value = "Nilai Kosong";
		if(!TypeString.isEmpty()){
		value = TypeString.get(0);

		}
		return value;
		
	}
	ArrayList<String> TypeString1 = new ArrayList<String>();
	int nim = -1;
	
	public void insert1(String value){
		nim++; //=Nilai + 1;
		TypeString1.add(nim, value);
	}
	
	public String get(){
		String value = null;
		if(!TypeString1.isEmpty()){
		value = TypeString1.get(0);
		}
		return value;	
	}
	ArrayList<Integer> TypeInteger = new ArrayList<Integer>();
	int umur = -1;
	
	public void insert(Integer value){
		umur++; 
		TypeInteger.add(umur, value);
	}
	
	public Integer get2(){
		Integer value = null;
		if(!TypeInteger.isEmpty()){
		value = TypeInteger.get(0);
		}
		return value;
	}
	ArrayList<Integer> TypeInteger2 = new ArrayList<Integer>();
	int berat = -1;
	
	public void insert2(Integer value){
		berat++; 
		TypeInteger.add(berat, value);
	}
	
	public Integer get3(){
		Integer value = null;
		if(!TypeInteger.isEmpty()){
		value = TypeInteger.get(0);
		
		}
		return value;
	}
	ArrayList<Float> TypeFloat = new ArrayList<Float>();
	int tinggi = -1;
	
	public void insert4(Float value){
		tinggi++;
		TypeFloat.add(tinggi, value);
	}
	
	public Float get4(){
		Float value = null;
		if(!TypeFloat.isEmpty()){
		value = TypeFloat.get(0);
		}
		return value;
	}
	public void cetak(){
		System.out.println("Nama \t:" +Nama+" "+TypeString.toString());
		System.out.println("NIM \t:" +nim+" "+TypeString.toString());
		System.out.println("Usia \t:" +umur+" "+TypeInteger.toString());
		System.out.println("Berat Badan  :" +berat+" "+TypeInteger.toString());
		System.out.println("Tinggi Badan :" +tinggi+" "+TypeFloat.toString());
	}
	

}
