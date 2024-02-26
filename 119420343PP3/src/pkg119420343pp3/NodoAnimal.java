/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class NodoAnimal {
    private Animal dato;
    private NodoAnimal siguiente;

    public NodoAnimal(Animal dato) {
        this.dato = dato;
    }

    public Animal getDato() {
        return dato;
    }

    public void setDato(Animal dato) {
        this.dato = dato;
    }

    public NodoAnimal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAnimal siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
    
}
