import java.util.ArrayList;

/*
 * Blog, notifies subscribers when change occurs
 */
public class Blog implements Subject {
    private ArrayList<Observer> users;
    private ArrayList<String> posts;
    
    public Blog() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        users.add(o);
    }
    
    @Override
    public void unregisterObserver(Observer o) {
        users.remove(o);
    }
    
    @Override
    public void notifyObservers() {
        for(Observer o: users) {
            o.update(posts.get(posts.size() - 1));
        }
    }
    
    public void addPost(String postTitle) {
        posts.add(postTitle);
        notifyObservers();
    }

    public String toString() {
        return posts.toString();
    }
}
