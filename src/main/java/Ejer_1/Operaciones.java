package Ejer_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones {

    Docente d = new Docente();
    Scanner leer = new Scanner(System.in);
 //CREANDO UN ARCHIVO
    public void crearArchivo(){
        Path path=Paths.get("C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio1.txt");
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
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio1.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(ruta);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(d); 
            oos.close(); 
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    //cargamos los datos del archivo a un list<Cliente>
    public void leerDatos(){
        String ruta="C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio1.txt";
        try {  
            FileInputStream archivo=new FileInputStream(ruta);
            ObjectInputStream ois=new ObjectInputStream(archivo);

            if(ois!=null){
                d=(Docente)ois.readObject();
                
            }else{ 
                System.out.println("El objeto es nulo");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void RegistrarDocente() {

        System.out.println("Digite nombre:");
        d.setNombre(leer.nextLine());
        System.out.println("Digite paterno:");
        d.setPaterno(leer.nextLine());
        System.out.println("Digite materno:");
        d.setMaterno(leer.nextLine());
        System.out.println("Digite titulo:");
        d.setTitulo(leer.nextLine());
        System.out.println("Digite carga Horaria:");
        d.setCargaHoraria(leer.nextInt());
        System.out.println("-------registrado-----------");
    }

    public void mostrarDocente() {

        d.mostrar();
    }

    public void RegistrarMaterias() {
        if (d.getNombre() != null) {
            Materia m = new Materia();
            System.out.println(" digite nombre de la materia: ");
            leer.nextLine();
            m.setNombreMateria(leer.nextLine());
            System.out.println("digite año de la materia: ");
            m.setAñoMateria(leer.nextInt());
            System.out.println(" digite la carga horia que tiene la materia : ");
            m.setHoraMateria(leer.nextInt());
            d.añadirMateria(m);
        } else {
            System.out.println(" No tiene ningun docente registrados");
        }

    }
}
