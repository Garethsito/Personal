public class Categorias {
    private String nombre;
    private String descripcion;
    private String departamento;
    private int numeroProductos;

    // Constructor
    public Categorias(String nombre, String descripcion, String departamento) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setDepartamento(departamento);
        this.numeroProductos = 0; // Inicialmente, el contador de productos es 0
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre de la categoría no puede estar vacío.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        } else {
            System.out.println("La descripción de la categoría no puede estar vacía.");
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.trim().isEmpty()) {
            this.departamento = departamento;
        } else {
            System.out.println("El departamento no puede estar vacío.");
        }
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        if (numeroProductos >= 0) {
            this.numeroProductos = numeroProductos;
        } else {
            System.out.println("El número de productos no puede ser negativo.");
        }
    }

    // Métodos adicionales
    public void agregarProducto() {
        this.numeroProductos++;
        System.out.println("Producto agregado a la categoría. Total productos: " + this.numeroProductos);
    }

    public void eliminarProducto() {
        if (this.numeroProductos > 0) {
            this.numeroProductos--;
            System.out.println("Producto eliminado de la categoría. Total productos: " + this.numeroProductos);
        } else {
            System.out.println("No hay productos en esta categoría para eliminar.");
        }
    }
}
