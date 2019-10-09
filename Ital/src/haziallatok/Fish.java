package haziallatok;

public class Fish extends Pet {
    public String type;

    public Fish(String type, String name) {
        super(name,0);
        this.type = type;
    }
    
    @Override
    public void Description(){
        System.out.printf("%s nevű hal", super.name);
    }
    
    @Override
    public void Voice(){}
}
