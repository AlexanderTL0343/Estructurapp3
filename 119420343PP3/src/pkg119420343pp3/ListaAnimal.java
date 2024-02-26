/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class ListaAnimal {
      private NodoAnimal cabeza;
    
    public void insertar(Animal a)
    {
        //1. La lista está vacía.
        if(cabeza == null) //Lista vacía
        {
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoAnimal(a);
        }
        else
        {
            //2.
            //El animal a insertar tiene una menor edad al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí la edad del animal es menor a el id de la cabeza
            if(a.getFechaDeNacimiento() < cabeza.getDato().getFechaDeNacimiento())
            {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoAnimal auxiliar = new NodoAnimal(a);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }
            else
            {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nuevo animal a la derecha de la cabeza.
                //Aquí la edad del animal es mayor la edad de la cabeza
                if(cabeza.getSiguiente() == null)
                {
                    NodoAnimal nuevo = new NodoAnimal(a);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                }
                else
                {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoAnimal auxiliar = cabeza;
                    while(auxiliar.getSiguiente() != null && 
                          auxiliar.getSiguiente().getDato().getFechaDeNacimiento() < a.getFechaDeNacimiento())
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoAnimal otroAuxiliar = new NodoAnimal(a); //Vamos a almacenar el nodo nuevo, 
                                                         //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }
    //sacado del codigo de la clase llamado Lec06
    public boolean existe(String tipo)
    {
        boolean respuesta = false;
        
        NodoAnimal auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getTipo().equals(tipo))
            {
                respuesta = true;
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
    //sacado del codigo de la clase llamado Lec06
    public void modifica(Animal a)
    {
        NodoAnimal auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getTipo().equals(a.getTipo()))
            {
                auxiliar.getDato().setNombre(a.getNombre());
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    //sacado del codigo de la clase llamado Lec06 y modificado para que no borre mediante id sino por tipo
    public void eliminarPorTipo(String tipo)
    {
    NodoAnimal auxiliar = cabeza;
    NodoAnimal anterior = null;

    while (auxiliar != null) {
        if (auxiliar.getDato().getTipo().equals(tipo)) {
            if (anterior == null) {
                cabeza = auxiliar.getSiguiente(); 
            } 
            // este else se modifico debido a que si se activaba como estaba programado en la lec06 activava un break que no permitia borrar todos los tipos que queria borrar
            else {
                anterior.setSiguiente(auxiliar.getSiguiente()); 
            }
            auxiliar.setSiguiente(null); 
            // este if y else se agregaron solo para eviatar el break y que este siga recorriendo la lista y borrando el tipo que se selecciono en el main
           if (anterior == null) {
                auxiliar = cabeza;
           } else {
                auxiliar = anterior.getSiguiente();
}
        } else {
            //solo se activa si no se elimina ningun nodo
            anterior = auxiliar;
            auxiliar = auxiliar.getSiguiente();
        }
    }
}

    @Override
    public String toString() {
        NodoAnimal auxiliar = cabeza;
        String respuesta = "Lista: \n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta;
    }
    
}
 
