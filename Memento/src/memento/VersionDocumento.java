/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author josemiguelvargas
 */
public class VersionDocumento implements IVersionDocumento {
    
    private final String contenido;
    private final String fecha;

    public VersionDocumento(String contenido, String fecha) {
        this.contenido = contenido;
        this.fecha = fecha;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }

    @Override
    public String obtenerFecha() {
        return fecha;
    }
    
}
