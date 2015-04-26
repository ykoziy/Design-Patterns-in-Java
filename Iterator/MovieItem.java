public class MovieItem {
    private String title;
    private int year;
    
    public MovieItem(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + " Year: " + year;
    }
}
