class SimCardTelkomsel{
    private int pulsa;
    private String noHp ;
    private String namaKartuSim ;
    public String kodeUmb;

    public SimCardTelkomsel(){
        this.pulsa = 20000 ;
        this.noHp = "085123321";
        this.namaKartuSim ="SimPATI";
        this.kodeUmb = "*363#";
    }

    public void infoSimCard(){
        System.out.println("No Hp : "+this.noHp);
        System.out.println("Nama SIM : "+this.namaKartuSim);
        System.out.println("Sisa Pulsa : "+this.pulsa);

    }

    public void tambahPulsa(int nominal){
        this.pulsa += nominal;
    }

    public int getPulsa() {
        return pulsa;
    }
    
}