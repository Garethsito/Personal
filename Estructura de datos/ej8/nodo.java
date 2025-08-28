package ej8;

public class nodo {
    private String elem;
    private nodo next;

    public nodo getNext(){
        return next;
    }
    public void setNext(nodo next) {
        this.next = next;
    }

    public String getElem() {
        return elem;
    }

    public void setElem(String variable) {
        elem = variable;
    }

}
