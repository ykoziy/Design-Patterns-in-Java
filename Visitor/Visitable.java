/*
 * Visitable(element) interface declares accept operation, 
 * enables objects to be "visited" by the visitor object.
 */
public interface Visitable {
    double accept(Visitor visitor);
}
