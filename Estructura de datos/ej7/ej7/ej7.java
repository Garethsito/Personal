package ej7;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Scanner;


public class ej7 {
    public static void main (String[] args) throws Exception {
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        lista7 grupo = new lista7();
        String nombre;
        int opc=0;
        String colado;
        LocalDateTime fechaHoraActual;
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                    System.out.println("insertar nombre");
                    nombre = leer.nextLine();
                    grupo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Lista del grupo");
                    if(grupo.vacia()==true){
                        System.out.println("La lista está vacia");
                        break;
                    }
                    else grupo.mostrar();
                    break;
                case 3:
                    System.out.println("nombre para agregar: ");
                    nombre = leer.nextLine();
                    if(grupo.vacia()==true){
                        grupo.insertar(nombre);}
                    else grupo.insertarInicio(nombre);
                    break;
                case 4:
                System.out.println("buscar nombre: ");
                    nombre=leer.nextLine();
                    grupo.buscar(nombre);
                    break;
                case 5:
                System.out.println("Nombre a insertar: ");
                colado = leer.nextLine();
                System.out.println("Antes de quien: ");
                nombre = leer.nextLine();
                grupo.insertEnmedio(colado, nombre);
                    break;
                case 6:
                //if (grupo.vacia()==false){
                if(!grupo.vacia()){
                    System.out.println("Nombre para borrar: ");
                    nombre = leer.nextLine();
                        if (grupo.borrarNombre(nombre)==true){
                            System.out.println("borrado");
                            System.out.println("");
                        }
                        else System.out.println("No se encuentra el nombre");
                    }  
                
                else{
                    System.out.println("La lista está vacia");}
                  
                    break;
                case 7:
                if (grupo.vacia()){
                    System.out.println("La lista está vacia");
                }
                grupo.mostrarInverso();
                    break;
                case 8:
                InputStream ins = new FileInputStream("ej7/ej7/datos.txt");
                Scanner obj = new Scanner(ins);
                while (obj.hasNextLine()) System.out.println(obj.nextLine());
                break;
                //no encuentra el archivo de datos.txt
                case 9: // guardar datos en archivo Datos.txt
                    if (grupo.vacia()==true) {
                        System.out.println("La lista está vacia");
                    }
                    else{
                        System.out.println("guardando...");
                        grupo.guardarEnArchivo("grupo.txt");
                        System.out.println("Guardado exitoso :D");
                    }
                break;
                
            }
    
        }while( opc!=10);
    }//fin del main
    public static void menu(){
        System.out.println();
        System.out.println("LISTAS SIMPLES");
        System.out.println("1 insertar");
        System.out.println("2 mostrar");
        System.out.println("3 insertar al inicio");
        System.out.println("4 buscar");
        System.out.println("5 insertar en medio");
        System.out.println("6 borrar");
        //System.out.println("7 reiniciar");
        System.out.println("7 mostrar al revez");
        System.out.println("8 mostrar datos de archivo");
        System.out.println("9 cargar datos a un archivo");
        System.out.println("10 salir");
    }
}
