/*
 * Iterator allows a client to access the elements of a collection without exposing internal structure
 */
public class IteratorDriver {
    public static void main(String[] args) { 
        MovieList list = new MovieList();
        list.addMovie(new MovieItem("Apocalypse Now", 1979));
        list.addMovie(new MovieItem("The Last King of Scotland", 2006));
        list.addMovie(new MovieItem("Fight Club", 1999));
        list.addMovie(new MovieItem("The Shawshank Redemption", 1994));
        
        MovieIterator iterator = new MovieIterator(list);
        
        System.out.println("Iterating over movie collection:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
