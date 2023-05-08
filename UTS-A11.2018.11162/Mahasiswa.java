public class Mahasiswa {
     String nim ;
     String nama;
     int semester;
     int usia;
     String[] krs;

     public Mahasiswa(String nim ,String nama,int semester,int usia ,String [] krs){
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
     }

    public float hitungRataNilai(int[] nilai){
        int a=0;
        float b=0;
        for(int i = 0; i<nilai.length;i++){
            a +=nilai[i];
            if(i<nilai.length){
                b = a/nilai.length;
            }
        }
        return b;
    }
     public void infoMahasiswa(){
        System.out.println("Nim         : "+nim+"\nNama        : "+nama+"\nSemester    : "+semester+"\nUsia        : "+usia);
        System.out.printf("Krs         : ");
        infoKrsMahasiswa();
        System.out.println();
     }

    public void infoKrsMahasiswa(){
        int n = 0;
        for (String i: krs) {
            n++;
          
            if (n == 1) {
                System.out.printf("%d) %s",n,i);
            }else{
                System.out.printf("\n\t      %d) %s",n,i);
            }
        }
      
    }
    
}
