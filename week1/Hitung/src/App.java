public class App {
    public static void main(String[] args) throws Exception {
        float d = 10;
        float a = 6;
        float t = 8;
        float dt= 5;
        float tt = 10;

        System.out.println("=================================");

        // jawaban E.2.a
        double k = kelilingLingkaran(d);
        System.out.printf("K = 3.14 x "+d+" = %.1f\n",k);


        //jawaban E.2.b
        double l = luasSegitigaSS(a, t);
        System.out.printf("L = 1/2 x "+a+" x "+t+" = %.1f\n",l);

        //jawaban E.2.c
        double v = volumeTabung(dt, tt);
        System.out.printf("V = 3.14 x "+dt+" x "+tt+" = %.1f\n",v);

        System.out.println("=================================");
        
    }

    // rumus lingkaran  K =  pi x d, nilai pi = 3.14
    static double kelilingLingkaran (float d){
         return 3.14 * d; 
    }

    // rumus Luas segitiga siku-siku L = 1/2 x alas x tinggi
    static double luasSegitigaSS (float a, float t){
        return 0.5 * a * t;
    }

    // rumus Volume tabung  V = pi x (1/2 x d)^2 x t
    static double volumeTabung (float d,float t){
        return 3.14* (Math.pow(0.5 * d,2)) * t;
    }


}
