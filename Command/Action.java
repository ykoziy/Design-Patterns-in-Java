/*
 * Invoker, ask command to carry out an operation.
 */
public class Action {
    //can also store command history
    public void doAction(Command cmd) {
        cmd.execute();
    } 
}
