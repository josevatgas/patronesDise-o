/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author josemiguelvargas
 */
public class ReproductorMP3Impl implements ReproductorMP3 {
    
    @Override
    public void reproducirMP3(String archivo) {
        System.out.println("Reproduciendo archivo MP3: " + archivo);
    }

    @Override
    public void detener() {
        System.out.println("Reproducción detenida");
    }
}
