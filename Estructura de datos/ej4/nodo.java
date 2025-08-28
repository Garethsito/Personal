//modelo se 
//molde de una clase
public class nodo {
    private String mascota;
    private nodo next; //cuerda que unae a otro elemento
    //get asignacion o conloca elemento en a caja
    //mas adelante se cambiaran el nombre de las variables
    public void setMascota(String variable) {
        mascota = variable;
    }
    //get permite visualizar el contenido, regresa
    public String getMascota(){
        return mascota;
    }

    public void setnext(nodo variable)
    {
        next = variable;
    }
    public nodo getnext(){
        return next;
    }
}
