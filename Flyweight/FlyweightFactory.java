import java.util.HashMap;
/*
 * Flyweight factory, creates and manages flyweight objects and ensures sharing of the flyweight objects
 * 
 * Intrinsic State: Color
 * Extrinsic State: x, y, x2, y2
 * 
 * New object is created only if it uses a color not previously used
 */

public class FlyweightFactory {
    private static final HashMap<String, Shape> shapeMap = new HashMap<>();
    
    public static Rectangle getRectangle(String color) {
        Rectangle rect = (Rectangle)shapeMap.get(color);
        
        if(rect == null) {
            rect = new Rectangle(color);
            shapeMap.put(color, rect);
        }
        return rect;
    }
}
