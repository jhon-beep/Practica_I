package Ejer_2;

import Ejer_1.Docente;
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

    private List<Album> listaAlbum;
    private Cancion c;
    private Album a;

    public Operaciones() {
        listaAlbum = new ArrayList<>();
    }
    Scanner leer = new Scanner(System.in);
  public void crearArchivo(){
        Path path=Paths.get("C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio2.txt");
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
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio2.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(ruta);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(listaAlbum); 
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
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio2.txt";
        try {  
            FileInputStream archivo=new FileInputStream(ruta);
            ObjectInputStream ois=new ObjectInputStream(archivo);

            if(ois!=null){ 
               listaAlbum=(List<Album>)ois.readObject();
                
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
    public void RegsitrarAlbum() {
        a=new  Album();
        System.out.println("Digite nombre:");
        a.setNombre(leer.nextLine());
        System.out.println("Digite artista:");
        a.setArtista(leer.nextLine());
        System.out.println("Digite formato:");
        a.setFormato(leer.nextLine());
        listaAlbum.add(a);
        System.out.println("DIgite canciones a registrar...");
        int x = leer.nextInt();
        for (int i = 0; i < x; i++) {
             c=new Cancion();
            System.out.println("digite nombre de la cancion");
            leer.nextLine();
            c.setNombre(leer.nextLine());
            System.out.println("digite duracion ");
            c.setDuracion(leer.nextFloat());
            System.out.println(" digite genero");
            leer.nextLine();
            c.setGenero(leer.nextLine());
            a.añadirCancion(c);
        }
        System.out.println("-------registrado-----------");
    }

    public void mostraAlbum() {
        if (listaAlbum != null) {
            System.out.println(" ****LISTA DE ALBULNES****");
            for (Album a : listaAlbum) {
                System.out.println("//////////////////");
                a.mostrarAlbum();
                System.out.println("//////////////////");
            }
        } else {
            System.out.println(" no tiene ningun album registrado");
        }
    }

    public void buscarCancion() {
        if (listaAlbum != null) {
            System.out.println("digite nombre de la cancion a buscar");
            String nom = leer.nextLine();
            for (Album a : listaAlbum) {
                for (Cancion c : a.getListaCanciones()) {
                    if (c.getNombre().equalsIgnoreCase(nom)) {

                        System.out.println("nombre del album: " + a.getNombre());
                        System.out.println("nombre del artista: " + a.getArtista());
                        System.out.println("------------------");
                    }
                }
            }
        } else {
            System.out.println(" no hay ningun album registrado");
        }
    }

    public void mostrarCanciones() {
        if (listaAlbum != null) {
            System.out.println("digite nombre del album a  buscar");
            String nom = leer.nextLine();
            for(Album a:listaAlbum){
                if(a.getNombre().equalsIgnoreCase(nom)){  
                    a.mostrarAlbum();
                    System.out.println("-----------------------------------");
                }
            }
        } else {
            System.out.println(" no hay ningun album registrado");
        }
    }

    public void Eliminar() {
        if (listaAlbum != null) {
            System.out.println("digite nombre del album a  eliminar ");
            String nom = leer.nextLine();
            for (Album a : listaAlbum) {
                if (a.getNombre().equalsIgnoreCase(nom)) {
                    listaAlbum.remove(a);
                    System.out.println(" album eliminado......");
                    break; 
                }
            }
        } else {
            System.out.println(" no hay ningun album registrado");
        }
    }
} 
