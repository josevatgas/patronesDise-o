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
        
        Bebida cafe = new Cafe();

        Bebida cafeConLecheYAzucar = new AzucarDecorator(new LecheDecorator(cafe));

        System.out.println("Descripción: " + cafeConLecheYAzucar.obtenerDescripcion());
        System.out.println("Costo: $" + cafeConLecheYAzucar.obtenerCosto());
    }
    
}
