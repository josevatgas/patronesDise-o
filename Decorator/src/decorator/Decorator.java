/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author josemiguelvargas
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una bebida básica
        Bebida cafe = new Cafe();

        // Decoramos la bebida con leche y azúcar
        Bebida cafeConLecheYAzucar = new AzucarDecorator(new LecheDecorator(cafe));

        // Mostramos la descripción y el costo de la bebida decorada
        System.out.println("Descripción: " + cafeConLecheYAzucar.obtenerDescripcion());
        System.out.println("Costo: $" + cafeConLecheYAzucar.obtenerCosto());
    }
    
}
