public class WinButton implements Button {
    private String text;
    
    public WinButton() {
        System.out.println("Windows Button created");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public void repaint() {
        System.out.println("Windows Button repaint()");
    }   
}
