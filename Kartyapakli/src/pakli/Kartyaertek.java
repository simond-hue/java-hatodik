package pakli;

public enum Kartyaertek {
    KETTO(2),
    HAROM(3),
    NEGY(4),
    OT(5),
    HAT(6),
    HET(7),
    NYOLC(8),
    KILENC(9),
    TIZ(10),
    JUMBO(10),
    DAMA(10),
    KIRALY(10),
    ASZ(11);
    
    private int ertek;
    
    private Kartyaertek(int ertek){
        this.ertek = ertek;
    }
    
    public int getErtek(){
        return this.ertek;
    }
}
