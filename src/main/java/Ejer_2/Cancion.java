
package Ejer_2;

import java.io.Serializable;

public class  Cancion implements Serializable{
     static final long serialVersionUID=43L;  
   private String nombre;
   private float  duracion;
   private String genero;
   public void mostrarCancione (){
       System.out.println("nombre: "+this.nombre);
       System.out.println("duracion : "+duracion);
       System.out.println("genero: "+genero);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
}
