/*
 * Abstract factory defines an interface for creating families of related or dependent objects without
 * specifying their concrete classes.
 * 
 * Factory Method vs Abstract Factory (key difference):
 * 
 * In factory method each factory creates one product,
 * but in abstract factory each factory creates
 * a family of related products.
 */
public class AbstractFactoryDriver {
    public static void main(String[] args) {
        GUIFactory fact;
        Window window;
        Button button;
        String osName = getOS();
        
        if(osName.contains("os x")) {
            // not tested with OSX, but should work
            fact = FactoryCreator.getFactory("OSX");
            window = fact.createWindow();
            button = fact.createButton();
            window.repaint();
            
        } else if(osName.contains("windows")) {
            fact = FactoryCreator.getFactory("WIN");
            window = fact.createWindow();
            button = fact.createButton();
            window.repaint();
        }
        
    }
    
    private static String getOS() {
        return System.getProperty("os.name").toLowerCase();  
    }
}
