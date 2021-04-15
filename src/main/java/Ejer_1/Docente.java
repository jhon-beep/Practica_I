
package Ejer_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Docente extends Materia  implements Serializable{
     static final long serialVersionUID=42L;  
    private String nombre;
    private String paterno;
    private String materno;
    private String titulo;
    private int cargaHoraria;
    //Materia materia;
    private List<Materia> listaMateria;
        
     
    public Docente() {
        listaMateria = new ArrayList<Materia>();
    }
public void mostrar(){
       System.out.println("Nombre: "+nombre);
       System.out.println("Paterno : "+paterno);
       System.out.println("Materno: "+materno);
       System.out.println("TItulo: "+titulo);
       System.out.println("Carga Horaria : "+cargaHoraria);
        
        System.out.println("LISTA DE Materias ");
        if (listaMateria.size() > 0) {
            for (Materia mat : listaMateria) {
                mat.mostrar();
                System.out.println("--------------------");
            } 
        } else { 
            System.out.println("el Docente  no tiene ninguna materia  regsitrada");
        }
    

}
    public void añadirMateria(Materia m){
        listaMateria.add(m);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
   
 
   
        
}
