import java.time.Duration;
import java.time.LocalDateTime;

public class Lista {
    private nodoej5 inicio;
    private nodoej5 fin;
    private nodoej5 referencia = inicio;
    private nodoej5 actual = inicio;

    //valores iniciales
    public Lista(){
        inicio = null;
        fin = null;
    }
    public void setInicio(nodoej5 variable){    
        inicio = variable;
    }

    public nodoej5 getInicio(){
        return inicio;
    }
    public void setFin(nodoej5 variable){    
        fin = variable;
    }

    public nodoej5 getFin(){
        return fin;
    }

    public void direcciones(){
        System.out.println("inicio: " + inicio);
        System.out.println("fin: " + fin);
    }

    public void insertar(String Elem){
        nodoej5 nuevo = new nodoej5();
        LocalDateTime fechaHoraActual = LocalDateTime.now();  // fecha y hora actual
        nuevo.setElem(Elem+": "+fechaHoraActual);
        //lista vacia coloca el primer elemento
        if  (inicio==null &&fin == null){
            inicio = nuevo;
            fin = nuevo;
        }
        else
        {
            fin.setnext(nuevo);
            fin = nuevo;
            
        }

    }

    public void mostrar(){
        if (inicio !=null){
            nodoej5 i;
            i=inicio;
            while (i !=null){
                System.out.println(i.getElem());
                i = i.getnext();
    
            }
        }
        else{
            System.out.println("La lista esta vacia");
        }
    }//fin de mostrar

    public void insertarInicio(String Elem){
        nodoej5 nuevo = new nodoej5();
        nuevo.setElem(Elem);
        nodoej5 aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
    }

    public void buscar(String Elem){
        nodoej5 i=inicio;
        boolean estado = false;
        while (i!=null){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista");
                i=null;
                estado = true;

            }
            else{
                i=i.getnext();
            }
        }
        if (estado == false){
            System.out.println("El elemento no se encuentra en la lista");
        }
    }

    public void insertEnmedio(String colado, String Elem){
        nodoej5 nuevo=new nodoej5();
        boolean estado = false;
        nuevo.setElem(colado);
        nodoej5 i=inicio;
        nodoej5 ant=inicio;
        while (i!=null && estado==false) {
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista");
                estado = true;
                if(i==inicio){
                    insertarInicio(colado);

                }
                else{
                    ant.setnext(nuevo);
                    nuevo.setnext(i);
                }
            }
            else{
                if(i!=inicio) ant=ant.getnext();
                i=i.getnext();

            }
        }
        if (estado == false){
            System.out.println("El elemento no se encuentra en la lista");
        }

    }

    public void borrarNombre(String Elem){
        nodoej5 i=inicio;
        nodoej5 ant=inicio;
        boolean estado=false;
        while(i!=null){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se ha borrado");
                if(i==inicio){
                    inicio=i.getnext();
                    i.setnext(null);
                }
                else{
                    ant.setnext(i.getnext());
                }
                i=null;
                estado=true;
            }
            else{
                if(i!=inicio){
                    ant=ant.getnext();
                i=i.getnext();
                }
            }

        }

        if(estado==false){
            System.out.println("El elemento no se encuentra en la lista");
        }


    }



    public void calcularDesfaceHoras(){
        if(inicio==null){
            nodoej5 referencia = inicio;
            nodoej5 actual = inicio;

            while(actual !=null){
                //calcular desface de horas entre el nodo actual y nodo de referencia
                long desface = Duration.between(referencia.getFechaHora(), actual.getFechaHora()).toHours();
                System.out.println("desface de horas para " + actual.getElem() + ":" + desface);
                //avanzar al siguiente nodo
                actual = actual.getnext();
            }
        }
        else{
            System.out.println("La lista está vacia");
        }
    }

}
