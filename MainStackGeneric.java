public class MainStackGeneric {
    public static void main(String[] args){
        //Membuat Instance dan Mendefinisikan Tipe Data String
        StackGeneric<String> nama = new  StackGeneric<String>();
        nama.setMahasiswa("NURFADILAH");
        System.out.println("Nama\t\t: "+nama.getMahasiswa());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        StackGeneric<Integer> umur = new  StackGeneric<Integer>();
        umur.setMahasiswa(20);
        System.out.println("Usia\t\t: "+umur.getMahasiswa()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        StackGeneric<Boolean> kondisi = new  StackGeneric<Boolean>();
        kondisi.setMahasiswa(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getMahasiswa());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        StackGeneric<Float> IPK = new  StackGeneric<Float>();
        IPK.setMahasiswa(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getMahasiswa());
        
    }
}