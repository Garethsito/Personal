package ej11;

public class pila {

    private nodo cabeza=null;
    private nodo fin=null;

    nodo elem = new nodo();

    /////////////
    public void insertar(int elem){
        nodo nuevo = new nodo();
        nuevo.setElem(elem);
        nuevo.setNext(null);
        //cuando esta vacia la cola
        if(cabeza==null && cabeza==fin){
            cabeza=nuevo;
            fin=nuevo;
        }
        //cuando hay elementos
        else{
            cabeza.setNext(nuevo);
            cabeza = nuevo;
            
        }
    }
    /////////////
    public void limpiar(){
        cabeza=fin=null;
    }

     /////////////
     public void mostrar(){
        nodo i = cabeza;
        pila aux = new pila();  //pila auxiliar
        while(cabeza != null){    
            System.out.println(cabeza.getElem());
            aux.insertar(cabeza.getElem());
            this.borrar();
        }
        //regresar a la pila original.
        while(aux.cabeza != null){    
            System.out.println(aux.cabeza.getElem());
            this.insertar(aux.cabeza.getElem());
            aux.borrar();
        }
     }

    public void borrar(){
        if (cabeza==fin){// hay un solo elemento.
            cabeza = fin = null;
        }
        else{
            nodo i = fin;
            while(i.getNext() != cabeza){
                i = i.getNext();
            }
            i.setNext(null);
            cabeza = i;
        }
    }



    public nodo getCabeza() {
        return cabeza;
    }
    public void setCabeza(nodo cabeza) {
        this.cabeza = cabeza;
    }
    public nodo getFin() {
        return fin;
    }
    public void setFin(nodo fin) {
        this.fin = fin;
    }
}
