/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class PracticaProgramada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPalabras ejercicio1= new ListaPalabras();
        
        ejercicio1.insertar(new DatoPalabras("oro",15));
        ejercicio1.insertar(new DatoPalabras("torre",16));
        
        
        ListaAnimal ejercicio2= new ListaAnimal();
        ejercicio2.insertar(new Animal("Tortuga", "Alphie", 2008));
        ejercicio2.insertar(new Animal("Pez", "Nemo", 2007));
        ejercicio2.insertar(new Animal("Insecto", "Flik", 2006));
        ejercicio2.insertar(new Animal("Tortuga", "Gustavo", 2009));
        ejercicio2.insertar(new Animal("Pez", "Dory", 2010));
        ejercicio2.insertar(new Animal("Insecto", "Hopper", 2005));
        ejercicio2.insertar(new Animal("Tortuga", "Naruto", 2015));
        ejercicio2.insertar(new Animal("Pez", "Marlin", 2017));
        ejercicio2.insertar(new Animal("Insecto", "Dim", 2004));
        ejercicio2.insertar(new Animal("Tortuga", "Alphonse", 2022));
        System.out.println(ejercicio2.toString());
    
        ejercicio2.eliminarPorTipo("Tortuga");
        System.out.println(ejercicio2.toString());
    }
    
}
