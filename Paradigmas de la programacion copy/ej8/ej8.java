package ej8;
import java.util.Scanner;

public class ej8{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        boolean found = false;
        metodos.saludo();
        metodos.adios();
        int edad;
        
        do { 
            System.out.println("nombre: ");
            nombre = leer.nextLine();
            found = valida.strVacio(nombre);
        } while (found == true || valida.soloLetras(nombre)==false);
        System.out.println("edad:");
        
        do {
            System.out.println("edad: ");
            edad = Integer.parseInt(leer.nextLine());
        } while (valida.positivo(edad)==true);
    }
}//llave principal