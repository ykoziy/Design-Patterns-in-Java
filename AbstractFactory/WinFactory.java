public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
    
    @Override
    public Window createWindow() {
        return new WinWindow();
    }  
}
