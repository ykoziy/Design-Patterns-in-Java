/*
 * Concrete colleague, keeps reference to the mediator 
 */ 
public class BotChatUser extends ChatUser {
    
    public BotChatUser(ChatRoom room, String name) {
        super(room, name);
    }
 
    @Override
    public void send(String msg){
        System.out.println(this.name+": Says: "+msg);
        room.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Gets: "+msg);
    }
}
