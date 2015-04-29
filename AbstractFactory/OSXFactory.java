public class OSXFactory implements GUIFactory {   
    @Override
    public Button createButton() {
        return new OSXButton();
    }
    
    @Override
    public Window createWindow() {
        return new OSXWindow();
    }
}
