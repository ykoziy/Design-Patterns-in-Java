public class WinWindow implements Window {
    private String title;
    
    public WinWindow() {
        System.out.println("Windows Window created");
    }
    
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void repaint() {
        System.out.println("Windows Window repaint()");
    }    
}
