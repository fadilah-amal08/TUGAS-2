import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> TypeDouble = new ArrayList<Double>();
	int Nilai = -1;
	
	public void insert(Double value){
		Nilai++; //=Nilai + 1;
		TypeDouble.add(Nilai, value);
	}
	
	public Double get(){
		Double value = null;
		if(!TypeDouble.isEmpty()){
		value = TypeDouble.get(0);
		TypeDouble.remove(0);
		Nilai--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("Nilai :" +Nilai+" # IPK : "+TypeDouble.toString());
	}

}
