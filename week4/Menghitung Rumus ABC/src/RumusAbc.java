public class RumusAbc {
    // atribut
    float a,b,c,d;
    Akar akar = new Akar(0, 0);
    
    class Akar{

        float x,x2;
        
        Akar(float x,float x2){
            this.x = x;
            this.x2 = x2;
        }

    }

    
    // Method
    float getDeterminan(){        
        return (float) (Math.pow(b, 2) - 4 * a * c );
    }

    Akar getRumusAbc(){
        
        float x ,x2;
       

        if (d > 0) {
          x = ((-b + ((float)Math.sqrt(d)))/(2*a));
          x2 = ((-b - ((float)Math.sqrt(d)))/(2*a));
          akar = new Akar(x,x2);
        }else if (d == 0) {
            x  = -b / (2 * a);
            x2 = -b / (2 * a);
            akar = new Akar(x,x2);
        }else if (d < 0) {
            x  = (-b + ((float)Math.sqrt(Math.abs(d))))/(2*a);
            x2 = (-b - ((float)Math.sqrt(Math.abs(d))))/(2*a);
            akar = new Akar(x,x2);
        }   
        return akar;

    
    }

    void cetakPerhitungan(){
        
        if (this.d < 0) {
            System.out.printf("x1 = %.1fi \nx2 = %.1fi \n",akar.x,akar.x2);
        }else{
            System.out.printf("x1 = %.1f  \nx2 = %.1f \n",akar.x,akar.x2);
        }
        
    }

     
}
