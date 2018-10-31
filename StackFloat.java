import java.util.ArrayList;
public class StackFloat {
	ArrayList<Float> NilaiFloat= new ArrayList<Float>();
	int NF = -1;
	
	public void push(Float value){
		NF = NF + 1;
		NilaiFloat.add(NF, value);
	}
	public Float pop(){
		Float value = null;
		if(!NilaiFloat.isEmpty()){
			value = NilaiFloat.get(NF);
			NilaiFloat.remove(NF);
			NF = NF - 1;
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("N :" +NF+" # NilaI Float : "+NilaiFloat.toString());
	}
	}



