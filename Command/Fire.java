/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class Fire implements Command {
    private Player player;
    public Fire(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.fire();
    }
}
