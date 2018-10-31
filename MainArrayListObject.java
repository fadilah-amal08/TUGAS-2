
public class MainArrayListObject {


	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa();
		mhs.nama = "Nama     :"+"Nurdina";
		mhs.nim =  "NIM      :"+"D0217316";
		mhs.kelas ="Kelas    :"+"TI D 017";
		mhs.alamat = "Alamat   :"+"Campalagian";
		
		mahasiswa mhs1 = new mahasiswa();
		mhs1.nama = "Nama    :"+"Nurfadilah";
		mhs1.nim =  "NIM     :"+"D0217315";
		mhs1.kelas ="Kelas   :"+"TI D 017";
		mhs1.alamat = "Alamat  :"+"Campalagian";
		 
		mahasiswa mhs2 = new mahasiswa();
		mhs2.nama = "Nama    : " +"Nismawati";
		mhs2.nim =  "NIM     : "+"D0217314";
		mhs2.kelas ="Kelas   :"+"TI D 017";
		mhs2.alamat = "Alamat  :"+"Campalagian";
		
//		mhs.printNama();
//		mhs.printNim();
//		mhs.printkelas();
//		mhs.printAlamat();
		mahasiswa[] arrMhs = new mahasiswa[3];
		arrMhs[0]= mhs;
		arrMhs[1]= mhs1;
		arrMhs[2]= mhs2;
		
		for (int i=0;i<arrMhs.length;i++) {
			arrMhs [i].printNama();
			arrMhs [i].printNim();
			arrMhs [i].printkelas();
			arrMhs [i].printAlamat();
		
		}
	}
}
