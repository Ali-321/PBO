public class Penjualan {
    // atribut
    String kode;
    String nama;
    float harga;
    int jumlah;
    

    void setData(String kode,String nama,float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    float getTotalPembelian(int jumlah,float harga){
        return jumlah * harga;
    }

    String getBonus(float totPembelian,int jumlah){
        
        String bonus;

        if (totPembelian >= 500000  && jumlah > 5) {
            bonus = "Strika";
        }else if(totPembelian >= 100000 && jumlah > 3){
            bonus = "Payung";
        }else if(totPembelian >= 50000 && jumlah > 2){
            bonus = "Ballpoint";
        }else{
            bonus = "Tidak Mendapatkan bonus";
        }
        
        return bonus;
    }


    void cetakNota(float totPembelian,String bonus){
        System.out.println("===== ) Nota (==========");
        System.out.println("Kode    : "+kode);
        System.out.println("Nama    : "+nama);
        System.out.println("Harga   : "+harga);
        System.out.println("jumlah  : "+jumlah);
        System.out.println("total   : "+totPembelian);
        System.out.println("bonus   : "+bonus);

    }
}
