package Trasnportasi;

public class Bicycle {
    int roda ;
    int mesin;
    
     public Bicycle(int roda ,int mesin){
         this.roda = roda;
         this.mesin = mesin;
 
         Cetak();
         Maju();
         Mundur();
         Belok();
     }
 
     public void Cetak(){
         System.out.printf("Sepeda\nRoda : %d\nMesin : %d\n",roda,mesin);
     }
 
     public void Maju() {
         System.out.println("Maju............");
         
     }
     public void Mundur() {
         System.out.println("Mundur............");
         
     }
     public void Belok() {
         System.out.println("Belok............");
         
     }
    
}
