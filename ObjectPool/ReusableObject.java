import java.util.Calendar;
/*
 * Object that is slow to instantiate and must be held in the object pool.
 */ 
public class ReusableObject {
    Calendar cal = Calendar.getInstance();
    private String created = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE)  + ":" + cal.get(Calendar.SECOND);
    
    public ReusableObject() {
        System.out.println("New object created");
    }
    
    public String getTime() {
        return created;
    }
}
