/*
 * Abstract class that uses TV object.
 */
abstract class RemoteControl {
    private TV tv;
    protected RemoteControl(TV tv) {
        this.tv = tv;
    }
    protected void turnOn() {
        tv.on();
    }
    protected void turnOff() {
        tv.off();
    }
    protected void setChannel(int channel) {
        tv.changeChannel(channel);
    }
}
