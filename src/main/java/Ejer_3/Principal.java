package Ejer_3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones opc = new Operaciones();
        boolean continuer = true;
        int opcion;
        do {
            System.out.println(" MENU DE OPCIONES ALBUMNES");
            System.out.println("1.- Registrar hospital ");
            System.out.println("2.- registrar especialidades");
            System.out.println("3.- MostrarHOospital");
            System.out.println("4.- mostrar Especialidad ");
            System.out.println("5.- listar Especialidades");
            System.out.println("6.- crar archivo");
            System.out.println(" .- salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    opc.RegistrarHospital();
                    opc.guardarObjetos();
                    break;
                case 2:
                    opc.RegsitrarEspcial();
                      opc.guardarObjetos();
                    break;
                case 3:
                    opc.leerDatos();
                    opc.mostrarHospital();
                    break;
                case 4:
                    opc.leerDatos();
                    opc.MostrarEspecialidades();
                    break;
                case 5: 
                    opc.leerDatos();
                    opc.LsitarEspciealidades();
                    break;
                case 6:  
                    opc.crearArchivo();
                    break;
                default:
                    continuer = false;
                    break;
            } 
        } while (continuer);
    }
}
