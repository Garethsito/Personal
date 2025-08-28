package ej10;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<11; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        System.out.println("con while:");
        a=0;
        b=1;
        c=0;
        int i=1;
        System.out.println(a);
        System.out.println(b);
        while(i<11){
            c=a+b;
            a=b;
            b=c;
            i++;
            System.out.println(c);
        }
        System.out.println("ahora con do while:");
        a=0;
        b=1;
        c=0;
        i=1;
        System.out.println(a);
        System.out.println(b);
        do {
            c=a+b;
            a=b;
            b=c;
            i++;
            System.out.println(c); 
            
        } while (i<11); 

    }

}
