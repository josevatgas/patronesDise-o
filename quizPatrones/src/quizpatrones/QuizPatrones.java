/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpatrones;

/**
 *
 * @author josemiguelvargas
 */
public class QuizPatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ChatRoom chatRoom = new ChatRoom();
        
        // Crear usuarios
        ChatUser user1 = new ChatUser("Tatiana",chatRoom);
        ChatUser user2 = new ChatUser("Jose",chatRoom);
        ChatUser user3 = new ChatUser("Juan",chatRoom);

        // Crear sala de chat
        

        // Suscribir usuarios a la sala de chat
        chatRoom.subscribe(user1);
        chatRoom.subscribe(user2);
        chatRoom.subscribe(user3);
        
        user3.sendMessage("Hola");


        // Desuscribir un usuario
        chatRoom.unsubscribe(user2);

    }
    
}
