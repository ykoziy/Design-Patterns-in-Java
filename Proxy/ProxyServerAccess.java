/*
 * Proxy, in this example controls access to real subject
 */
public class ProxyServerAccess implements ServerAccess {
    private String user;
    private String password;
    private RealServerAccess server;
    
    public ProxyServerAccess(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    @Override
    public void adminAccess() {
        if(user.equalsIgnoreCase("bob") && password.equalsIgnoreCase("admin")) {
            server = new RealServerAccess();
            server.adminAccess();
        } else {
            System.out.println("You are not admin, admin access denied.");
        }
    }
}
