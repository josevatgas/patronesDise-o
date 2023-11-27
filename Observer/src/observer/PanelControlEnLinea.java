/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author josemiguelvargas
 */
public class PanelControlEnLinea implements java.util.Observer {
    
    private String ubicacion;

    public PanelControlEnLinea(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof EstacionMeteorologica) {
            int nuevaTemperatura = (int) arg;
            System.out.println("Panel de control en línea (" + ubicacion + "): Nueva temperatura: " + nuevaTemperatura);
        }
    }
    
}
