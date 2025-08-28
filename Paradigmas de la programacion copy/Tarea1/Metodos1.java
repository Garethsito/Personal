public class Metodos1 {
    //Se usa 'static' cuando se quiere usar una variable, metodo o bloques de codigo
    //en cualquier parte de la clase, no importa la instancia de la clase.

    //En este caso se utiliza una variable que se accede a ella desde el metodo main.
    static int vStatic=0;
    public void cont(){
        vStatic++;
    }

    String nombre;
    public static void main(String[] args) { 
        System.out.println(vStatic);

        Metodos1 persona1 = new Metodos1();
        Metodos1 persona2 = new Metodos1();

        persona1.nombre = "juan";
        persona2.nombre = "pedro";

        System.out.println("la persona 1 se llama:" + persona1.nombre);
        System.out.println("la persona 2 se llama:" + persona2.nombre);
    }

    //se utiliza void cuando no ocupamos que nos regrese un valor.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Pondrmos return cuando queremos que nos regrese un valor
    public String getNombre(){
        cont();
        return nombre;
    }
}