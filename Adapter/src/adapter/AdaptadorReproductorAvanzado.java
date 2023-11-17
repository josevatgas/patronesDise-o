/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author josemiguelvargas
 */
public class AdaptadorReproductorAvanzado implements ReproductorMP3 {
    
    private ReproductorAvanzado reproductorAvanzado;

    public AdaptadorReproductorAvanzado(ReproductorAvanzado reproductorAvanzado) {
        this.reproductorAvanzado = reproductorAvanzado;
    }

    @Override
    public void reproducirMP3(String archivo) {
        System.out.println("Adaptador reproduciendo archivo avanzado como MP3: " + archivo);
        reproductorAvanzado.reproducirAvanzado(archivo);
    }

    @Override
    public void detener() {
        System.out.println("Reproducción detenida");
    }
}