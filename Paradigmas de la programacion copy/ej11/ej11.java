package ej11;

import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = (int)(Math.random() *50);
        System.out.println("el valor principal es: " + x);
        for (int i=0; i<=x; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("impares con while");

        for (int i=1; i<=x; i++){
            while(i%2!=0){
                System.out.println(i);
                i++;            }
        }

        int i=0; 
        int a=0;
        do {
            a=i-(2*i);
            i++;
            System.out.println(a);
            
        } while(i<=x);
        
        



    }
}
