/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author josemiguelvargas
 */
public class AplicacionMovil implements java.util.Observer {
   
    private String nombre;

    public AplicacionMovil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof EstacionMeteorologica) {
            int nuevaTemperatura = (int) arg;
            System.out.println("Aplicación móvil '" + nombre + "': Nueva temperatura: " + nuevaTemperatura);
        }
    }
    
}
