import java.util.Scanner;

public class ej2{
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, mundo!");
        int valor, pos, continuar;

        int[] a = new int[10];
        System.out.println("aqui voy");

        do{    
            //pedir datos
            System.out.println("que valor quiere guardar: ");
            valor = leer.nextInt();
            //acomodar datos
            pos=0;
            a[pos]=valor;
            pos++;

            System.out.println("continuar 1/0");
            continuar=leer.nextInt();
        }while(continuar==1);
        
        for (int i = 0; i < 10; i++) 
        System.out.println(i+ " = " + a[i]);


        
    }
  }