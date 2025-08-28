package t2;

import java.util.Scanner;
public class t2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String flt, esp, nesp, alf, num;

        System.out.println("Ingrese un número decimal:");
        flt = leer.nextLine();
        if(esFlotante(flt)) System.out.println("es flotante");
        else System.out.println("no es flotante");

        System.out.println("ingrese una palabra sin espacio: ");
        nesp= leer.nextLine();
        if(sinEspacio(nesp)) System.out.println("bien");
        else System.out.println("esta mal");

        System.out.println("ingrese una palabra CON espacio:");
        esp = leer.nextLine();
        if(!sinEspacio(esp)) System.out.println("bien");
        else System.out.println("esta mal");

        System.out.println("ingrese puros caracteres alfabeticos: ");
        alf = leer.nextLine();
        if(esAlfavetico(alf)) System.out.println("bien");
        else System.out.println("esta mal");

        System.out.println("ingrese puros caracteres numericos: ");
        num = leer.nextLine();
        if(esNumerico(num)) System.out.println("bien");
        else System.out.println("esta mal");

    }

    public static boolean esFlotante(String s){
        for (int idx = 0; idx < s.length(); idx++) {
            if(Character.isDigit(s.charAt(idx)) && s.contains(".")){
                return true;
            }            
        }
        return false;
    }

    public static boolean sinEspacio(String s){
        if (s.contains(" ")) return false;
        return true;
    }
    
    public static boolean esAlfavetico(String s){
        for (int idx = 0; idx < s.length(); idx++) {
            if(!Character.isAlphabetic(s.charAt(idx))){
                return false;
            }            
        }
        return true;
    }

    public static boolean esNumerico(String s){
        for (int idx = 0; idx < s.length(); idx++) {
            if(!Character.isDigit(s.charAt(idx))){
                return false;
            }            
        }
        return true;
    }
}
