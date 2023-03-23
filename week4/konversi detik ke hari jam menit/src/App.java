import java.util.Scanner;

public class App{
    static Waktu w = new Waktu();
    static Waktu.Konversi wk =w. new Konversi();
    static Scanner sc = new Scanner(System.in);
    static int detik;
    public static void main(String[] args) throws Exception {
        char ulang = 't';
        do {

            if (ulang == 'y' || ulang == 'Y') {
                sc.nextLine();
            }

            System.out.println("===== ) input ( ======");
            System.out.printf("Detik    : ");
            detik = sc.nextInt();
            System.out.println("===== ) hasil Konversi Detik ( ======");
            w = wk.getDetikToHariToMenitToDetik(detik);
            System.out.printf("Detik = %d\n",detik);
            System.out.printf("Hari  = %d\n",w.hari);
            System.out.printf("Jam   = %d\n",w.jam);
            System.out.printf("Menit = %d\n",w.menit);
            System.out.printf("Detik = %d\n",w.detik);
            
            System.out.printf("Input data lagi [Y/T] ? ");
            ulang = sc.next().charAt(0);
        
        } while(ulang == 'y' || ulang == 'Y');

        
      
    }   
    
}
