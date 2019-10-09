package haziallatok;

public class Dog extends Pet {
    public String breed;

    public Dog(String breed, String name) {
        super(name, 4);
        this.breed = breed;
    }
    
    @Override
    public void Voice(){
        System.out.println("Vau vau...");
    }

    @Override
    public void Description() {
        System.out.printf("Ez egy %s fajtájú kutya, a neve %s\n",this.breed, super.name); 
    }
    
    
}
