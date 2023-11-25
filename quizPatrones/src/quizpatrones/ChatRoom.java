/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizpatrones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josemiguelvargas
 */
public class ChatRoom implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        this.notifyObservers(((ChatUser) observer).getName() + " has joined the chat.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        this.notifyObservers(((ChatUser) observer).getName() + " has left the chat.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
    @Override
    public void sendMessage(ChatUser sender, String message) {
        System.out.println(sender.getName() + " sent a message: " + message);
        notifyObservers(message);
    }
}
