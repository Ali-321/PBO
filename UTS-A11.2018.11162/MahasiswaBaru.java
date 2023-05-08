
public class MahasiswaBaru extends Mahasiswa {
    String asalSekolah;
    
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs,String asalSekolah ) {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
        
    }

   

    boolean ikutOspek(){
        return true;
    }

    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("\nAsal Sekolah: "+asalSekolah);
    }
    
}
