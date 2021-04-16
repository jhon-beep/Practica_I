package Ejer_4;

import Ejer_3.Hospital;
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

    private DiscoDuro duro;
    private Archivo archi;
    Scanner leer = new Scanner(System.in);

    public void regsitrarArchivo() {
        archi = new Archivo();

        System.out.println(" Digite nombre del archivo: ");
        leer.nextLine();
        archi.setNombreArchivo(leer.nextLine());
        System.out.println("digite tamaño del archivo");
        double ta = leer.nextDouble();

        if (duro.getEspacioDisponible() >= ta) {
            archi.setTamañoArchivo(ta);
            duro.setEspacioDisponible(duro.getEspacioDisponible() - ta);
            duro.RegistrarArvhico(archi);
            System.out.println(" registrado  archivo......");

        } else {
            System.out.println(" tamaño insuficiente....");
        }


    }
        public void eliminarArchivo() {
        archi = new Archivo();
        int sw=0; 
           leer.nextLine();
        System.out.println(" Digite nombre del archivo a eliminar  ");
        String no=leer.nextLine();
        for(Archivo d:duro.getListaArchivos()){
            if(d.getNombreArchivo().equalsIgnoreCase(no)){
                sw=1;
                  duro.setEspacioDisponible(duro.getEspacioDisponible() +d.getTamañoArchivo());
                  duro.EliminarArchivo(d);
                  System.out.println(" archivo eliminado...... ");
                  break;
            }
        }  
        if(sw==0)System.out.println(" archivo no encontrado ");
    }
    public void registrarDisc() {
        duro = new DiscoDuro();
        System.out.println(" digite marca");
        String marc = leer.nextLine();

        System.out.println("digite capacaidad");
        double ca = leer.nextDouble();
        System.out.println("digite espacio disponible");
        double es = leer.nextDouble();
        System.out.println(" digite interfaz");
        leer.nextLine();
        duro.setTipoINterfaz(leer.nextLine());
        duro.registrar(marc, ca, es);

        System.out.println("disco duro registrado.......");
    }

    public void mostrarDuro() {
        duro.mostrar();
    }

    public void crearArchivo() {
        Path path = Paths.get("C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio4.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
        }
    }

    //guardando la listacliente dentro del archivo creado con anterioridad
    public void guardarObjetos() {
        String ruta = "C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio4.txt";
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(archivo);
            oos.writeObject(duro);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //cargamos los datos del archivo a un list<Cliente>
    public void leerDatos() {
        String ruta = "C:\\Users\\JVC\\Documents\\ARCHIVOSNIO\\ejercio4.txt";
        try {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(archivo);

            if (ois != null) {
                duro = (DiscoDuro) ois.readObject();

            } else {
                System.out.println("El objeto es nulo");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejer_1.Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
