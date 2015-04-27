/*
 * Observer, defines a one-to-many relationship between objects so that when one object changes state, all its dependents get notified
 */
public class ObserverDriver {
    public static void main(String[] args) { 
        Blog blog = new Blog();
        blog.registerObserver(new BlogSubscriber("Alice"));
        blog.registerObserver(new BlogSubscriber("Bob"));
        blog.registerObserver(new BlogSubscriber("John"));
        
        blog.addPost("Digital Photography Composition Tips");
        blog.addPost("ISO settings explained");
        
    }
}
