package ej12;
import java.util.Scanner;

public class ej12 {
    public static int mov = 0, falla =0;
    public static void main (String[] args){
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        pila grupo1 = new pila();
        pila grupo2 = new pila();
        pila grupo3 = new pila();
        String nombre;
        int opc=0;//n movimientos
        inicializar(grupo1);
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                if(!grupo1.vacia()){
                    System.out.println("Mover de 1 a 2");
                    validarMovimiento(grupo1,grupo2);
                    
                }
                    //grupo.insertar(nombre);
                    break;
                case 2:
                if(!grupo1.vacia()){
                    System.out.println("Mover de 1 a 3");
                    validarMovimiento(grupo1,grupo3);
                }
                    break;
                case 3:
                if(!grupo2.vacia()){
                    System.out.println("Mover de 2 a 3");
                    validarMovimiento(grupo2,grupo3);
                } 
                    break;
                case 4:
                if(!grupo2.vacia()){
                    System.out.println("Mover de 2 a 1");
                    validarMovimiento(grupo2,grupo1);
                }
                break;
                case 5:
                if(!grupo3.vacia()){
                    System.out.println("Mover de 3 a 1");
                    validarMovimiento(grupo3,grupo1);
                }
                break;
                case 6:
                if(!grupo3.vacia()){
                    System.out.println("Mover de 3 a 2");
                    validarMovimiento(grupo3,grupo2);
                }
                break;
                case 7:
                inicializar(grupo1);
                grupo2=null;
                grupo3=null;
            }//fin del switch
            System.out.println("contenido grupo1");
            grupo1.mostrar();
            System.out.println("contenido grupo2");
            grupo2.mostrar();
            System.out.println("contenido grupo3");
            grupo3.mostrar();
            //validar si ya gano
    
        }while( opc!=9 || grupo3.validarGanador());
        System.out.println("Total de movimientos" + mov);
        System.out.println("Total de movimientos fallidos" + falla);
    }//fin del main

    public static void validarMovimiento(pila origen, pila destino){
        if(destino.getCabeza()==null){
            destino.insertar(origen.getCabeza().getElem());
            origen.borrar();
        }
        else{
            if (destino.getCabeza().getElem() > origen.getCabeza().getElem()){
                destino.insertar(origen.getCabeza().getElem());
                origen.borrar();
                mov++;
            }
            else{
                System.out.println("movimiento invalido");
                falla++;
            }
        }
    }
    public static void inicializar(pila grupo){
        for(int i = 3; i>=1; i--){
            grupo.insertar(i);
        }
        
    }
    public static void menu(){
        System.out.println("1. -->mover 1 a 2");
        System.out.println("2. -->mover 1 a 3");
        System.out.println("3. -->mover 2 a 3");
        System.out.println("4. <--mover 2 a 1");
        System.out.println("5. <--mover 3 a 1");
        System.out.println("6. <--mover 3 a 2");
        System.out.println("9. terminar");
    }
}
