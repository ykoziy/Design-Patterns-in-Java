/*
 * Decorator pattern, provides a way to attach additional responsibilities to an object dynamically
 */
public class DecoratorDriver {
    public static void main(String[] args) {
        Sub italianSub = new Chicken(new Mozzarella(new ItalianSub()));
        
        System.out.println("This boring sub contains: " + italianSub.getDescription());
        System.out.println("Price: " + italianSub.getCost());
    }
    
}
