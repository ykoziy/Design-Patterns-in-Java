/*
 * Mediator pattern, defines simplified communications between classes where the mediator
 * handles all the communications.
 */
public class MediatorDriver {
    public static void main(String[] args) { 
        ChatRoom room = new ChatRoomImpl();
        ChatUser user = new HumanChatUser(room, "Alice");
        ChatUser user1 = new HumanChatUser(room, "Bob");
        ChatUser user2 = new HumanChatUser(room, "Jonathan");
        ChatUser user3 = new BotChatUser(room, "Dalek");
        
        room.addChatUser(user);
        room.addChatUser(user1);
        room.addChatUser(user2);
        room.addChatUser(user3);
        
        user3.send("Exterminate! Exterminate! Exterminate! ");
    } 
}
