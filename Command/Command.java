/*
 * Interface for executing an operation.
 */
public abstract class Command {
    protected Player player;
    
    public Command(Player player)
    {
        this.player = player;
    }
    
    public abstract void execute();
}
