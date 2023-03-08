public class AksiSepeda {
    public static void main(String[] args) throws Exception {
        System.out.println();
        
        // membuat objek
        Sepeda sepedaBalap;
        Sepeda sepedaGunung ;
        Sepeda sepedaKlasik ;

        // memgakses atribut dan method
        
        // Sepeda Balap
        sepedaBalap = new Sepeda(2,"Road Bike","BMX");
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaBalap.ngerem();
     

        // Sepeda Gunung
        sepedaGunung = new Sepeda(2,"MTB","Plygon");
        gearSepeda = sepedaGunung.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaGunung.ngerem();
        

        // Sepeda Klasik
        sepedaKlasik = new Sepeda(2,"Onthel","Hero");
        gearSepeda = sepedaKlasik.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaKlasik.ngerem();
        


    }
}
