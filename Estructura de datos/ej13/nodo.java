package ej13;

public class nodo {
    private int elem;
    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    private int raiz;
    private nodo izq;
    private nodo der;
    public nodo getIzq() {
        return izq;
    }

    public void setIzq(nodo izq) {
        this.izq = izq;
    }

    public nodo getDer() {
        return der;
    }

    public void setDer(nodo der) {
        this.der = der;
    }

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int variable) {
        raiz = variable;
    }



}

