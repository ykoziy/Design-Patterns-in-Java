/*
 * Colleague, an interface for the Colleagues
 */
public abstract class ChatUser {
    protected ChatRoom room;
    protected String name;
    
    public ChatUser(ChatRoom room, String name) {
        this.room = room;
        this.name = name;
    }
    
    public abstract void send(String msg);
    public abstract void receive(String msg);

}
