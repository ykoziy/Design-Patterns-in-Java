/*
 * Singleton pattern eliminates the option of instantiating more than one object.
 */
public class SingletonDriver {
    public static void main(String[] args) {
        //FAILS
        //Singleton object = new Singleton();
        Singleton object = Singleton.getInstance();
        object.print();
    }
}
