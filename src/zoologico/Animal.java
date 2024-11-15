/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.Objects;

public abstract class Animal {
    
    private String nombre;
    private int edad;
  
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof Animal animal)
        {
            return nombre.equals(animal.nombre) && edad == animal.edad;
        }
        return false;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad;
    }
}
