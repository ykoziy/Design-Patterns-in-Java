/*
 * Flyweight, declares interface through which flyweights can recieve and act on extrinsic(state-dependent) state
 */
public interface Shape {
    void draw(int x, int y, int x2, int y2);
}
