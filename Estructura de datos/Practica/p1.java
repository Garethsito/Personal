package Practica;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Menu de calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opc = leer.nextInt();

        switch (opc) {
            case 1:

                System.out.println("ingrese el primer numero: ");
                int a = leer.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int b = leer.nextInt();
                System.out.println(opera.suma(a, b));
                break;
            case 2:
                System.out.println("ingrese el primer numero: ");
                a = leer.nextInt();
                System.out.println("ingrese el segundo numero: ");
                b = leer.nextInt();
                System.out.println("La resta es: " + opera.resta(a, b));
                break;
            case 3:
                System.out.println("ingrese el primer numero: ");
                a = leer.nextInt();
                System.out.println("ingrese el segundo numero: ");
                b = leer.nextInt();
                System.out.println("La multiplicación es: " + opera.resta(a, b));
                break;
            case 4:
                System.out.println("ingrese el primer numero: ");
                a = leer.nextInt();
                System.out.println("ingrese el segundo numero: ");
                b = leer.nextInt();
                System.out.println("La divicion es: " + opera.suma(a, b));
                break;
            default:
        }
        
    }


}
