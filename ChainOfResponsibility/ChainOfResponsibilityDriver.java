/*
 * Allows an object to send to send a command without knowing what object will receive and handle it
 */
public class ChainOfResponsibilityDriver {
    public static void main(String[] args) { 
        MathHandler h1 = new Addition();
        MathHandler h2 = new Subtraction();
        MathHandler h3 = new Multiplication();
        
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        
        Numbers request = new Numbers(5, 5, "mult");
        
        h1.handleRequest(request);
    }
}
