/*
 * Composite, stores child components and implements methods defined by the Composite interface
 */
import java.util.ArrayList;
public class EmployeeDirectory implements Employee {
    private ArrayList<Employee> list =  new ArrayList<>();
    
    @Override
    public void getEmployeeInformation() {
        for(Employee emp : list) {
            emp.getEmployeeInformation();
        }
    }
    
    public void addEmployee(Employee e) {
        list.add(e);
    }
    
    public void removeEmployee(Employee e) {
        list.remove(e);
    }
}
