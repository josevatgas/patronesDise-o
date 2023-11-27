/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author josemiguelvargas
 */
public class Documento {
    
    private String contenido;
    private String fechaModificacion;

    public Documento(String contenido) {
        this.contenido = contenido;
        this.fechaModificacion = "Fecha inicial";
    }

    public String obtenerContenido() {
        return contenido;
    }

    public void editarDocumento(String nuevoContenido) {
        contenido = nuevoContenido;
        fechaModificacion = obtenerFechaActual();
    }

    public IVersionDocumento crearMemento() {
        return new VersionDocumento(contenido, fechaModificacion);
    }

    public void restaurarDesdeMemento(IVersionDocumento memento) {
        if (memento instanceof VersionDocumento) {
            VersionDocumento version = (VersionDocumento) memento;
            this.contenido = version.obtenerContenido();
            this.fechaModificacion = version.obtenerFecha();
        }
    }

    private String obtenerFechaActual() {
        return "Fecha actual";
    }
}
