package ej19b;

import java.io.File;
public class principal {
    public static void main(String[] args) {
        System.out.println("archivos con recursividad (ejercicio 19 carpetas)");
        File fichero = new File("/Users/garethcastro/Desktop/aux");//ruta inicial
        //llamada a las funciones recursivas
        mostrarCarpeta(fichero, "-> ");
    }
    public static void mostrarCarpeta(File fichero, String tab){ //mostrar carpeta
        if(fichero.isDirectory()){
            File[] lista = fichero.listFiles();//trae todos los nombres de archivos de la carpeta
            for (int i = 0; i < lista.length; i++) {
                System.out.println(tab + lista[i].getName());
                if (lista[i].isDirectory()){
                    mostrarCarpeta(lista[i], "--* " + tab);
                }
                
            }
        }
        else System.out.println("ruta incorrecta");
    }
}
