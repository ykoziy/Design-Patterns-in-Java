/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class Jump extends Command {
    public Jump(Player player) {
        super(player);
    }
    @Override
    public void execute() {
        player.jump();
    }
}
