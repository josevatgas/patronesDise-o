/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memento;

/**
 *
 * @author josemiguelvargas
 */
public class Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here// Crear un documento y un gestor de versiones
        Documento documento = new Documento("Contenido inicial");
        HistorialVersiones gestorVersiones = new GestorVersiones(documento);

        // Realizar cambios en el documento y registrar versiones
        documento.editarDocumento("Contenido modificado 1");
        gestorVersiones.agregarVersion(documento.crearMemento());

        documento.editarDocumento("Contenido modificado 2");
        gestorVersiones.agregarVersion(documento.crearMemento());

        // Restaurar a una versión anterior
        IVersionDocumento versionAnterior = gestorVersiones.obtenerVersion(0);
        if (versionAnterior != null) {
            documento.restaurarDesdeMemento(versionAnterior);
            System.out.println("Contenido después de restaurar a la versión 1: " + documento.obtenerContenido());
        
    }
    }
}
