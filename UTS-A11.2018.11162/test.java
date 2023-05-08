import java.util.Scanner;
import java.util.ArrayList;
public class test {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <MahasiswaAktif> maak = new ArrayList<MahasiswaAktif> ();
    static ArrayList <MahasiswaLulus> malu = new ArrayList<MahasiswaLulus> ();
    static ArrayList <MahasiswaBaru> maba = new ArrayList<MahasiswaBaru> (); 
    static ArrayList <MahasiswaTransfer> matra = new ArrayList<MahasiswaTransfer> ();
    static String nim;
    static String nama;
    static int semester;
    static int usia;
    static String [] krs;
    static String asalSekolah;
    static int tahunWisuda;
    static float ipk;
    static String asalUniversitas; 
    
    public static void main(String[] args) {
    inputDataMahasiswa();

    }   

    static void inputDataMahasiswa(){
        
        int no = 0;
        do {
            
           
            System.out.println("1)input mahasiswa aktif");
            System.out.println("2)input mahasiswa lulus");
            System.out.println("3)input mahasiswa baru");
            System.out.println("4)input mahasiswa trasfer");
            System.out.println("5)tampilkan data mahasiswa aktif");
            System.out.println("6)tampilkan data mahasiswa lulus");
            System.out.println("7)tampilkan data mahasiswa baru");
            System.out.println("8)tampilkan data mahasiswa trasfer");
            System.out.println("9)hitung nilai rata-rata");
            System.out.println("0)Selesai");
            System.out.printf("Pilih No : ");
            no = sc.nextInt();

            if (no == 1) {
                int i =0;
                do {
                sc.nextLine();
                inputMaAk(nim, nama, usia, semester, krs);
                i++;
                } while (i<2);
                
            }else if(no == 2){
                int i =0;
                do {
                sc.nextLine();
                inputMaLu(nim, nama, semester, usia, krs,tahunWisuda,ipk);
                i++;
                } while (i<2);
               
            }else if(no == 3){
                int i =0;
                do {
                sc.nextLine();
                inputMaba(nim, nama,semester,usia, krs, asalSekolah);
                i++;
                } while (i<2);
                
            }else if(no == 4){
                int i =0;
                do {
                sc.nextLine();
                inputMaTra(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas);
                i++;
                } while (i<2);      
            }else if(no == 5){
                printAll(maak);
            }else if(no == 6){
                printAll(malu);
            }else if(no == 7){
                printAll(maba);
            }else if(no == 8){
                printAll(matra);
            }else if(no == 9){
                int[] nil = new int[3];
                for (int i = 0; i < 3; i++) {
                    nil[i] = sc.nextInt();
                }
                float rata = new Mahasiswa(nim, nama, no, no, krs).hitungRataNilai(nil);
                System.out.println("nilai rata-rata : "+rata);
            }
         
        } while (no != 0);
        

    }

  public static void inputMaAk(String nim,String nama, int usia,int semester,String [] krs){
        System.out.printf("Nim : ");
        nim=sc.nextLine();
        System.out.printf("Nama : ");
        nama=sc.nextLine();
        System.out.printf("Usia : ");
        usia=sc.nextInt();
        System.out.printf("semester : ");
        semester=sc.nextInt();
        System.out.printf("KRS : ");
        krs = new String [3];
        sc.nextLine();
        for (int i = 0; i < krs.length; i++){
            System.out.printf("masukan krs [%d]: ",i);
            krs[i] = sc.nextLine();  
        }
        
            
        maak.add(new MahasiswaAktif(nim, nama, semester, usia, krs));
    }

    public static void inputMaLu(String nim, String nama, int semester, int usia, String[] krs,int tahunWisuda,float ipk){
        System.out.println("Nim : ");
        nim=sc.nextLine();
        System.out.println("Nama : ");
        nama=sc.nextLine();
        System.out.println("Usia : ");
        usia=sc.nextInt();
        System.out.println("semester : ");
        semester=sc.nextInt();
        System.out.println("KRS : ");
        krs = new String [3];
        sc.nextLine();
        for (int i = 0; i < krs.length; i++){
            System.out.printf("masukan krs [%d]: ",i);
            krs[i] = sc.nextLine();  
        }
        System.out.println("Tahun Wisuda : ");
        tahunWisuda=sc.nextInt();
        System.out.println("IPK : ");
        ipk=sc.nextFloat();

        malu.add(new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk));
    }

   public static void inputMaba(String nim, String nama, int semester, int usia, String[] krs,String asalSekolah){
       
        System.out.println("Nim : ");
        nim=sc.nextLine();
        System.out.println("Nama : ");
        nama=sc.nextLine();
        System.out.println("Usia : ");
        usia=sc.nextInt();
        System.out.println("semester : ");
        semester=sc.nextInt();
        System.out.println("KRS : ");
        krs = new String [3];
        sc.nextLine();
        for (int i = 0; i < krs.length; i++){
            System.out.printf("masukan krs [%d]: ",i);
            krs[i] = sc.nextLine();  
        }
        System.out.println("Asal Sekolah : ");
        asalSekolah=sc.nextLine();

        maba.add(new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah));
    }

   public static void inputMaTra(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah,String asalUniversitas){
        System.out.println("Nim : ");
        nim=sc.nextLine();
        System.out.println("Nama : ");
        nama=sc.nextLine();
        System.out.println("Usia : ");
        usia=sc.nextInt();
        System.out.println("semester : ");
        semester=sc.nextInt();
        System.out.println("KRS : ");
        krs = new String [3];
        sc.nextLine();
        for (int i = 0; i < krs.length; i++){
            System.out.printf("masukan krs [%d]: ",i);
            krs[i] = sc.nextLine();  
        }
        System.out.println("Asal Sekolah : ");
        asalSekolah=sc.nextLine();
        System.out.println("Asal Universitas : ");
        asalUniversitas=sc.nextLine();

        matra.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas)); 
    }

    public static void printAll(ArrayList<?> ma) {
       ma.forEach((m)->((Mahasiswa) m).infoMahasiswa());
    }

   
}
