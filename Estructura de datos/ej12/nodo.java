package ej12;

public class nodo {
    private int elem;
    private nodo next;
    private nodo back;

    public nodo getNext(){
        return next;
    }
    public void setNext(nodo next) {
        this.next = next;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int variable) {
        elem = variable;
    }

    public nodo getBack() {
        return back;
    }

    public void setBack(nodo variable) {
        this.back = variable;
    }



}

