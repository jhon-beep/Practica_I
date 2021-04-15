/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_2;

import java.util.Scanner;

/**
 *
 * @author JVC
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones opc = new Operaciones();
        boolean continuer = true;
        int opcion;
        do {
            System.out.println(" MENU DE OPCIONES ALBUMNES");
            System.out.println("1.- Registrar album ");
            System.out.println("2.- mostrar album");
            System.out.println("3.- buscar Cancnion");
            System.out.println("4.- mostrar canciones ");
            System.out.println("5.- eliminar album ");
            System.out.println("6.- crear archivo ");
            System.out.println(" .- salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    opc.RegsitrarAlbum();
                    opc.guardarObjetos();
                    break;
                case 2:
                    opc.leerDatos();
                    opc.mostraAlbum();
                    break;
                case 3:
                    opc.leerDatos();
                    opc.buscarCancion();
                    break;
                case 4:
                    opc.leerDatos();
                    opc.mostrarCanciones();
                    break;
                case 5:
                    opc.leerDatos();
                    opc.Eliminar();
                    opc.guardarObjetos();
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
