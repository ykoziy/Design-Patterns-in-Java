/*
 * Visitor interface declares visit operations for all the visitable objects.
 */
public interface Visitor {
    double visit(Book book);
    double visit(Magazine magazine);
    double visit(Bluray magazine);
}
