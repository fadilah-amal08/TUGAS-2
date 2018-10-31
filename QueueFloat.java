import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> TypeFloat = new ArrayList<Float>();
	int angka = -1;
	
	public void insert(Float value){
		angka++; //=angka + 1;
		TypeFloat.add(angka, value);
	}
	
	public Float get(){
		Float value = null;
		if(!TypeFloat.isEmpty()){
		value = TypeFloat.get(0);
		TypeFloat.remove(0);
		angka--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("TypeFloat :" +angka+" # Angka : "+TypeFloat.toString());
	}

}
