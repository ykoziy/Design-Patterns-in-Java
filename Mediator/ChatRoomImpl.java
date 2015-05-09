import java.util.ArrayList;

/*
 * Concrete mediator, knows about the colleagues and keeps the reference to them
 */ 
public class ChatRoomImpl implements ChatRoom {
    ArrayList<ChatUser> users;;
    
    public ChatRoomImpl() {
        users = new ArrayList<>();
    }
    
    @Override
    public void addChatUser(ChatUser user) {
        users.add(user);
    }
    
    @Override
    public void sendMessage(String msg, ChatUser user) {
        for(ChatUser i : users) {
            if(i != user) {
                i.receive(msg);
            }
        }
    }
}
