package ej13;

public class arbol {
    private nodo raiz;

    public arbol(){
        raiz=null;
    }

    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }


    public boolean vacio(){
        if (raiz==null){
            return true;
        }
        else return false;
    }
    public void insertar(int elem){
        nodo nuevo = new nodo();
        nuevo.setElem(elem);
        if (vacio()){
            raiz = nuevo;
        }
        else{
            nodo i = raiz;
            while(i!=null){
                if(elem > i.getElem()){
                    //validar si el nodo iszquierdo esta vacio
                    if(i.getDer()==null){
                        i.setDer(nuevo);
                        i=null; // o i=nuevo.getDer()
                    }else i.getDer();
                }// if fin derecha
                else {
                    if(i.getIzq()==null){
                        i=i.getIzq();
                        i=null;
                    }
                    else{
                        i = i.getIzq();
                    }
                }//fin izquierda
            }
        }
    }
    public void mostrarPreorden(nodo aux){
        if (aux!=null){
            System.out.println(aux.getElem() + " - ");
            mostrarPreorden(aux.getIzq());
            mostrarPreorden(aux.getDer());
        }
    }

    public void mostrarInOrden(nodo aux){
        if(aux!=null){
            mostrarInOrden(aux.getIzq());
            System.out.println(aux.getElem() + " - ");
            mostrarInOrden(aux.getDer());
        }
    }
}
