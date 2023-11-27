/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author josemiguelvargas
 */
public interface HistorialVersiones {
    
    public void agregarVersion(IVersionDocumento memento);
    public IVersionDocumento obtenerVersion(int indice);
}
