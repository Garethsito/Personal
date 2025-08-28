package ej7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class lista7 {
    private nodoej7 inicio;
    private nodoej7 fin;

    //valores iniciales
    public lista7(){
        inicio = null;
        fin = null;
    }
    public void setInicio(nodoej7 variable){    
        inicio = variable;
    }

    public nodoej7 getInicio(){
        return inicio;
    }
    public void setFin(nodoej7 variable){    
        fin = variable;
    }

    public nodoej7 getFin(){
        return fin;
    }

    public void direcciones(){
        System.out.println("inicio: " + inicio);
        System.out.println("fin: " + fin);
    }

    public void insertar(String Elem){
        nodoej7 nuevo = new nodoej7();
        nuevo.setElem(Elem);
        //lista vacia coloca el primer elemento
        if  (inicio==null && fin==null){
            inicio = nuevo;
            fin = nuevo;
        }
        else
        {
            nodoej7 i=inicio;
            while (i.getnext()!=null){
                i = i.getnext();
            }
            i.setnext(nuevo);
            nuevo.setback(i);
            fin=nuevo;
        }
    }

    public void mostrar(){
        if (inicio !=null){
            nodoej7 i;
            i=inicio;
            while (i !=null){
                System.out.println(i.getElem());
                i = i.getnext();
    
            }
        }
    }//fin de mostrar

    public void insertarInicio(String Elem){
        nodoej7 nuevo = new nodoej7();
        nuevo.setElem(Elem);
        nodoej7 aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
        aux.setback(inicio);
    }

    public void buscar(String Elem){
        nodoej7 i=inicio;
        boolean estado = false;
        while (i!=null){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista");
                i=null;
                estado = true;

            }
            else{
                i=i.getnext();
            }
        }
        if (estado == false){
            System.out.println("El elemento no se encuentra en la lista");
        }
    }

    public void insertEnmedio(String colado, String Elem){
        nodoej7 nuevo=new nodoej7();
        boolean estado = false;
        nuevo.setElem(colado);
        nodoej7 i=inicio;
        while (i!=null && estado==false) {
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista");
                estado = true;
                if(i==inicio) {insertarInicio(colado); }
                else{
                    i.getback().setnext(nuevo);
                    nuevo.setnext(i);
                    nuevo.setback(i.getback());
                    i.setback(nuevo);
                }
            }
            else{
                i=i.getnext();

            }
        }
        if (estado == false){
            System.out.println("El elemento no se encuentra en la lista");
        }

    }

     public boolean borrarNombre(String Elem){
        nodoej7 i=inicio;
        boolean estado=false;
        //si no has llegado al final y no lo has encontrado, sigue buscando
        while(i!=null && estado==false){
            if(Elem.equals(i.getElem())){
                if(inicio==fin){
                    inicio=fin=null;
                }
                else if (i==inicio){
                        inicio=inicio.getnext();
                        i.setnext(null);
                        inicio.setback(null);
                    }
                    else{
                        if(i==fin){
                            fin=fin.getback();
                            i.setback(null);
                            fin.setnext(null);
                        }
                        else{
                            i.getback().setnext(i.getnext());
                            i.getnext().setback(i.getback());
                            i.setnext(null);
                            i.setback(null);
                        }
                    }
                    estado=true;

                }
                
            
            else i=i.getnext();

        
        }
        return estado;


    }

    public void limpiar(){
        inicio=fin=null;
    }

    public boolean vacia(){
        if(inicio==null && fin==null){
            return true;
        }
        else return false;
    }



    public void guardarEnArchivo(String nombreArchivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            nodoej7 actual = inicio; // Comenzamos desde el nodo inicial

            while (actual != null) {
                escritor.write(actual.getElem()); // Escribir el dato del nodo en el archivo
                escritor.newLine(); // Nueva línea para cada dato
                actual = actual.getnext(); // Mover al siguiente nodo
            }
            System.out.println("Lista guardada exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la lista en el archivo.");
            e.printStackTrace();
        }
    }

    public void mostrarInverso(){
        nodoej7 i = fin;
        while (i!= null){
            System.out.println(i.getElem());
            i = i.getback();
        }
    }
    
}
