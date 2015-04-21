/*
 * Refined abstraction, in this case with super modern remote
 * we can not only go to specific channel but go to the next 
 * and previous channels.
 */
public class ModernSuperRemote extends RemoteControl {
    private int currentChannel;
    public ModernSuperRemote(TV device) {
        super(device);
    }
    public void selectChannel(int channel) {
        currentChannel = channel;
        setChannel(currentChannel);
    }
    public void nextChannel() {
       currentChannel++;
       setChannel(currentChannel);
    }
    public void prevChannel() {
       currentChannel--;
       setChannel(currentChannel);
    }       
}
