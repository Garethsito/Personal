import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int opc, opcP, opcC;
        String nombre, descripcion, departamento;
        double precio;
        int stock;

        Scanner leer = new Scanner(System.in);
        ArrayList<Productos> productos = new ArrayList<>();
        ArrayList<Categorias> categorias = new ArrayList<>();

        while (true) {
            System.out.println("Bienvenid@! ¿Qué quieres gestionar?");
            System.out.println("1) Productos");
            System.out.println("2) Categorias");
            System.out.println("3) Salir");
            opc = Integer.parseInt(leer.nextLine());

            if (opc == 3) break;

            switch (opc) {
                case 1: // Submenú para Productos
                    while (true) {
                        System.out.println("1) Agregar Producto");
                        System.out.println("2) Eliminar Producto");
                        System.out.println("3) Mostrar todos los Productos");
                        System.out.println("4) Guardar Productos");
                        System.out.println("5) Leer Productos");
                        System.out.println("6) Volver al menú principal");
                        opcP = Integer.parseInt(leer.nextLine());

                        if (opcP == 6) break;

                        switch (opcP) {
                            case 1: // Agregar Producto
                                System.out.println("Ingrese el nombre del producto:");
                                nombre = leer.nextLine();
                                System.out.println("Ingrese la descripción del producto:");
                                descripcion = leer.nextLine();
                                System.out.println("Ingrese el precio del producto:");
                                precio = leer.nextDouble();
                                System.out.println("Ingrese el stock:");
                                stock = leer.nextInt();
                                leer.nextLine();

                                Productos producto = new Productos(nombre, descripcion, precio, stock);
                                productos.add(producto);
                                System.out.println("Producto agregado exitosamente.");
                                break;

                            case 2: // Eliminar Producto
                                System.out.println("Ingrese el nombre del producto a eliminar:");
                                nombre = leer.nextLine();
                                boolean eliminado = false;

                                for (int i = 0; i < productos.size(); i++) {
                                    if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                                        productos.remove(i);
                                        eliminado = true;
                                        System.out.println("Producto eliminado.");
                                        break;
                                    }
                                }

                                if (!eliminado) {
                                    System.out.println("Producto no encontrado.");
                                }
                                break;

                            case 3: // Mostrar todos los Productos
                                if (productos.isEmpty()) {
                                    System.out.println("No hay productos registrados.");
                                } else {
                                    for (Productos prod : productos) {
                                        System.out.println("Producto: " + prod.getNombre() + ", Descripción: " + prod.getDescripcion() + ", Precio: " + prod.getPrecio() + ", Stock: " + prod.getStock());
                                    }
                                }
                                break;

                            case 4: // Guardar Productos en archivo
                                guardarProductos(productos);
                                break;

                            case 5: // Leer Productos desde archivo
                                leerProductos(productos, categorias);
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                    break;

                case 2: // Submenú para Categorías
                    while (true) {
                        System.out.println("1) Agregar Categoría");
                        System.out.println("2) Eliminar Categoría");
                        System.out.println("3) Mostrar todas las Categorías");
                        System.out.println("4) Guardar Categorías");
                        System.out.println("5) Leer Categorías");
                        System.out.println("6) Volver al menú principal");
                        opcC = Integer.parseInt(leer.nextLine());

                        if (opcC == 6) break;

                        switch (opcC) {
                            case 1: // Agregar Categoría
                                System.out.println("Ingrese el nombre de la nueva categoría:");
                                nombre = leer.nextLine();
                                System.out.println("Ingrese la descripción de la categoría:");
                                descripcion = leer.nextLine();
                                System.out.println("Ingrese el departamento:");
                                departamento = leer.nextLine();

                                Categorias categoria = new Categorias(nombre, descripcion, departamento);
                                categorias.add(categoria);
                                System.out.println("Categoría agregada exitosamente.");
                                break;

                            case 2: // Eliminar Categoría
                                System.out.println("Ingrese el nombre de la categoría a eliminar:");
                                nombre = leer.nextLine();
                                boolean categoriaEliminada = false;

                                for (int i = 0; i < categorias.size(); i++) {
                                    if (categorias.get(i).getNombre().equalsIgnoreCase(nombre)) {
                                        categorias.remove(i);
                                        categoriaEliminada = true;
                                        System.out.println("Categoría eliminada.");
                                        break;
                                    }
                                }

                                if (!categoriaEliminada) {
                                    System.out.println("Categoría no encontrada.");
                                }
                                break;

                            case 3: // Mostrar todas las Categorías
                                if (categorias.isEmpty()) {
                                    System.out.println("No hay categorías registradas.");
                                } else {
                                    for (Categorias cat : categorias) {
                                        System.out.println("Categoría: " + cat.getNombre() + ", Descripción: " + cat.getDescripcion() + ", Departamento: " + cat.getDepartamento());
                                    }
                                }
                                break;

                            case 4: // Guardar Categorías en archivo
                                guardarCategorias(categorias);
                                break;

                            case 5: // Leer Categorías desde archivo
                                leerCategorias(categorias);
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        leer.close(); // Cerrar el Scanner al salir del programa
    }

    // Métodos para guardar y leer productos en archivo
    private static void guardarProductos(ArrayList<Productos> productos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("productos.txt"))) {
            for (Productos producto : productos) {
                writer.println(producto.getNombre() + "," + producto.getDescripcion() + "," + producto.getPrecio() + "," + producto.getStock());
            }
            System.out.println("Productos guardados en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar productos.");
        }
    }

    private static void leerProductos(ArrayList<Productos> productos, ArrayList<Categorias> categorias) {
        try (BufferedReader reader = new BufferedReader(new FileReader("productos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String nombre = data[0];
                String descripcion = data[1];
                double precio = Double.parseDouble(data[2]);
                int stock = Integer.parseInt(data[3]);
    
                Productos producto = new Productos(nombre, descripcion, precio, stock);
                productos.add(producto);
            }
            System.out.println("Productos cargados desde archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer productos.");
        }
    }
    

    // Métodos para guardar y leer categorías en archivo
    private static void guardarCategorias(ArrayList<Categorias> categorias) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("categorias.txt"))) {
            for (Categorias categoria : categorias) {
                writer.println(categoria.getNombre() + "," + categoria.getDescripcion() + "," + categoria.getDepartamento());
            }
            System.out.println("Categorías guardadas en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar categorías.");
        }
    }

    private static void leerCategorias(ArrayList<Categorias> categorias) {
        categorias.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("categorias.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String nombre = data[0];
                String descripcion = data[1];
                String departamento = data[2];

                Categorias categoria = new Categorias(nombre, descripcion, departamento);
                categorias.add(categoria);
            }
            System.out.println("Categorías cargadas desde archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer categorías.");
        }
    }
}
