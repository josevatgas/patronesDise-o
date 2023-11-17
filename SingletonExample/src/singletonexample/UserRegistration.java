/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonexample;

/**
 *
 * @author josemiguelvargas
 */
public class UserRegistration {
    
    public void registerUser(String username) {
        // Obtener la instancia única del gestor de sesiones
        SessionManager sessionManager = SessionManager.getInstance();

        // Registra al usuario
        System.out.println("Registrando usuario: " + username);

        // Inicia sesión automáticamente después de registrarse
        sessionManager.login(username);
    }
}
