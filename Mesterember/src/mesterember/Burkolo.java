package mesterember;

public class Burkolo extends MesteremberA {
    Helyszin helyszin;

    public Burkolo(String nev, int napiDij, Helyszin helyszin) {
        super(nev, napiDij);
        this.helyszin = helyszin;
    }
    
    public int osszesSzabadnap(){
        int db = 0;
        for(int i = 0; i < super.foglaltNapok.length; i++){
            if(!super.foglaltNapok[i]){
                db++;
            }
        }
        return db;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+" --- %s\n",this.helyszin);
    }

    @Override
    public boolean MunkaVallal(int param) {
        if(!super.foglaltNapok[param-1]){
            super.foglaltNapok[param-1] = true;
            return true;
        }
        else{
            return false;
        }
    }
}
