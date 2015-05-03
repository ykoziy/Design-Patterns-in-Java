/*
 * Leaf, represents leaf object and implements Component methods
 */ 
public class Manager implements Employee {
    private String name;
    private long id;
    private String department;
    
    public Manager(long id, String name, String department) {
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
