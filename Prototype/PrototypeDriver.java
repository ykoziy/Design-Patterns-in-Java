/*
 * Prototype, allows to specify kind of object using prototypical instance, and create new object by cloning the prototype.
 */
public class PrototypeDriver {
    public static void main(String[] args) {       
        Sheep sheep = new Sheep(); // prototypical instance
        Sheep dolly = sheep.clone(); // new object by cloning the prototype
        
        // Just as real life clone, copy of original object but each object exists on it's own
        System.out.println("Original sheep hash code: " + System.identityHashCode(sheep));
        System.out.println("Dolly (clone) hash code: " + System.identityHashCode(dolly));
    }
}
