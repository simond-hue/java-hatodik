package mesterember;

import java.util.ArrayList;
import java.util.List;

public class Mesterember {

    public static void main(String[] args) {
        List<MesteremberA> mesteremberLista = new ArrayList();
        mesteremberLista.add(new Burkolo("Tapéta Lajos",60,Helyszin.Belso));
        mesteremberLista.add(new VizvezetekSzerelo("Megszer Elek", 12, 3));
        mesteremberLista.add(new Burkolo("Vakolat Péter",50,Helyszin.Kulso));
        mesteremberLista.add(new VizvezetekSzerelo("Víz Elek", 15, 5));
        mesteremberLista.add(new Burkolo("Eresz János",30,Helyszin.Kulso));
        
        for(int i = 0; i < mesteremberLista.size(); i++){
            System.out.println(mesteremberLista.get(i));
        }
    }
    
}
