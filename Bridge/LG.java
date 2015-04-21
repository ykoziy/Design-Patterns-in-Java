/*
 * Concrete implementor.
 */
public class LG implements TV {
    private String make = "LG";
    @Override
    public void on() {
        System.out.println(make + " is turned on.");
    }
    @Override
    public void off() {
        System.out.println(make + " is turned off.");
    }
    @Override
    public void changeChannel(int channel) {
        System.out.println(make + " channel changed to " + channel);
    }
}
