
package Ejer_4;

import java.io.Serializable;


public class Archivo  implements Serializable{
        static final long serialVersionUID=42L;
    private String nombreArchivo;
    private double tamañoArchivo;
    public void mostrarArchivo(){
        System.out.println("Nombre de archivo: "+this.nombreArchivo);
          System.out.println("tamaño de archivo: "+this.tamañoArchivo+" Mb");
    }
    public String getNombreArchivo() {
        return nombreArchivo;
    }
 
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }
    
}
