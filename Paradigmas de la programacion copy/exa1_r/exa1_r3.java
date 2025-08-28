package exa1_r;

import java.util.Scanner;
public class exa1_r3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char[] iniciales = new char[3];
        String nom, apeM, apeP;
        int dd,mm,aa;
        do{
            System.out.print("ingrese su nombre: ");
            nom = leer.nextLine();
        }while(soloLetras(nom));

        do {
            System.out.print("ingrese su apellido paterno: ");
            apeP = leer.nextLine();
        } while (soloLetras(apeP));

        do { 
            System.out.print("ingrese su apellido materno: ");
            apeM = leer.nextLine();
        } while (soloLetras(apeM));
        iniciales[0] = nom.toUpperCase().charAt(0);
        iniciales[1] = apeM.toUpperCase().charAt(0);
        iniciales[2] = apeP.toUpperCase().charAt(0);

        do{
            System.out.print("ingrese el dia de su nacimiento (dd): ");
            dd = leer.nextInt();
        }while(dd>31);
    }
    public static boolean soloLetras(String cadena){
        if (cadena==null || cadena.trim().isEmpty()){
            System.out.println("por favor no ingrese espacios en blanco");
            return true;
        }
        for (int i = 0; i < cadena.length(); i++) {
            if(!Character.isAlphabetic(cadena.charAt(i))){
                System.out.println("porfavor ingrese solo letras");
                return true;
            }
        }
        return false;
    }

    public static boolean soloNumeros(Integer num){
        if (num==null){
            System.out.println("porfavor no deje espacios en blanco");
            return true;
        }

        return false;
    }
}
