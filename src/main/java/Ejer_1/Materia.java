
package Ejer_1;

import java.io.Serializable;

public class Materia  implements Serializable{
     static final long serialVersionUID=43L;  
    private String nombreMateria;
    private int  añoMateria;
    private int horaMateria;
    public void mostrar(){
        System.out.println("nombre: "+this.nombreMateria);
        System.out.println("año: "+añoMateria);
        System.out.println("hora: "+horaMateria);
    }
    
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAñoMateria() {
        return añoMateria;
    }

    public void setAñoMateria(int añoMateria) {
        this.añoMateria = añoMateria;
    }

    public int getHoraMateria() {
        return horaMateria;
    }

    public void setHoraMateria(int horaMateria) {
        this.horaMateria = horaMateria;
    }
    
}
