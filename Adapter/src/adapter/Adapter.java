/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author josemiguelvargas
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ReproductorMP3 reproductorMP3 = new ReproductorMP3Impl();
        ReproductorAvanzado reproductorAvanzado = new ReproductorAvanzadoImpl();
        ReproductorMP3 adaptador = new AdaptadorReproductorAvanzado(reproductorAvanzado);

        // Reproducir archivos MP3 y avanzados
        reproductorMP3.reproducirMP3("cancion.mp3");
        reproductorMP3.detener();

        adaptador.reproducirMP3("cancion.flac");
        adaptador.detener();
    }
    
}
