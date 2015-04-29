public class OSXWindow implements Window {
    private String title;
    
    public OSXWindow() {
        System.out.println("OSX Window created");
    }
    
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void repaint() {
        System.out.println("OSX Window repaint()");
    }
}
