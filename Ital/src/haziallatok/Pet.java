package haziallatok;

public abstract class Pet {
    protected String name;
    protected int numberOfLegs;

    public Pet(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }
    
    public void Description(){
        System.out.println("nem sokat tudunk erről az állatról");
    }
    
    public int HowManyLegs(){
        return this.numberOfLegs;
    }
    
    public abstract void Voice();
}
