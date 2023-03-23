import java.util.Scanner;

public class App {
  
    static char ulang = 'n';
    static Penjualan pl = new Penjualan();
    static float totPembelian;
    static String bonus;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
       do {
            if (ulang =='Y' || ulang == 'y') {
                sc.nextLine();
            }
            System.out.println("====== ) Input ( =====");
            System.out.print("Kode    : ");
            String kode = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Harga   : ");
            float harga = sc.nextFloat();
            System.out.print("Jumlah  : ");
            int jumlah = sc.nextInt();

            
            pl.setData(kode, nama, harga, jumlah);
            totPembelian = pl.getTotalPembelian(pl.jumlah,pl.harga);
            bonus = pl.getBonus(totPembelian, pl.jumlah);
            pl.cetakNota(totPembelian, bonus);
            
            System.out.print("Input data lagi [Y/T] ? ");
            ulang = sc.next().charAt(0);

    
        } while (ulang == 'Y' || ulang == 'y');
    
    }
}
