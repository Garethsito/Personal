package ej9;

import java.time.LocalDateTime;
// cola adaptada para filas de pacientes para el IMSS
public class colas {
    private nodo inicio=null;
    private nodo fin=null;
    nodo elem = new nodo();
    int turno =1;
    public void borrar(){
        // si solo hay un elemento O esta vacia la cola
        if(inicio==null){
            inicio=null;
            fin=null;
        }
        // si hay mas de un elemento
        else{
            nodo aux = inicio.getNext();
            inicio.setNext(null);
            inicio=aux;
        }
    }//fin del metodo borrar

    public void insertar(String elem, int turno, LocalDateTime hora){
        nodo nuevo = new nodo();
        nuevo.setElem(elem);
        nuevo.setHora(hora);
        nuevo.setTurno(turno);
        //cuando esta vacia la cola, coloca el primer elemento
        if(inicio==null && inicio==fin){
            inicio=nuevo;
            fin=nuevo;
        }
        //cuando hay elementos
        else{
            nodo i = inicio;
            while(i.getNext()!=null){
                i=i.getNext();
            }
            i.setNext(nuevo);
            fin=nuevo;
        }
    }
    public void mostrar(){
        nodo i =inicio;
        while(i!=null){
            System.out.println(i.toString());
            i=i.getNext();
        }
    }

        public void buscar(String Elem){
        nodo i=inicio;
        boolean estado = false;
        while (i!=null){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista");
                i=null;
                estado = true;

            }
            else{
                i=i.getNext();
            }
        }
        if (estado == false){
            System.out.println("El elemento no se encuentra en la lista");
        }
    }
    // se asume que ambas filas estan combinadas por horas
    public void combinar(colas fila1,colas fila2){
        nodo i1= fila1.inicio;
        nodo i2= fila2.inicio;

        while(i1!=null && i2!=null){
            if(i1.getHora().isBefore(i2.getHora())){
                this.insertar(i1.getElem(), 0, i1.getHora());
                i1=i1.getNext();
                turno++;
            }
            else if(i1.getHora().equals(i2.getHora()))
                {
                    this.insertar(i1.getElem(), 0, i1.getHora());
                    this.insertar(i2.getElem(), 0, i2.getHora());
                    i1=i1.getNext();
                    i2=i2.getNext();
                    turno++;
                }
            
            else{
                this.insertar(i2.getElem(), 0, i2.getHora());
                    i2=i2.getNext();
            }
        }
        //si al terminar hay elementos en alguna fila, se agregan al final.
        while(i1!=null){
            this.insertar(i1.getElem(), 0, i1.getHora());
            i1=i1.getNext();
            turno++;
        }
        while(i2!=null){
            this.insertar(i2.getElem(), 0, i2.getHora());
            turno++;
            i2=i2.getNext();
        }
    }

}
