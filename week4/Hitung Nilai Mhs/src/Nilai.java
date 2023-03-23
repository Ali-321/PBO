

public class Nilai {
    // Atribut 
    char nHuruf;
    String predikat;

    // Method 
    char getNilHuruf(float nilai){
        if (nilai >= 85) {
            nHuruf = 'A';
        }else if(nilai >= 70 && nilai < 85){
            nHuruf = 'B';
        }else if(nilai >= 60 && nilai < 70){
            nHuruf = 'C';
        }else if(nilai >= 40 && nilai < 60){
            nHuruf = 'D';
        }else{
            nHuruf = 'E';
        }
       
        return nHuruf; 
    }

    String getPredikat(char huruf){
       switch (huruf) {
        case 'A':predikat = "Apik";
            break;
        case 'B':predikat = "Baik";
            break;
        case 'C':predikat = "Cukup";
            break;
        case 'D':predikat = "Dablek";
            break;
        default:predikat = "Elek";
            break;
       }
       
        return predikat;
    }

    float getNilTugas(float nilai){
        return nilai * 20/100;
    }

    float getNilUts(float nilai){
        return nilai * 35/100;
    }

    float getNilUas(float nilai){
        return nilai * 45/100;
    }

    float getNilAkhir(float nilTugas,float nilUts,float nilUas){
        return nilTugas + nilUas + nilUts;
    }


    
}
