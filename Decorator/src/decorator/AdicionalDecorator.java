/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author josemiguelvargas
 */
public abstract class AdicionalDecorator implements Bebida {
    
    private Bebida bebida;

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion();
    }

    @Override
    public double obtenerCosto() {
        return bebida.obtenerCosto();
    }
}
