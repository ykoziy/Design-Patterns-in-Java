/*
 * Concrete implementor.
 */
public class Vizio implements TV {
    private String make = "Vizio";
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
        System.out.println(make + " is at channel " + channel);
    }
}
