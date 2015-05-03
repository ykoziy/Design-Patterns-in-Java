/*
 * Leaf, represents leaf object and implements Component methods
 */ 
public class HelpDesk implements Employee {
    private String name;
    private long id;
    private String department;
    
    public HelpDesk(long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    
    @Override
    public void getEmployeeInformation() {
        System.out.println("ID: " + id + "\n" +
                           "Name: " + name + "\n" +
                           "Department: " + department + "\n");
    }
}
