/**
 * Context, contains reference to strategy object and 
 */
public class Context {
    private final Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int[] executeStrategy(int[] numbers) {
        return strategy.sort(numbers);
    }
}
