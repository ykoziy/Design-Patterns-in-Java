/*
 * Not part of pattern, just used to keep factory creation details away from the client
 */
public class FactoryCreator {
    private static GUIFactory fact;
    
    static GUIFactory getFactory(String choice) {
        if(choice.equals("OSX")) {
            fact = new OSXFactory();
        } else if(choice.equals("WIN"))  {
            fact = new WinFactory();
        }
        return fact;
    }
}
