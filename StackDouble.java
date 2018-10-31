import java.util.ArrayList;
public class StackDouble {
	ArrayList<Double> nilai = new ArrayList<Double>();
	int n = -1;
	
	public void push(Double value){
		n = n + 1;
		nilai.add(n, value);
	}
	public Double pop(){
		Double value = null;
		if(!nilai.isEmpty()){
			value = nilai.get(n);
			nilai.remove(n);
			n = n - 1;
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("N :" +n+" # NILAI : "+nilai.toString());
	}
	}



