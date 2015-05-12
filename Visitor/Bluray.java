public class Bluray implements Visitable {
    private double price;
    private String upc;
    
    public Bluray(double price, String upc) {
        this.price = price;
        this.upc = upc;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getUpcNumber() {
        return upc;
    }
    
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
