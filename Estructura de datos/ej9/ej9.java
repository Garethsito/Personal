package ej9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//Ejercicio 9 Colas en fils de pacientes
/*En una clinica del IMSS por error los pacientes hicieron 2 filas,
 * al empezar a atenderlos , se deben unificar en una sola fila de a
 * cuerdo a la hora de llegada. Al unificar, asigne un turno.
 * Guarde el nombre, la hora de llegada del paciente.
 */

public class ej9 {
    public static void main (String[] args)throws Exception {
        System.out.println("ejercicio 9 Colas");
        Scanner leer = new  Scanner(System.in);
        colas fila1 = new colas();
        colas fila2 = new colas();
        colas unifila = new colas(); //cambiar esta linea para cambiar de fila
        String nombre;
        int opc=0;
        //carga automatica de dtos:
        /* 
        cargarDatos("ej9/fila1.txt", fila1);
        cargarDatos("ej9/fila2.txt", fila2);
        */

        InputStream ins = new FileInputStream("/Users/garethcastro/Documents/Estructura de datos/ej9/fila1.txt");
        Scanner obj = new Scanner(ins);
        String str = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime;

        while (obj.hasNextLine()) {
            String linea = obj.nextLine();
            String[] parts = linea.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            str = "2024-09-24 " + part2;
            dateTime = LocalDateTime.parse(str, formatter);
            //System.out.println(obj.nextLine());
            fila1.insertar(obj.nextLine(), 0, dateTime);
        }
        InputStream ins2 = new FileInputStream("/Users/garethcastro/Documents/Estructura de datos/ej9/fila2.txt");
        Scanner obj2 = new Scanner(ins2);
        while (obj2.hasNextLine()) {
            //System.out.println(obj.nextLine());
            fila2.insertar(obj2.nextLine(), 0, null);
        }
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                    System.out.println("insertar nombre");
                    nombre = leer.nextLine();
                    fila1.insertar(nombre,0,null);
                    break;
                case 2:
                    System.out.println("Fila 1");
                    fila1.mostrar();
                    System.out.println("Fila 2");
                    fila2.mostrar();
                    break;
                case 3:
                fila1.borrar();
                System.out.println("borrado!");                
                break;
                case 4:
                System.out.println("buscar nombre");
                nombre=leer.nextLine();
                fila1.buscar(nombre);
                break;
                case 5:
                unifila.combinar(fila1,fila2);
                unifila.mostrar();
                break;

            }
    
        }while( opc!=9);
    }//fin del main
    public static void menu(){
        System.out.println("listas simples");
        System.out.println("1 insertar");
        System.out.println("2 mostrar");
        System.out.println("3 borrar");
        System.out.println("4 buscar");
        System.out.println("5 mostrar unifila");
        System.out.println("9 salir");
    }
    /* 
    public static void cargarDatos(String archivo, colas fila) throws Exception{
        InputStream ins = new FileInputStream("archivo");
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine()) {
            //System.out.println(obj.nextLine());
            fila.insertar(obj.nextLine(), 0, null);
        }
        obj.close();
    }*/
}
