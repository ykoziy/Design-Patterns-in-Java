/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class Fire extends Command {
    public Fire(Player player) {
        super(player);
    }
    @Override
    public void execute() {
        player.fire();
    }
}
