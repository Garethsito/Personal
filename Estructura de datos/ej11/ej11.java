package ej11;
import java.util.Scanner;

public class ej11 {
    public static void main (String[] args){
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        pila grupo = new pila();
        String nombre;
        int opc=0;
        inicializar(grupo);
        grupo.mostrar();
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                    System.out.println("insertar nombre");
                    nombre = leer.nextLine();
                    //grupo.insertar(nombre);
                    break;
                case 2:
                    grupo.mostrar();
                    break;
                case 3:
                grupo.limpiar();                 
                    break;
                case 4:
                grupo.borrar();
            }
    
        }while( opc!=9);
    }//fin del main

    public static void inicializar(pila grupo){
        for(int i = 5; i>=1; i--){
            grupo.insertar(i);
        }
        
    }
    public static void menu(){
        System.out.println("1. insertar");
        System.out.println("2. mostrar");
        System.out.println("3. reiniciar");
        System.out.println("4. borrar");
        System.out.println("9. terminar");
    }
}
