package haziallatok;

import java.util.ArrayList;
import java.util.List;

public class HaziAllatok {

    public static void main(String[] args) {
        Dog gyilkos = new Dog("neger","gyilkos");
        Fish aranyka = new Fish("buzi","cigany");
        
        List<Pet> haziAllatLista = new ArrayList();
        haziAllatLista.add(gyilkos);
        haziAllatLista.add(aranyka);
        
        for (Pet pet : haziAllatLista) {
            System.out.println(pet.HowManyLegs());
            pet.Description();
        }
    }
    
}
