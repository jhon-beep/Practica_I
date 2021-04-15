
package Ejer_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Album extends  Cancion implements Serializable{
     static final long serialVersionUID=42L;  
    private  String nombre;
    private String artista;
    private String formato;
    private List<Cancion> listaCanciones;
    
    public Album() {
        listaCanciones=new ArrayList<>();
          
    }  
    public void mostrarAlbum (){ 
        System.out.println("Nombre: "+nombre);
        System.out.println("artista: "+artista);
        System.out.println("formato: "+artista);
        System.out.println("*****LISTA DE Cacniones******** ");
         if(listaCanciones.size()>0){
             for(Cancion c:listaCanciones){
                 c.mostrarCancione();
                 System.out.println("-------------------");
             }
         }else{
             System.out.println(" no tiene ninguna canicon regsitrada ");
         } 
    }
    

      public void añadirCancion(Cancion c){
        listaCanciones.add(c);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
      
    
}
