/*
 * Flyweight pattern, uses sharing to support a large number of similar objects
 */
public class FlyweightDriver {
    private static final String colors[] = {"Pink", "Blue", "Red", "White", "Orange", "Black"};
    
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Rectangle rect = FlyweightFactory.getRectangle(getRandColor());
            rect.draw(getRandX(), getRandY(), getRandX(), getRandY());
        }
    }
    
    private static String getRandColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    
    private static int getRandX() {
        return (int)(Math.random()*200);
    }
    
    private static int getRandY() {
        return (int)(Math.random()*200);
    }    
}
