public class Sepeda {
      // Tempat untuk atribut
      int gear = 5;

      // Tempat untuk method

      Sepeda(int jumlahRoda,String jenis, String merk){
        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
      }


      void ngerem(){
              System.out.println("Sepeda direm\n");
      }
}
