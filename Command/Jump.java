/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class Jump implements Command {
    private Player player;
    public Jump(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.jump();
    }
}
