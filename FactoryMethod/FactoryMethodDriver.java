/*
 * Factory method defines an interface for creating an object, but let subclasses decide which class to instantiate.
 */
public class FactoryMethodDriver {
    public static void main(String[] args) {
        HelicopterCreator bell = new Bell429Creator();
        bell.create().printInfo();
        
        System.out.println();
        
        bell = new Bell407Creator();
        bell.create().printInfo();
    }
}
