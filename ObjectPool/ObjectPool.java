import java.util.ArrayList;
/*
 * Pool, creates and manages a pool of objects.
 */
public class ObjectPool {
    private static ArrayList<ReusableObject> inUse, available;
    private static final ObjectPool INSTANCE = new ObjectPool();
    
    private ObjectPool() {
        inUse = new ArrayList<>();
        available = new ArrayList<>();
    }
    
    public static ObjectPool getInstance() {
        return INSTANCE;
    }
    
    public static ReusableObject acquireReusable() {
        if(available.size() == 0) {
            ReusableObject obj = new ReusableObject();
            inUse.add(obj);
            return obj;
        } else {
            ReusableObject obj = available.get(available.size() - 1);
            inUse.add(obj);
            available.remove(available.size() - 1);
            return obj;
        }
    }
    
    public static void releaseReusable(ReusableObject obj) {
        available.add(obj);
        inUse.remove(obj);
    }
}
