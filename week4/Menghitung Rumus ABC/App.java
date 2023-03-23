import java.util.Scanner;

public class App {
    
    //variabel global
    static Scanner sc = new Scanner(System.in);
    static RumusAbc ra = new RumusAbc();
    static char ulang = 't';

    public static void main(String[] args) throws Exception {
        
        
        do{ 
            System.out.println("Mencari Akar menggunakan Rumus ABC ");
            if(ulang == 'y' || ulang == 'Y'){
                sc.nextLine();
            }

            System.out.println("===== ) Input ( ======");
            System.out.printf("a : ");
            ra.a = sc.nextFloat();
            System.out.printf("b : ");
            ra.b= sc.nextFloat();
            System.out.printf("c : ");
            ra.c= sc.nextFloat();

            System.out.println("[1] mencari D / Determinan :");
            System.out.println("D = b^2 - 4ac ");
            ra.d = ra.getDeterminan();
            System.out.printf("D = %.1f \n",ra.d);

            System.out.println("[2] menentukan Rumus ABC berdasarkan nilai D dan mencari X1 dan X2 :");
            ra.akar = ra.getRumusAbc();
            ra.cetakPerhitungan();

            System.out.printf("Input data lagi [Y/T]? ");
            ulang = sc.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\n============= (ノ-_-)ノ ミ ┴┴ END =========================  ");
    }
}
