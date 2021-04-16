/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_4;

import java.io.Serializable;

/**
 *
 * @author Melissa Ibañez Lopez
 */
public abstract class DispositivoAlmacenamiento implements Serializable {
        static final long serialVersionUID=44L;
    //atributos 
    private String marca;
    private double capacidad;
    private double espacioDisponible;
    //metodos abstractos
abstract  public void registrar(String marca, double capacidad, double espacioDisponible);

    
    
     abstract public void mostrar();
     
     
    //getter y setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(double espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }


    
}
