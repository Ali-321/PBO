public class MahasiswaLulus extends Mahasiswa {

    int tahunWisuda;
    float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs,int tahunWisuda,float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }
    
    boolean ikutWisuda(){
        return true;
    }


    public void infoKrsMahasiswa() {
        super.infoKrsMahasiswa();
        System.out.println("\nTahun Wisuda: "+tahunWisuda);
        System.out.println("Ipk\t    : "+ipk);
    }
}
