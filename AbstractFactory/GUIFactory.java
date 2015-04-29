/*
 * Abstract factory, interface for operations that create products
 */
public interface GUIFactory {
    Button createButton();
    Window createWindow();
}
