/*
 * Handler, defines an interface for handling requests
 */
public abstract class MathHandler {
    protected MathHandler successor;
    
    public void setSuccessor(MathHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(Numbers request);
}
