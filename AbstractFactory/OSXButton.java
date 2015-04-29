public class OSXButton implements Button {
    private String text;
    
    public OSXButton() {
        System.out.println("OSX Button created");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public void repaint() {
        System.out.println("OSX Button repaint()");
    }    
}
