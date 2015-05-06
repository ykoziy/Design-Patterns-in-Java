/*
 * Context, defines the interface of interest to clients and has internal states that define its behavior
 */ 
public class Wolf {
    private State state;
    
    public Wolf() {
        state = new SleepState();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    public void action() {
        state.handle();
    }
    
    public void passTime() {
        System.out.println("8 hours assed....");
        if(state.getClass().equals(SleepState.class)) {
            setState(new HungerState());
        } else {
            setState(new SleepState());
        }
    }
}
