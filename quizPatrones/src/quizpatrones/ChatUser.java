/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizpatrones;

/**
 *
 * @author josemiguelvargas
 */
public class ChatUser implements Observer {

    private String name;
    private ChatRoom chatRoom;

    public ChatUser(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        chatRoom.sendMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
