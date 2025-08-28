import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ej25 {
    public static void main (String[] args){
        System.out.println("Ejercicios 25 Prog Funcional");

        Scanner leer = new Scanner(System.in);

        int anio = 2023;
        //usar funciones puras sin modifiicar el dato
        System.out.println(anio + " es biciesto? " + estatica.biciesto(anio));

        System.out.println("aleatorio " + estatica.aleatorio(100, 140));

        //anio = estatica.aleatorio(1900, 2050);
        System.out.println(anio + " es biciesto aleatorio? " + estatica.biciesto(estatica.aleatorio(1900, 2050)));
        
        anio = estatica.sigDecada(anio);
        System.out.println(anio + "es biciesto "+ estatica.biciesto(anio));
        // 
        List<Integer> positivos = new ArrayList<>(Arrays.asList(1,3,4,7,8,21,24,50));
        List<Integer> pares1 = new ArrayList<>();
        List<Integer> pares2 = new ArrayList<>();
        System.out.println("Numeros pares");
        for (int index = 0; index < positivos.size(); index++) {
            System.out.println(positivos.get(index) + " es par?" + esPar(positivos.get(index)));
            if (esPar(positivos.get(index))) pares1.add(positivos.get(index));
        }
        System.out.println();
        for (Integer num : pares1) {
            System.out.println(num);
        }

        //programacion declarativa
        //funciones lamda
        positivos.forEach((variable)->{
            if(esPar(variable)){
                pares2.add(variable);
                System.out.println("numero " + variable + " es par");
            }
        });

    

    }

    public static boolean esPar(int num){
        return num % 2 == 0;
    }

    public static int par(int num){
        if(num % 2 == 0) return num;
        else return 0;
    }
}
