public class SleepState implements State {
    @Override
    public void handle() {
        System.out.println("Wolf is in sleep state.");
    }
}
