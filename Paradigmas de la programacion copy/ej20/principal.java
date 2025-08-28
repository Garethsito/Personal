package ej20;

import java.util.Scanner;

public class principal {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        String dato, lj1,lj2;
        String[] gato = new String[9];
        int pos;
        int turno = 1;

        do{
        System.out.println("Elige X o O");
        dato = leer.nextLine();
        valida.soloXO(dato);
        }
        while(!valida.soloXO(dato));

        //valores iniciales del juego
        inicializar(gato);
        mostrar(gato);
        lj1=pedirLetra();
        lj2=lj1.equals("X")?"O":"X";
        System.out.println("Jugador 1 tira " + lj1);
        System.out.println("Jugador 2 tira " + lj2);

        do{

            System.out.println("posicion: ");
            pos = Integer.parseInt(leer.nextLine());
            
            //checar la disponibilidad
            if(disponible(pos, gato)){
                gato[pos-1] = turno==1? lj1: lj2;
            }
            else System.out.println("posicion ocupada");
            mostrar(gato);
            turno = turno==1? 2: 1;//turno es de la persona que iba a tirar.
        }while(!estaLleno(gato));
    }



    public static boolean disponible(int pos, String[] g){
        if (g[pos-1].matches(".*[XO].*")) return false;
        else return true;
    }

    public static boolean estaLleno(String[] g){
        for (int i = 0; i < g.length; i++) {
            if (Character.isDigit(g[i].charAt(0)));
            return false;
        }
        return true;
    }

    public static void mostrar(String[] g){
        for (int i = 0; i < g.length; i+=3) {
            for (int j = 0; j <3; j++) {
                System.out.print("["+ g[i+j] + "] ");
            }
            System.out.println();
        }
    }

    public static void inicializar(String[] g){
        for (int i = 0; i < g.length; i++) {
            g[i] = Integer.toString(i+1);//pos 0 vale 1, y asi secesivaente

        }
    }
    public static String pedirLetra(){
        String dato;
        do{
            System.out.println("Elige X o O");
            dato=leer.nextLine().toUpperCase();
        }while(!valida.soloXO(dato));
        return dato;
    }

    public static boolean ganador(String[] g)
    {
        return  (g[0].equals(g[3]) && g[3].equals(g[6])) ||
                (g[1].equals(g[4]) && g[4].equals(g[7])) ||
                (g[2].equals(g[5]) && g[5].equals(g[8])) ||
                (g[0].equals(g[1]) && g[1].equals(g[2])) ||
                (g[3].equals(g[4]) && g[4].equals(g[5])) ||
                (g[6].equals(g[7]) && g[7].equals(g[8])) ||
                (g[0].equals(g[4]) && g[4].equals(g[8])) ||
                (g[2].equals(g[4]) && g[4].equals(g[6]));
    }
}
