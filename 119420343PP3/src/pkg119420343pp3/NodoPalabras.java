/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class NodoPalabras {
    private DatoPalabras elemento;
    private NodoPalabras siguiente;

    public NodoPalabras(DatoPalabras elemento) {
        this.elemento = elemento;
    }

    public DatoPalabras getElemento() {
        return elemento;
    }

    public void setElemento(DatoPalabras elemento) {
        this.elemento = elemento;
    }

    public NodoPalabras getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPalabras siguiente) {
        this.siguiente = siguiente;
    }
    
 
    
      @Override
    public String toString() {
        return this.elemento.toString();
    }

           
    
}
