package ej17;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su Valor");
        short edad;
        short saldo;
        boolean valido;
        
        do{
        edad = pedirValor("edad", (short)0, (short)120);
        } while(mayorValor(edad)==false);

        toString(edad);

        
    }

    public static short pedirValor(String msg, short minimo, short maximo){
        Scanner leer = new Scanner(System.in);
        String dato;
        short valor=0;
        boolean valido;
        do{
            valido = true;
            System.out.println("Valor: ");
            dato = leer.nextLine();
            for (int i = 0; i < dato.length(); i++) 
                if (!Character.isDigit(dato.charAt(i))) valido = false;             
            
            if (valido) valor = Short.parseShort(dato);
            
        }while(valor < 0 || valor > 120 || !valido);
        return valor;
    }   
    public static void toString(short Valor){
        System.out.println("Datos personales");
        System.out.println("Valor: " + Valor);

    }
    private static boolean mayorValor(int Valor){
        if (Valor <17) return false;
        return true;

    }  
}
