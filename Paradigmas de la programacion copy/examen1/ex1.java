package examen1;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nom;
        int nvoc=0;

        do{
        System.out.print("ingrese su nombre: ");
        nom = leer.nextLine();
        }
        while(nom.length()<3 || nom.length()==0);
        for (int i = 0; i < nom.length(); i++) {
            //if (nom.contains("a") || nom.contains("e") || nom.contains("i") || nom.contains("o") || nom.contains("u")) nvoc+=1;
            if (nom.charAt(i)=='a' || nom.charAt(i)=='e' || nom.charAt(i)=='i' || nom.charAt(i)=='o' || nom.charAt(i)=='u'){
                nvoc+=1;
            }
        }
        System.out.println(nvoc);

    }
}
