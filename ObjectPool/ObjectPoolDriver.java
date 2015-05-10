import java.util.Date;
/*
 * Object Pool pattern reuses objects that are expensive to create.
 */
public class ObjectPoolDriver {
    public static void main(String[] args) {
        ReusableObject obj = ObjectPool.getInstance().acquireReusable();
        ReusableObject obj1 = ObjectPool.getInstance().acquireReusable();
        ReusableObject obj2 = ObjectPool.getInstance().acquireReusable();
        
        System.out.println("Releasing 3 objects....");
        
        ObjectPool.getInstance().releaseReusable(obj2);
        ObjectPool.getInstance().releaseReusable(obj1);
        ObjectPool.getInstance().releaseReusable(obj);
        
        System.out.println("Waiting 2 seconds....");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Acquiring 3 objects from the object pool....");
        
        obj = ObjectPool.getInstance().acquireReusable();
        obj1 = ObjectPool.getInstance().acquireReusable();
        obj2 = ObjectPool.getInstance().acquireReusable();        
        Date date = new Date();
        System.out.println("Current date and time: " + date.toString());
        System.out.println("Object 1 was instantiated at: " + obj.getTime());
        System.out.println("Object 2 was instantiated at: " + obj1.getTime());
        System.out.println("Object 3 was instantiated at: " + obj2.getTime());
    }
}
