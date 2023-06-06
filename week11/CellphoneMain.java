public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");

        cp.powerOn();
        cp.addContacts(new Contact("udin","0814212331"));
        cp.addContacts(new Contact("budi","0814232412"));
        cp.addContacts(new Contact("irfan","081422124"));
        cp.addContacts(new Contact("ucup","0814221344"));
        cp.addContacts(new Contact("Agung","0814221144"));

        cp.printContacts();
        cp.findContactsByName("ucup");
        cp.openMyTelkomsel();

        cp.topUpPulsaEbanking(500000);
        cp.infoPulsa();
        

    }
}
