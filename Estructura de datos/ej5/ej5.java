import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        System.out.println("ejercicio 5 lista sencilla");
        Scanner leer = new Scanner(System.in);
        Lista grupo = new Lista();
        String nombre;
        int opc = 0;
        String colado;
        
        do {
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Insertar nombre:");
                    nombre = leer.nextLine();
                    grupo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Lista del grupo:");
                    grupo.mostrar();
                    break;
                case 3:
                    System.out.println("Nombre para agregar al inicio:");
                    nombre = leer.nextLine();
                    grupo.insertarInicio(nombre);
                    break;
                case 4:
                    System.out.println("Buscar nombre:");
                    nombre = leer.nextLine();
                    grupo.buscar(nombre);
                    break;
                case 5:
                    System.out.println("Nombre a insertar:");
                    colado = leer.nextLine();
                    System.out.println("Antes de quién:");
                    nombre = leer.nextLine();
                    grupo.insertEnmedio(colado, nombre);
                    break;
                case 6:
                    System.out.println("Nombre para borrar:");
                    nombre = leer.nextLine();
                    grupo.borrarNombre(nombre);
                    break;
                case 7:
                    // Nueva opción para calcular y mostrar el desfase de horas
                    System.out.println("Calculando desfase de horas...");
                    grupo.calcularDesfaceHoras();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opc != 9);
        
        leer.close();
    }

    public static void menu() {
        System.out.println("Listas simples");
        System.out.println("1. Insertar");
        System.out.println("2. Mostrar");
        System.out.println("3. Insertar al inicio");
        System.out.println("4. Buscar");
        System.out.println("5. Insertar en medio");
        System.out.println("6. Borrar");
        System.out.println("7. Calcular desfase de horas");  // Nueva opción para calcular el desfase
        System.out.println("9. Salir");
    }
}
