public class StackGeneric<T> {
    
    public T Mahasiswa;
   
    protected void setMahasiswa(T Mahasiswa){
        this.Mahasiswa = Mahasiswa;
    }
    
    protected T getMahasiswa(){
        return Mahasiswa;
    }
}