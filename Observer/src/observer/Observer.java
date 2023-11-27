/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

import java.util.Random;

/**
 *
 * @author josemiguelvargas
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una instancia de la estación meteorológica (sujeto)
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        // Creamos observadores (aplicación móvil y panel de control en línea)
        AplicacionMovil appMovil = new AplicacionMovil("WeatherApp");
        PanelControlEnLinea panelEnLinea = new PanelControlEnLinea("UbicacionA");

        // Registramos los observadores con la estación meteorológica
        estacion.addObserver(appMovil);
        estacion.addObserver(panelEnLinea);

        // Simulamos cambios en la temperatura (cada 5 segundos)
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int nuevaTemperatura = random.nextInt(30) + 10; // Temperatura entre 10 y 40 grados Celsius
            estacion.setTemperatura(nuevaTemperatura);

            try {
                Thread.sleep(5000); // Espera de 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
    }
    
}
