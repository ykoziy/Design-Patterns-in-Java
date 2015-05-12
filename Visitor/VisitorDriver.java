import java.util.ArrayList;
/*
 * Visitor pattern, allows us to perform an operation on a group of related objects at runtime.
 * Operations are decoupled from the object structure.
 */
public class VisitorDriver {
    public static void main(String[] args) { 
        ArrayList<Visitable> items = new  ArrayList<>();
        items.add(new Book(34.17, "780735619678"));
        items.add(new Magazine(5.99, "070989368248"));
        items.add(new Bluray(130.51, "024543742180"));
        
        System.out.println("\nTotal: " + calculateTotal(items));
    }
    
    private static double calculateTotal(ArrayList<Visitable> items) {
        CheckoutVisitor cashier = new CheckoutVisitor();
        double total = 0;
        for(Visitable item : items) {
            total += item.accept(cashier);
        }
        return total;
    }
}
