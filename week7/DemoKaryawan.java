

public class DemoKaryawan {
    
    public static void main(String[] args) {
    KaryawanKontrak kk = new KaryawanKontrak("udin","a21" , 'p', 100000, 30, 25000);
    System.out.println( kk.totalUpah());
    KaryawanTetap kt = new KaryawanTetap("nurul","b31", 'w', 100000, 28,2000000);
    System.out.println(kt.totalGaji());
   
    }
}
