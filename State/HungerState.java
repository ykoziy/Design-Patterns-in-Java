public class HungerState implements State {
    private Wolf wolf;
    
    @Override
    public void handle() {
        System.out.println("Wolf is in hunger state, looking for prey.");
    }
}
