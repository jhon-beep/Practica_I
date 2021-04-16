package Ejer_4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones opc = new Operaciones();
        boolean continuer = true;
        int opcion;
        do {
            System.out.println(" MENU DE OPCIONES ");
            System.out.println("1.- crear archivo");

            System.out.println("2.- mostrar Disco Duro");
            System.out.println("3.- registrar archivo");
            System.out.println("4.- eliminarn archivo");
            System.out.println("5.- Registrar Disco duro ");
            System.out.println("6.- salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    opc.crearArchivo();
                    break;

                case 2:
                    opc.leerDatos();
                    opc.mostrarDuro();
                    break;
                case 3:
                    opc.regsitrarArchivo();
                    opc.guardarObjetos();
                    break;
                case 4:
                    opc.leerDatos();
                    opc.eliminarArchivo();
                    opc.guardarObjetos();
                    break;
                case 5:

                    opc.registrarDisc();
                    opc.guardarObjetos();
                    break;
                default:
                    continuer = false;
                    break;
            }
        } while (continuer);
    }
}
