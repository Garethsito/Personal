package ej10;
import java.util.Scanner;
//Ejercicio 10 Serpientes y snake
//tablero arreglo, dado aleatorio
//cola: posiciones en la que ha caido
//reglas:
/* 1. dado del 1 al 4 avanza
 * 2. dado cae 5: elige si avanza o se queda igual
 * 3. dado cae 6: avanza o regresa a la ultima posicion
 * 4. snake: pos 6 sube a 11, pos 15 sube a 18, pos 8 sube a 20
 *  si da tiempo: snake aleatorios
 * 5. serpientes: pos 24 baja a 17, pos 21 baja a 10, pos 9 baja a 2
 * si da tiempo: serpietes aleatorias
 * 6. si al tirar se pasa de puntos de la meta, debe regresarse
 * 7. gana el que llega exacto a la meta
 */
public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        lista jug1 = new lista();
        lista jug2 = new lista();
        lista jug3 = new lista();
        int opc=0;
        int dado;
        int turno=1;
        String respuesta;
        tablero();
        do { 
            menu();
            System.out.println("elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1: nuevoJuego(jug1, jug2, jug3);
                    break;
                case 2: dado= (int)(Math.random()*6)+1; 
                System.out.println("Jugador: " +turno + "  Dado: " + dado);
                if(dado==5){
                    System.out.println("Avanza o te quedas? A/R");
                    respuesta = leer.nextLine().toUpperCase();
                    if(respuesta.equals("S")){
                        turno = avanza(turno,dado,jug1,jug2,jug3);
                    }
                    else{
                        turno = cambiaTurno(turno);
                    }
                }
                else{
                    if(dado==6){
                        System.out.println("Avanzas o regresas? A/R");
                        respuesta = leer.nextLine().toUpperCase();
                        if(respuesta.equals("S")){
                            turno = avanza(turno,dado,jug1,jug2,jug3);
                        }
                    }
                    else{
                        turno = avanza(turno,dado,jug1,jug2,jug3);
                    }
                }
                default:
                    break;
            }
        } while (!meta(jug1, jug2,jug3) && opc!=9);
        String mensaje = jug1.getFin().getElem()==25 ? "Jug1 ganooo" : (jug2.getFin().getElem()==25 ? "Jug2 ganooo" : (jug3.getFin().getElem()==25 ? "jug3 ganooo" : "adios"));
        System.out.println(mensaje);

    }

    public static int cambiaTurno(int turno){
        return turno==1? 2 : (turno==2? 3 : 1);
    }



    public static int regresa(int turno, lista jug1, lista jug2, lista jug3){
        switch(turno){
            case 1:
            if(jug1.getInicio()!=null)
            jug1.borrarUltimo();
            turno=2;
            break;
            case 2:
            if(jug2.getInicio()!=null)
            jug2.borrarUltimo();
            turno=3;
            break;
            case 3:
            if(jug3.getInicio()!=null)
            jug3.borrarUltimo();
            turno=1;
            break;
        }
        return turno;
    }

    public static boolean meta(lista jug1, lista jug2, lista jug3){

        if ((jug1.getFin()!=null && jug1.getFin().getElem()==25) || (jug2.getFin()!=null && jug2.getFin().getElem()==25) || (jug3.getFin()!=null && jug3.getFin().getElem()==25))
        return true;
        else
        return false;
    }

    public static void menu(){
        System.out.println("1. Iniciar juego");// todas las lista vasias
        System.out.println("2. Dado");
        System.out.println("9. Salir");
    }

    public static void nuevoJuego(lista jug1, lista jug2, lista jug3){
        jug1.reiniciar();
        jug2.reiniciar();
        jug3.reiniciar();
    }

    public static int avanza(int turno,int dado, lista j1, lista j2, lista j3){
        switch(turno){
            case 1:
            if(j1.getInicio()==null)
            j1.insertar(dado);
            else{
                dado = snake(j1, dado);
                j1.insertar(dado);
            }
            turno=2;
            break;

            case 2:
            if(j2.getInicio()==null)
            j2.insertar(dado);
            else{
                dado = snake(j2, dado);
                j2.insertar(dado);
            }
            turno=3;
            break;
            case 3:
            if(j3.getInicio()==null)
            j3.insertar(dado);
            else{
                dado = snake(j3, dado);
                j3.insertar(dado);
            }
            turno=1;
            break;

        }
    return turno;
    }

    public static void tablero(){
        int c=1;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++){
                System.out.print("  [" + c + "]");
                c++;
            }
        }
    }

    public static int snake(lista jug, int num){
        num = jug.getFin().getElem() + num;
        if(num<25){
            num = 25 - (num -25);
        }
        switch (num) {
            case 6: num=11; break;
            case 15: num=18; break;
            case 8: num=20; break;
            case 24: num=17; break;
            case 21: num=10; break;
            case 9: num=2; break;
            default:
                num = jug.getFin().getElem() + num;

        }
        return num;
    }
}
