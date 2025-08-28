package ej8;

import java.util.Scanner;


public class ej8 {
    public static void main (String[] args){
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        colas grupo = new colas();
        String nombre;
        int opc=0;
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                    System.out.println("insertar nombre");
                    nombre = leer.nextLine();
                    grupo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Lista del grupo");
                    grupo.mostrar();
                    break;
                case 3:
                grupo.borrar();
                System.out.println("borrado!");                
                break;
                case 4:
                System.out.println("buscar nombre");
                nombre=leer.nextLine();
                grupo.buscar(nombre);
                break;
            }
    
        }while( opc!=9);
    }//fin del main
    public static void menu(){
        System.out.println("listas simples");
        System.out.println("1 insertar");
        System.out.println("2 mostrar");
        System.out.println("3 borrar");
        System.out.println("4 buscar");
        System.out.println("9 salir");
    }
}