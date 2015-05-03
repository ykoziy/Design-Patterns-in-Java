/*
 * Implements the Flyweight interface and stores intrinsic(state-independent) state
 */ 
public class Rectangle implements Shape {
    private String color; // intrinsic state
    
    public Rectangle(String color) {
        this.color = color;
    }
    
    @Override
    public void draw(int x, int y, int x2, int y2) {
        System.out.println("Drawing Rectangle of " + color + 
        " color, at [" + x + ", " + y + ", " + x2 + ", " + y2 + "]");
    }
}
