/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class ListaPalabras {
     private NodoPalabras cabeza;
    
   
    //sacado del codigo de la clase llamado Lec06
    public boolean existe(String palabra)
    {
        boolean respuesta = false;
        
        NodoPalabras auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getElemento().getPalabra().equals(palabra))
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
    public void modifica(DatoPalabras a)
    {
        NodoPalabras auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getElemento().getPalabra().equals(a.getPalabra()))
            {
                auxiliar.getElemento().setPalabra(a.getPalabra());
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    //sacado del codigo de la clase llamado Lec06 y modificado para que no borre mediante id sino por tipo
    public void eliminar(int id)
    {
        NodoPalabras auxiliar = cabeza;
        NodoPalabras anterior = null;
        
        while(auxiliar != null)
        {
            if(auxiliar.getElemento().getId()== id)
            {
                //Aquí eliminamos
                if(auxiliar.equals(cabeza))
                {
                    cabeza = cabeza.getSiguiente();
                    auxiliar.setSiguiente(null);
                    break;
                    
                }
                else
                {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(null);
                    break;
                }
            }
            else
            {
                //No encontramos el dato a eliminar
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
       public void insertar(DatoPalabras p)
    {
        //1. La lista está vacía.
        if(cabeza == null) //Lista vacía
        {
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoPalabras(p);
        }
        else
        {
            //2.
            //El id a insertar tiene una menor id al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí el id  es menor a el id de la cabeza
            if(p.getId() < cabeza.getElemento().getId())
            {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoPalabras auxiliar = new NodoPalabras(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }
            else
            {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nuevo id a la derecha de la cabeza.
                //Aquí el id  es mayor la edad de la cabeza
                if(cabeza.getSiguiente() == null)
                {
                    NodoPalabras nuevo = new NodoPalabras(p);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                }
                else
                {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoPalabras auxiliar = cabeza;
                    while(auxiliar.getSiguiente() != null && 
                          auxiliar.getSiguiente().getElemento().getId()< p.getId())
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoPalabras otroAuxiliar = new NodoPalabras(p); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        NodoPalabras auxiliar = cabeza;
        String respuesta = "Lista: \n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta;
    }
    
}

