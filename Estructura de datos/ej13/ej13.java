package ej13;
import java.util.Scanner;

public class ej13 {
    public static void main (String[] args){
        int opc;
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        arbol nums = new arbol();
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                nums.insertar(3);
                nums.insertar(8);
                nums.insertar(2);
                nums.insertar(1);
                nums.insertar(10);
                nums.insertar(4);
                nums.insertar(7);
                    //grupo.insertar(nombre);
                    break;
                case 2:
                System.out.println("pre-orden");
                    nums.mostrarPreorden(nums.getRaiz());
                    break;

                case 3:
                System.out.println("in orden");

            }//fin del switch
        }while(opc!=0);
    }//fin del main

    public static void menu(){
        System.out.println("1 insertar");
        System.out.println("2 mostrar preorden");
        System.out.println("3 mostrar inorden");
        System.out.println("");
        System.out.println("");
    }
}
