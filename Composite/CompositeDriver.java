/*
 * Composite pattern, composes objects into tree structure to represent whole-part hierarchies.
 */ 
public class CompositeDriver {
    public static void main(String[] args) { 
        EmployeeDirectory  sDirectory = new EmployeeDirectory();
        sDirectory.addEmployee(new SoftwareDeveloper(1001, "Bob", "Software Development"));
        sDirectory.addEmployee(new SoftwareDeveloper(1002, "Alice", "Software Development"));
        sDirectory.addEmployee(new Manager(1003, "Mike", "Software Development"));
        
        EmployeeDirectory  hDirectory = new EmployeeDirectory();
        hDirectory.addEmployee(new HelpDesk(2001, "John", "Help Desk"));
        hDirectory.addEmployee(new HelpDesk(2002, "George", "Help Desk"));
        hDirectory.addEmployee(new Manager(2003, "Roger", "Help Desk"));
        
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(sDirectory);
        directory.addEmployee(hDirectory);
        directory.getEmployeeInformation();
    }
}
