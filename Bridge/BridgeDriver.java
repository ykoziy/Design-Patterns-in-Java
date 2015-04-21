/*
 * TVs and remotes change, so with bridge pattern we decouple 
 * an abstraction from its implementation so that 
 * the two can vary independently.
 */
public class BridgeDriver {
    public static void main(String[] args) { 
        LG lg = new LG();
        ModernSuperRemote msr = new ModernSuperRemote(lg);
        msr.turnOn();
        msr.selectChannel(5);
        msr.prevChannel();
    }
}
