package exa1_r;

import java.util.Scanner;
public class exa1_r {
    public static void main(String[] args) {
        char iniciales[] = new char[10];

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su primer nombre:");
        String nombre = leer.nextLine();
        System.out.println("ingrese su apellido paterno:");
        String ap = leer.nextLine();
        System.out.println("ingrese su apellido materno:");
        String am = leer.nextLine();
        char n1 = nombre.toUpperCase().charAt(0);
        char ap1 = ap.toUpperCase().charAt(0);
        char am1 = am.toUpperCase().charAt(0);

        iniciales[0] = n1;
        iniciales[1] = ap1;
        iniciales[2] = am1;
        
        System.out.println(iniciales);

    }
    
}
