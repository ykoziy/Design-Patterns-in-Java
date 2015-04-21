/*
 * Implementing Command interface to execute actual command on Receiver.
 */
public class MoveRight implements Command {
    private Player player;
    public MoveRight(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.moveRight();
    }
}
