/*
 * Proxy pattern, provides a surrogate or placeholder for another object to control access to it.
 * 
 * In this example it is a Protection Proxy, where proxy controls access to real subject. The other scenarios are:
 * 
 * Virtual Proxy -  delays the creation and initialization of expensive objects until needed
 * Remote Proxy - provides a local representation for an object that is in different address space
 */
public class ProxyDriver {
    public static void main(String[] args) { 
        ServerAccess sa = new ProxyServerAccess("alice", "password");
        sa.adminAccess();
        
        System.out.println();
        
        sa = new ProxyServerAccess("bob", "admin");
        sa.adminAccess();
    }
}
