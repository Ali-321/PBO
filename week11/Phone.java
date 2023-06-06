public interface Phone
{
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();

    //kontak
    void addContacts(Contact contact);
    void printContacts() ;
    void findContactsByName(String searchName);

    //telephone
    void Telephone(String no);

    
    // aplikasi mytelkomsel
    void openMyTelkomsel();
    void closeMyTelkomesel();
    void topUpPulsaEbanking(int jumPulsa);
    void infoPulsa();



  


}