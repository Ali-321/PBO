public class Waktu {
    //atribut
    int hari;
    int menit;
    int jam;
    int detik;

    class Konversi{
  
        Waktu getDetikToHariToMenitToDetik(int detik){
            Waktu w =new Waktu();
            int temp;
            w.hari = detik / 86400;
            temp = detik %  86400;
            w.jam = temp / 3600;
            temp = temp % 3600;
            w.menit = temp / 60;
            temp = temp % 60;
            w.detik = temp;
            return w;
        }
        
    }
}
