package Examen2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class colas {
    private nodo inicio = null;
    private nodo fin = null;

    public void cargarDatos(String archivo) throws Exception {
        InputStream ins = new FileInputStream(archivo);
        Scanner scanner = new Scanner(ins);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] partes = linea.split(",");
            String nombre = partes[0];
            int edad = Integer.parseInt(partes[1]);
            insertar(nombre, edad);
        }
        scanner.close();
    }

    public void insertar(String elem, int edad) {
        nodo nuevo = new nodo();
        nuevo.setElem(elem);
        nuevo.setEdad(edad);

        if (inicio == null && inicio == fin) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nodo i = inicio;
            while (i.getNext() != null) {
                i = i.getNext();
            }
            i.setNext(nuevo);
            fin = nuevo;
        }
    }

    public void mostrar() {
        nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getNext();
        }
    }

    public nodo extraer() {
        if (inicio == null) {
            return null; // Si la cola está vacía, retornamos null
        } else {
            nodo temp = inicio; // Guardamos el nodo que queremos extraer
            inicio = inicio.getNext(); // Avanzamos el inicio al siguiente nodo
            if (inicio == null) { // Si hemos extraído el último nodo, actualizamos fin también
                fin = null;
            }
            temp.setNext(null); // Limpiamos la referencia next del nodo extraído
            return temp; // Retornamos el nodo extraído
        }
    }
    
}
