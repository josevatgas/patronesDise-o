/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonexample;

/**
 *
 * @author josemiguelvargas
 */
public class SessionManager {

    private static SessionManager instance;
    private String loggedInUser;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private SessionManager() {
        // Inicializar otros datos de sesión, si es necesario
    }

    // Método para obtener la instancia única de la clase
    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    // Métodos para manejar la sesión del usuario
    public void login(String username) {
        loggedInUser = username;
        System.out.println(username + " ha iniciado sesión.");
    }

    public void logout() {
        System.out.println(loggedInUser + " ha cerrado sesión.");
        loggedInUser = null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
