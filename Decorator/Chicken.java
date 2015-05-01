public class Chicken extends ToppingDecorator {
    public Chicken(Sub newSub) {
        super(newSub);
        System.out.println("Adding Chicken");
    }
    
    @Override
    public String getDescription() {
        return s.getDescription() + ", chicken";
    }
    
    @Override
    public double getCost() {
        System.out.println("Chicken cost: " + 1.99);
        return s.getCost() + 1.99;
    }
}
