package Ejer_3;

import Ejer_2.Album;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones {
    private Especialidad e;
    private Hospital h;
    private List<Hospital> listaHospitales;

    public Operaciones() {
        listaHospitales=new ArrayList<>();
    }
    Scanner leer=new Scanner(System.in);
     public void crearArchivo(){
        Path path=Paths.get("C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio3.txt");
        try { 
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("El archivo se creo correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
        }
    }
    //guardando la listacliente dentro del archivo creado con anterioridad
    public void guardarObjetos(){
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio3.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(ruta);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(listaHospitales); 
            oos.close(); 
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    } 
    //cargamos los datos del archivo a un list<Cliente>
    public void leerDatos(){
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio3.txt";
        try {  
            FileInputStream archivo=new FileInputStream(ruta);
            ObjectInputStream ois=new ObjectInputStream(archivo);

            if(ois!=null){ 
               listaHospitales=(List<Hospital>)ois.readObject();
                
            }else{ 
                System.out.println("El objeto es nulo");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void RegistrarHospital(){
        h=new Hospital();
        System.out.println("Digite nombre del Hospital: ");
        h.setNombre(leer.nextLine());
        System.out.println("Digite direccion del hospital: ");
        h.setDireccion(leer.nextLine());
        System.out.println("Digite nivel del hospital: ");
        h.setNivel(leer.nextInt());
        listaHospitales.add(h);
        System.out.println("*** Hospital registrado .... ***");
    }
    
    public void mostrarHospital(){
        if (listaHospitales.size()>0) {
               System.out.println("------------lista Hospirales-----------");
            for(Hospital hosp:listaHospitales){
                hosp.mostrar();
                System.out.println("---------------------------------------");
            }
        }else{
            System.out.println("No tiene hospital  registrado ");
        }
    }
    
    public void RegsitrarEspcial(){
        int sw=0;
        if (listaHospitales.size()>0) {
            System.out.println("Digite nombre del hospital: ");
            leer.nextLine();
            String nom=leer.nextLine();
            for(Hospital hosp:listaHospitales){
                if (nom.equalsIgnoreCase(hosp.getNombre())) {
                    sw=1;
                    e=new Especialidad();
                    System.out.println("Digite nombre de la especialidad: ");
                    e.setNomEspecialidad(leer.next()); 
                    hosp.AdicionarEspecialidad(e);
                    System.out.println(" especialidad  registrados");
                }
            }
            if(sw==0){
                System.out.println("no se encontro el nombre ");
            }
        }else{
            System.out.println("no tiene hospital registrado");
        }
    }
    
    
    
    public void MostrarEspecialidades (){
   
        if (listaHospitales.size()>0) {
            System.out.println("Digite el nombre del hospital: ");
            String nom=leer.nextLine();
            for(Hospital h:listaHospitales){
                if(h.getNombre().equalsIgnoreCase(nom)){
                 
                    h.mostrar();
                }
            }
        }else{
            System.out.println("ningun hospital registrado ");
        }
    }
    public void LsitarEspciealidades(){
        int sw=0;
        if (listaHospitales.size()>0) {
            System.out.println("Digite la especialidad: ");
            String esp=leer.nextLine();
            for(Hospital h:listaHospitales){
                for(int i=0;i<h.getListaEspecialidad().size();i++){
                    if (esp.equalsIgnoreCase(h.getListaEspecialidad().get(i).getNomEspecialidad())){
                        System.out.println("Hospital: "+h.getNombre());
                        System.out.println("------------------------------------");
                        System.out.println(h.getListaEspecialidad().get(i).getNomEspecialidad());
                        System.out.println("---------------------------------------");
                        sw=1;
                    }
                }
            }
            if(sw==0){
                System.out.println("Especialidad no encontrada en el hosputal ");
            }
        }else{
            System.out.println("ningun hospital registrado ");
        }
    }
    
   
}
