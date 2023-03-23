import java.util.Scanner;

public class App {
    
    static String nim ;
    static String nama;
    static float nilTugas;
    static float nilUts;
    static float nilUas;
    static float nilAkhir;
    static char ulang = 'n';

    static Scanner sc = new Scanner(System.in);
    static Nilai nil = new Nilai();
    

    public static void main(String[] args) throws Exception {

       
   
    
         do{ 

             if (ulang == 'y') {
                // clear buffer Scanner
                sc.nextLine();
             }

            System.out.println("===== ) Input ( ========");
            System.out.print("NIM           : ");
            nim = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Nilai Tugas   : ");
            nilTugas = sc.nextInt();
            System.out.print("Nilai UTS     : ");
            nilUts = sc.nextInt();
            System.out.print("Nilai UAS     : ");
            nilUas = sc.nextInt();

        
            System.out.println("====== ) Ouput ( ======)");
            nilAkhir = nil.getNilAkhir(nil.getNilTugas(nilTugas),nil.getNilUts(nilUts),nil.getNilUas(nilUas));

            // use double % to escape %, i.e: %%

            System.out.println("Nim          : "+nim);
            System.out.println("Nama         : "+nama);
            System.out.printf("Nilai Tugas  : %.1f 20%%       : %.1f \n",nilTugas,nil.getNilTugas(nilTugas));
            System.out.printf("Nilai Uts    : %.1f 35%%       : %.1f \n",nilUts,nil.getNilUts(nilUts));
            System.out.printf("Nilai Uas    : %.1f 45%%       : %.6f \n",nilUas,nil.getNilUas(nilUas));
            System.out.printf("Nilai Akhir  : %.6f \n",nilAkhir);
            System.out.println("Nilai Huruf  : "+nil.getNilHuruf(nilAkhir));
            System.out.println("Predikat     : "+nil.getPredikat(nil.getNilHuruf(nilAkhir)));
            System.out.println("=======================");

            System.out.print("Input data lagi (y/n) ? ");
            ulang = sc.next().charAt(0);
            

        }while (ulang == 'y');
    }
}
