public class CheckoutVisitor implements Visitor {
    @Override
    public double visit(Book book) {
        double price = book.getPrice();
        System.out.println("Book UPC: " + book.getUpcNumber() + " | Price: " + price);
        return price;
    }
    
    @Override
    public double visit(Magazine magazine) {
        double price = magazine.getPrice();
        System.out.println("Magazine UPC: " + magazine.getUpcNumber() + " | Price: " + price);
        return price;        
    }
    
    @Override
    public double visit(Bluray bluray) {
        double price = bluray.getPrice();
        System.out.println("Blu-ray: " + bluray.getUpcNumber() + " | Price: " + price);
        return price;        
    }
}
