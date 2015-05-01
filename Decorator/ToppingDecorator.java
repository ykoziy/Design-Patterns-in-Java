/*
 * Decorator, has reference to a Component object and defines an interface conforming to Component
 */
public abstract class ToppingDecorator implements Sub {
    protected Sub s;
    
    public ToppingDecorator(Sub s) {
        this.s = s;
    }
    
    
    @Override
    public String getDescription() {
        return s.getDescription();
    }
    
    @Override
    public double getCost() {
        return s.getCost();
    }
}
