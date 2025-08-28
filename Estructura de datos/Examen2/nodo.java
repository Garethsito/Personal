package Examen2;

public class nodo {
    private String elem;
    private int edad;
    private nodo next;

    public nodo getNext() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + elem + ", edad=" + edad + "]";
    }

    
}
