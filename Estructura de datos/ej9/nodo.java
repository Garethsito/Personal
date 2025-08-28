package ej9;


import java.time.LocalDateTime;
public class nodo {
    private String elem;
    private int turno;
    private LocalDateTime hora;
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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "Paciente [nombre=" + elem + ", turno=" + turno + ", hora=" + hora + "]";
    }

    
}
