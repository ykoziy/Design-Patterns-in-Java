import java.util.ArrayList;

/*
 * Aggregate implementation, in this case just a wrapper for ArrayList
 */
public class MovieList implements MovieCollection {
    private ArrayList<MovieItem> list;
    
    public MovieList() {
        list = new ArrayList<>();        
    }
    
    public void addMovie(MovieItem item) {
        list.add(item);
    }
    
    public void removeMovie(MovieItem item) {
        list.remove(item);
    }   
    
    public MovieItem getMovie(int index) {
        return list.get(index);
    }
    
    public int getSize() {
        return list.size();
    }
    
    @Override
    public Iterator createIterator() {
        return new MovieIterator(this);
    }
}
