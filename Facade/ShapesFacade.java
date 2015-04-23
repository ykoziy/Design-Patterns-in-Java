/*
 * Facade hides the complexity of a large system by providing simple interface. 
 */ 
public class ShapesFacade {
    private Shape cone;
    private Shape cube;
    private Shape sphere;
    
    public ShapesFacade() {
        cone = new Cone();
        cube = new Cube();
        sphere = new Sphere();
    }
    
    public void drawCone() {
        cone.draw();
    }
    
    public void drawCube() {
        cube.draw();
    }
    
    public void drawSphere() {
        sphere.draw();
    }
}
