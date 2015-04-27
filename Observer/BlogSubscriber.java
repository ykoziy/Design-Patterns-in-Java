/*
 * BlogSubscriber, object that gets notified when Blog gets new post
 */
public class BlogSubscriber implements Observer {
    private String name;
    
    public BlogSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String title) {
        System.out.println("-------- New Blog Post --------");
        System.out.println(name + " is notified.");
        System.out.println(title);
        System.out.println("");
    }
    
}
