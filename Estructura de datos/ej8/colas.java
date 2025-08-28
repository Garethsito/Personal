package ej8;

public class colas {
    private nodo inicio=null;
    private nodo fin=null;
    nodo elem = new nodo();
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

    public void insertar(String elem){
        nodo nuevo = new nodo();
        nuevo.setElem(elem);
        //cuando esta vacia la cola
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
            System.out.println(i.getElem());
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
}
