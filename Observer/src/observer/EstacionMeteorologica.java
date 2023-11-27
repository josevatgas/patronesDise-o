/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author josemiguelvargas
 */
public class EstacionMeteorologica extends java.util.Observable {
    
    private int temperatura;

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers(temperatura);
    }

    public int getTemperatura() {
        return temperatura;
    }
    
}
