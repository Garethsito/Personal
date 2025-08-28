package exa1_r;
import java.util.Scanner;

public class exa1_r2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, a1,a2;
        char iniciales[] = new char[3];
        int anio=0;
        do{
            System.out.println("ingrese su primer nombre: ");
            nombre = leer.nextLine();
        }
        while(soloLetras(nombre)==false);
            System.out.println("ingrese su primer apellido: ");
            a1 = leer.nextLine();
            System.out.println("ingrese su segundo apellido: ");
            a2 = leer.nextLine();
        iniciales[0] = nombre.toUpperCase().charAt(0);
        iniciales[1] = a1.toUpperCase().charAt(0);
        iniciales[2] = a2.toUpperCase().charAt(0);

        System.out.println("ingrese su anio de nacimiento: ");
        anio = leer.nextInt();
        System.out.println("sus iniciales son: ");
        desplegar_Arreglo(iniciales);
        if (anio%4==0){
            
            System.out.println(" y su anio es biciesto");
        }
        else System.out.println("y su anio no es");
    }

    public static void desplegar_Arreglo(char[] a){
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]);
        }
    }
    
    public static boolean soloLetras(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            if(!Character.isAlphabetic(cadena.charAt(i))){
                System.out.println("solo letras");
                return false;
            }
        }
        return true;
    }
}
