public class KaryawanKontrak extends Karyawan {
    
    int upahHarian;

    public KaryawanKontrak(String nama, String idPegawai, char jenisKelamin, int tunjanganAnak, int jumHariMasuk,int upahHarian) {
        super(nama, idPegawai, jenisKelamin, tunjanganAnak, jumHariMasuk);
        this.upahHarian = upahHarian;
    }

    int totalUpah(){
        return upahHarian * jumHariMasuk + tunjanganAnak;
    }
}
