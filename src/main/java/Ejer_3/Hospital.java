package Ejer_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hospital implements Serializable{
    static final long serialVersionUID=42L;
    private String nombre;
    private String direccion;
    private int nivel;
    //aplicamos al relacion de  agregacion
    private List<Especialidad> listaEspecialidad;

    public Hospital() {
        listaEspecialidad=new ArrayList<>();
    }
     
    public void AdicionarEspecialidad(Especialidad esp){
        listaEspecialidad.add(esp);
        System.out.println("Especialidad Registrada...........");
    }
    
    public void mostrar(){
        System.out.println("Nombre del hospital: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Nivel: "+nivel);
        if (listaEspecialidad.size()>0) {
            System.out.println("*** LSITA DE ESPECIALIDADES  ***");
            for(Especialidad list:listaEspecialidad){
                list.mostrar();
                System.out.println("---------------");
            }
        }else{
            System.out.println("ninguna  especialidades registradas");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Especialidad> getListaEspecialidad() {
        return listaEspecialidad;
    }

    public void setListaEspecialidad(List<Especialidad> listaEspecialidad) {
        this.listaEspecialidad = listaEspecialidad;
    }
    
    
}
