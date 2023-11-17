/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author josemiguelvargas
 */
public class AzucarDecorator extends AdicionalDecorator {
    
    public AzucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", Azúcar";
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 0.2;
    }
}
