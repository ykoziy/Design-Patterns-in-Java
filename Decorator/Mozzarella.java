public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Sub newSub) {
        super(newSub);
        System.out.println("Adding Mozzarella");
    }
    
    @Override
    public String getDescription() {
        return s.getDescription() + ", mozzarella";
    }
    
    @Override
    public double getCost() {
        System.out.println("Mozzarella cost: " + 0.30);
        return s.getCost() + 0.30;
    }
}
