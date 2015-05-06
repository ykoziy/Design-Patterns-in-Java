/*
 * State pattern, allows an object to alter its behavior when its internal state changes.
 */
public class StateDriver {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.action();
        wolf.passTime();
        wolf.action();
        wolf.passTime();
        wolf.action();        
    }
}
