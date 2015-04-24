/*
 * Factory method defines an interface for creating an object, but let subclasses decide which class to instantiate.
 */
public class FactoryMethodDriver {
    public static void main(String[] args) {
        HelicopterFactory bell = new Bell429Factory();
        bell.factoryMethod().printInfo();
        
        System.out.println();
        
        bell = new Bell407Factory();
        bell.factoryMethod().printInfo();
    }
}
