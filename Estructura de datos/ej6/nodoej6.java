package ej6;
//modelo se 
//molde de una clase
public class nodoej6 {
    private String Elem;
    private nodoej6 next;
    private nodoej6 back; //cuerda que unae a otro elemento
    //get asignacion o conloca elemento en a caja
    //mas adelante se cambiaran el nombre de las variables
    public void setElem(String variable) {
        Elem = variable;
    }
    //get permite visualizar el contenido, regresa
    public String getElem(){
        return Elem;
    }

    public void setnext(nodoej6 variable)
    {
        next = variable;
    }
    public nodoej6 getnext(){
        return next;
    }

    public void setback(nodoej6 variable){
        back = variable;
    }

    public nodoej6 getback(){
        return back;
    }
}