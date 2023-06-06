public class Ebanking {
    private int saldo ;
    
    public Ebanking(){
        this.saldo = 1000000;
    }
    public int getSaldo() {
        return saldo;
    }
    public int paymentEbanking(int nominal){
        if (nominal < saldo){
           return this.saldo -= nominal;
        }else{
            return this.saldo;
        }
    }
}
