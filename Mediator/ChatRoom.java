/*
 * Mediator, an interface for communicating with Colleague objects 
 */
public interface ChatRoom {
    
    void sendMessage(String msg, ChatUser user);
    void addChatUser(ChatUser user);
}
