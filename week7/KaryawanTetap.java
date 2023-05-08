
class KaryawanTetap extends Karyawan{
    int gajiPokok;

    public KaryawanTetap(String nama, String idPegawai, char jenisKelamin, int tunjanganAnak,int jumHariMasuk,int gajiPokok) {
        super(nama, idPegawai, jenisKelamin, tunjanganAnak,jumHariMasuk);
        this.gajiPokok = gajiPokok;
    }

    int totalGaji(){
        return gajiPokok + tunjanganAnak;
    }
    
}