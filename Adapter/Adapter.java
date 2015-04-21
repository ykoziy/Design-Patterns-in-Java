/*
 * Adapter converts the interface of existing class into another interface client expects.
 */ 
public class Adapter implements TargetInterface {
    private Adaptee ad;
    
    public Adapter() {
        ad = new Adaptee();    
    }
    @Override
    public void doAction() {
        ad.doStuff();
    }
}
