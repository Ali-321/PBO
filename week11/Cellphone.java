import java.lang.Math;
import java.util.ArrayList;


public class Cellphone  implements Phone{
    private ArrayList<Contact> cpc = new ArrayList<Contact>();
    private SimCardTelkomsel sct = new SimCardTelkomsel();
    private MyTelkomsel mt = new MyTelkomsel();
    private Ebanking eb = new Ebanking();

    String merk;
    String type;
    int batteryLevel;
    boolean status;
    boolean statusAppTelkomsel;
    int volume;
    
    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = true;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = false;
        System.out.println("Ponsel mati");
    }

    
    public void volumeUp(){
        if(this.status){
               this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
        else
        { 
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
    }

    public void volumeDown(){

        if(this.status){
            this.volume--;
            if(this.volume<=0)
            {
                this.volume = 0;
            }
        }
        else
        {
  
            System.out.println("Ponsel mati. Tidak dapat menurunkan  volume");
        }
    }

    public int getVolume(){
         if(this.status){
            return this.volume;
        }
        else
        {     
            System.out.println("Ponsel mati. Tidak dapat menampilkan nilai volume");
            return this.volume = 0;
        }
       
    }

    //kontak
    public void addContacts(Contact contact) {
        if (this.status) {
            cpc.add(contact);
        } else {
            System.out.println("posel mati. tidak bisa menambahkan kontak");
        }
        
        
    }

    public void printContacts() {
        if (this.status) {
            System.out.println("You have " + cpc.size() + " contacts in your mobile phone.");
            for (int i = 0; i < cpc.size(); i++) {
                System.out.println((i + 1) + ". " + cpc.get(i).getNama() + " -> " + cpc.get(i).getNomor());
            }
        } else {
            System.out.println("ponsel mati.tidak bisa menampilkan kontak");
        }
       
    }

    public void findContactsByName(String searchName){
        if (this.status) {
            int check = -1;
            for (int i = 0; i < cpc.size(); i++) {
                if (cpc.get(i).getNama().equals(searchName)) {
                   check = i;
                }          
            }
    
            if (check != -1) {
                System.out.println("found it !! ");
                System.out.println((check + 1) + ". " + cpc.get(check).getNama() + " -> " + cpc.get(check).getNomor());
            }else{
                System.out.println("contact not found");
            }
        } else {
            System.out.println("Posel mati .tidak bisa mencari kontak y");
        }

      

    }

    //telephone
    public void Telephone(String no){
        if (this.status) {
            if(no.equals(sct.kodeUmb)){
                sct.infoSimCard();
           }else{
               System.out.println("...... menyambung kan nomor yang dituju .........");
           }
        } else {
            System.out.println("Ponsel mati. tidak bisa menggunakan fitur telephone");
        }
       
    }

    // aplikasi mytelkomsel
    void openMyTelkomsel(){
        if (this.status) {
            this.statusAppTelkomsel = true;
            System.out.println("My Telkomsel App is open");
            mt.infoPulsa(sct);
        } else {
            System.out.println("your phone is turn off cant not open this app");
        }
    }

    void closeMyTelkomesel(){
        if (this.status) {
            this.statusAppTelkomsel = false;
            System.out.println("My Telkomsel App is off");
        } else {
            System.out.println("your phone is turn off ");
        }
    }

   public void topUpPulsaEbanking(int jumPulsa){
        if (this.status) {
            if (statusAppTelkomsel) {
                mt.topUpPulsaByEbankingPayment(jumPulsa,sct,eb);
                
            }else{
                System.out.println("My telkomsel APP is off now !!");
            }
        } else {
            System.out.println("your phone is turn off ");
        }

    }

    public void infoPulsa(){
        if (this.status ) {
            if (statusAppTelkomsel) {
                mt.infoPulsa(sct);
            }else{
                System.out.println("My telkomsel APP is off now !!");
            }
        } else {
            System.out.println("your phone is turn off ");
        }
    }



  

}
