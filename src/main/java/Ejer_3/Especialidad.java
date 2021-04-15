package Ejer_3;

import java.io.Serializable;

public class Especialidad implements Serializable {
      static final long serialVersionUID=43L;  
    
    private String Especialidad;
    
    public void mostrar(){
        System.out.println("Especialidad: "+this.Especialidad);
    }
 
    public String getNomEspecialidad() {
        return Especialidad;
    }

    public void setNomEspecialidad(String nomEspecialidad) {
        this.Especialidad = nomEspecialidad;
    }
    
}
