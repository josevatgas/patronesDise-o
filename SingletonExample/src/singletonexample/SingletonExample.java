/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonexample;

/**
 *
 * @author josemiguelvargas
 */
public class SingletonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.registerUser("usuarioEjemplo");

        // Obtener la instancia del gestor de sesiones y mostrar el usuario conectado
        SessionManager sessionManager = SessionManager.getInstance();
        String loggedInUser = sessionManager.getLoggedInUser();
        System.out.println("Usuario conectado: " + loggedInUser);
    }
    
}
