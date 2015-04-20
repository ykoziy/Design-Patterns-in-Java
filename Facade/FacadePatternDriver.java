/*
 * Client only knows that ShapesFacade can draw various shapes.
*/
public class FacadePatternDriver {
    public static void main(String[] args) {
        ShapesFacade sf = new ShapesFacade();
        sf.drawCone();
        sf.drawCube();
        sf.drawSphere();
    }
}