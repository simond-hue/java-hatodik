package pakli;

import java.util.LinkedList;
import java.util.List;

public class Pakli {
    private List<Kartya> kartyak;
    
    public Pakli(){
        this.kartyak = new LinkedList<>();
        
        for (Kartyaszin szin : Kartyaszin.values()) {
            for (Kartyaertek ertek : Kartyaertek.values()) {
                this.kartyak.add(new Kartya(szin,ertek));
            }
        }
    }
    public void Kever(){
        for(int i = 0; i < 1000; i++){
            int veletleni = (int)(Math.random()*(this.kartyak.size()));
            int veletlenj = (int)(Math.random()*(this.kartyak.size()));
            
            Kartya temp = this.kartyak.get(veletleni);
            this.kartyak.set(veletleni,this.kartyak.get(veletleni));
            this.kartyak.set(veletlenj,temp);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < this.kartyak.size(); i++){
            s+=kartyak.get(i).getSzin() + " " + kartyak.get(i).getErtek() + "\n";
        }
        return s;
    }
}
