package ej7;
//modelo se 
//molde de una clase
public class nodoej7 {
    private String Elem;
    private nodoej7 next;
    private nodoej7 back; //cuerda que unae a otro elemento
    //get asignacion o conloca elemento en a caja
    //mas adelante se cambiaran el nombre de las variables
    public void setElem(String variable) {
        Elem = variable;
    }
    //get permite visualizar el contenido, regresa
    public String getElem(){
        return Elem;
    }

    public void setnext(nodoej7 variable)
    {
        next = variable;
    }
    public nodoej7 getnext(){
        return next;
    }

    public void setback(nodoej7 variable){
        back = variable;
    }

    public nodoej7 getback(){
        return back;
    }
}