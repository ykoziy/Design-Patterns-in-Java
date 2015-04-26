/*
 * Aggregate implementation
 */
public class MovieIterator implements Iterator {
    private MovieList list;
    private int cursor = 0;
    
    public MovieIterator(MovieList list) {
        this.list = list;
    }
    
    @Override
    public boolean hasNext() {
        return cursor != list.getSize();
    }
    
    @Override
    public Object next() {
        if(this.hasNext()) {
            return list.getMovie(cursor++);
        } else {
            return null;
        }
    }
}
