public class ArregloHash{
    private String[] array;
    private int size;

    public ArregloHash(int size){
        this.size = size;
        array = new String[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = "vacio";
        }
    }

    public void buscar(String dato){
        int pos=0, sumaAscii=0;
        for (int i = 0; i < dato.length(); i++) sumaAscii+=dato.codePointAt(i);
        pos = sumaAscii % size;
        if(array[pos].equals(dato)){
            System.out.println("esta en la posicion " + pos);
        }
        else System.out.println("Fue colision, boscando la posicion");
    }
    public void mostrar(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " : " + array[i]);
        }
    }

    public void asignaHash(String dato){
        int pos=0, sumaAscii=0;
        for (int i = 0; i < dato.length(); i++) sumaAscii+=dato.codePointAt(i);
        pos = sumaAscii % size;//calcula la posicion
        System.out.println(dato + " va en pos " + pos);

        if(array[pos].equals("vacio")){
            array[pos] = dato;
            
        }

        else{
            System.out.println("Posicion ocupada, buscando otra");
            while(!array[pos].equals("vacio")){
                pos++;
                
                if(pos==size){//llego al final, debe regresar a la posicion cero
                    pos=0;
                }
            }//fin del while
            System.out.print("nueva posicion " + pos);
            array[pos]=dato;
        }
    }
}