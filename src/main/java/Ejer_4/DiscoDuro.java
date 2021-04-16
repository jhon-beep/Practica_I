
package Ejer_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class DiscoDuro extends DispositivoAlmacenamiento implements Serializable{
        static final long serialVersionUID=43L;
     private String TipoINterfaz;
     List<Archivo> listaArchivos;

    public DiscoDuro() {
        listaArchivos=new ArrayList<>();
    }
  public void RegistrarArvhico(Archivo ar){
        listaArchivos.add(ar);
    }
  public void EliminarArchivo(Archivo a){
      listaArchivos.remove(a);
  }
     @Override
    public void registrar(String marca, double capacidad, double espacioDisponible) {
       super.setMarca(marca);
       super.setCapacidad(capacidad);
       super.setEspacioDisponible(espacioDisponible);
    }

    @Override
    public void mostrar() {
        System.out.println("Maraca: "+super.getMarca());
        System.out.println("capcacidad: "+super.getCapacidad()+" GB");
        System.out.println("espacio : "+super.getEspacioDisponible()+" MB");
        System.out.println("intrfaz: "+this.TipoINterfaz); 
        if(listaArchivos!=null){
             System.out.println(" ******LISTA DE ARCHIVOS***************");
             for(Archivo a:listaArchivos){ 
                 System.out.println("************************");
                 a.mostrarArchivo();
                 System.out.println("----------------------");
             }
         }else{
             System.out.println(" no tiene ningun archivo rgistrado");
         }
    }

    /*public void mostrar() {
   
        System.out.println("intrfaz: "+this.TipoINterfaz); 
         if(listaArchivos!=null){
             System.out.println(" ******LISTA DE ARCHIVOS***************");
             for(Archivo a:listaArchivos){
                 System.out.println("************************");
                 a.mostrarArchivo();
                 System.out.println("----------------------");
             }
         }else{
             System.out.println(" no tiene ningun archivo rgistrado");
         }
    }*/

    public String getTipoINterfaz() {
        return TipoINterfaz;
    }

    public void setTipoINterfaz(String TipoINterfaz) {
        this.TipoINterfaz = TipoINterfaz;
    }

    public List<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(List<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

  
  

    
    
}
