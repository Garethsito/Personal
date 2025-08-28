public class Articulo {
    private String nombre;
    private double precio;
    protected double descuento;

    public Articulo(){
        this.nombre="";
        this.precio=0;
        this.descuento=0.10;
    }

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void convierte(){
        this.nombre=this.nombre.toUpperCase();
    }

    public void convierte(int num){
        this.nombre=this.nombre.toLowerCase();
    }

    public boolean valida(){
        return this.precio>0;
    }

    public void valida(double precio){//en precios mayores a 1000, haremos un descuento
        if(precio>1000){
            this.precio=precio - (precio * descuento);
        }
        else this.precio=precio;
    }

    public void valida(String nombre,int num){
        boolean numeros=false;
        for (int index = 0; index < nombre.length(); index++) {
            if (Character.isDigit(nombre.charAt(index)))
            numeros=true;
        }
        this.nombre = !numeros ? nombre: "";
    }

    public boolean valida(String nombre){
        return nombre.length()>0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + "]";
    }

    
}
