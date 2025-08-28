package examen1;

import java.util.Scanner;
public class ex1_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char imms[] = new char[11];
        char digito;
        int anio_a;
        int anio_i;

        
        for (int i = 1; i < 12; i++) {
            do{
                System.out.println("ingrese su numero de seguro social (11 digitos) ");
                System.out.print("digito(" + i + "): ");
                digito = leer.nextLine().charAt(0);
            }while(digito);
            imms[i] = digito;
        }
        desplegarArreglo(imms);
    }

    public static boolean validacionAnio(int anio1, int anio2){
        if (anio1<anio2){
            System.out.println("es invalido el anio de nacimiento: ");
            return true;
        }
        return false;
    }

    public static void desplegarArreglo(char a[]){
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]);
        }
    }
}
