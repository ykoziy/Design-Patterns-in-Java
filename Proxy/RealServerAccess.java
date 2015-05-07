/*
 * Real subject, real object that the proxy represents
 */
public class RealServerAccess implements ServerAccess {
    @Override
    public void adminAccess() {
        System.out.println("Server admin access granted.");
    }
}
