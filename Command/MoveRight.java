/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class MoveRight extends Command {
    public MoveRight(Player player) {
        super(player);
    }
    @Override
    public void execute() {
        player.moveRight();
    }
}
