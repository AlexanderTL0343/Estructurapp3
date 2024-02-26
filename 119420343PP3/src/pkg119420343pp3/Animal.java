/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp3;

/**
 *
 * @author Alexander
 */
public class Animal {
    private String tipo;
    private  String nombre;
    private int fechaDeNacimiento;

    public Animal(String tipo, String nombre, int fechaDeNacimiento) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
     @Override
    public String toString() {
        return "Tipo: " + this.tipo + " - Nombre: " + this.nombre + "- Fecha de nacimiento: " + this.fechaDeNacimiento;
    }
    
    
}
