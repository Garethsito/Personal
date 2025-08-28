public class Productos {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    // Constructor
    public Productos(String nombre, String descripcion, double precio, int stock) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        } else {
            System.out.println("La descripción no puede estar vacía.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Métodos adicionales
    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock incrementado en " + cantidad + ". Nuevo stock: " + this.stock);
        } else {
            System.out.println("La cantidad para incrementar debe ser positiva.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad;
            System.out.println("Stock reducido en " + cantidad + ". Nuevo stock: " + this.stock);
        } else {
            System.out.println("Cantidad inválida o insuficiente stock para reducir.");
        }
    }
}
