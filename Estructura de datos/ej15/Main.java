import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String dato= " ";
        ArregloHash alumnos = new ArregloHash(7);

        for(int i = 0; i < 4; i++){
            System.out.println("Nombre: ");
            dato = lector.nextLine();
            alumnos.asignaHash(dato);
        }

        System.out.println("Lista de alumnos: ");
        alumnos.mostrar();
    }
}
