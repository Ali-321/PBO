public class MyTelkomsel {
  

    public void topUpPulsaByEbankingPayment(int nominal,SimCardTelkomsel sct,Ebanking eb){
        
       
        if (eb.getSaldo()> nominal) {
            eb.paymentEbanking(nominal);
            sct.tambahPulsa(nominal);
            System.out.println("isi pulsa sebesar "+nominal+" dan  saldo anda di Ebanking sekarang "+eb.getSaldo());
        } else {
            System.out.println("saldo anda kurang : "+(nominal - eb.getSaldo()));
        }
        
    }

    public void infoPulsa(SimCardTelkomsel sct){
        System.out.println("pulsa anda : "+sct.getPulsa());
    }


}
