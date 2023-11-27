/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josemiguelvargas
 */
public class GestorVersiones implements HistorialVersiones {
    
    private final Documento documento;
    private final List<IVersionDocumento> historial = new ArrayList<>();

    public GestorVersiones(Documento documento) {
        this.documento = documento;
    }


    @Override
    public void agregarVersion(IVersionDocumento memento) {
        historial.add(memento);
    }

    @Override
    public IVersionDocumento obtenerVersion(int indice) {
        if (indice >= 0 && indice < historial.size()) {
            return historial.get(indice);
        }
        return null;
    }
}
