/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author josemiguelvargas
 */
public class ReproductorAvanzadoImpl implements ReproductorAvanzado {
    
    @Override
    public void reproducirAvanzado(String archivo) {
        System.out.println("Reproduciendo archivo avanzado: " + archivo);
    }

    @Override
    public void detener() {
        System.out.println("Reproducción avanzada detenida");
    }
}
