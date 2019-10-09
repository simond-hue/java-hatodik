package pakli;

public class Kartya {
    private Kartyaszin szin;
    private Kartyaertek ertek;

    public Kartya(Kartyaszin szin, Kartyaertek ertek) {
        this.szin = szin;
        this.ertek = ertek;
    }
    
    public Kartya(){
        this.szin = Kartyaszin.KOR;
        this.ertek = Kartyaertek.KETTO;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.szin,this.ertek);
    }

    public String getSzin() {
        return this.szin.name();
    }

    public int getErtek() {
        return this.ertek.getErtek();
    }
}
