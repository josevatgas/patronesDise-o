/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author josemiguelvargas
 */
public class LecheDecorator extends AdicionalDecorator {
    
    public LecheDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", Leche";
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 0.5;
    }
}