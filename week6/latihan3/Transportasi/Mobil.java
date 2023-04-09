package latihan3.Transportasi;

public class Mobil {
   int roda ;
   int mesin;
   
    public Mobil(int roda ,int mesin){
        this.roda = roda;
        this.mesin = mesin;

        Cetak();
        Maju();
        Mundur();
        Belok();
    }

    public void Cetak(){
        System.out.printf("Mobil\nRoda : %d\nMesin : %d\n",roda,mesin);
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
