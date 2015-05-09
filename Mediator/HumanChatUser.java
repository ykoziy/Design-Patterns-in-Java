/*
 * Concrete colleague, keeps reference to the mediator 
 */ 
public class HumanChatUser extends ChatUser {
    
    public HumanChatUser(ChatRoom room, String name) {
        super(room, name);
    }
 
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message: "+msg);
        room.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message: "+msg);
    }
}
