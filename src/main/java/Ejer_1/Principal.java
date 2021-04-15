package Ejer_1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones opc = new Operaciones();
        boolean continuer = true;
        int opcion;
        do {

            System.out.println(" MENU DE OPCIONES utmovil");
            System.out.println("1.  Crear archivo");
            System.out.println("2.- Registrar Docente ");
            System.out.println("3.- Mostrar Docente");
            System.out.println("4.- Registrar Materias");
            System.out.println(" 5.- salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    opc.crearArchivo();
                    break;
                case 2:
                    opc.RegistrarDocente();
                    opc.guardarObjetos();
                    break;
                case 3:
                    opc.leerDatos();
                    opc.mostrarDocente();
                    break;
                case 4:
                    opc.leerDatos();
                    opc.RegistrarMaterias();
                    opc.guardarObjetos();
                    break;

                default:
                    continuer = false;
                    break;
            } 
        } while (continuer); 
    }
}
