import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] iniciales = new char[10];
        String nombre;
        String paterno;
        String materno;

        // Ejercicio 1: Probar iteraciones y condiciones
        System.out.println("Ejercicio 2\n");
        do{
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.length()==0)
                System.out.println("no puede quedar vacio");
            
        }while(nombre.length() == 0 || noNumeros(nombre) == false || soloLetras(nombre) == false);

        do{
            System.out.print("Apellido paterno: ");
            paterno = scanner.nextLine();
            if (paterno.length()==0)
                System.out.println("no puede quedar vacio");
        }while(paterno.length() == 0 || noNumeros(paterno) == false || soloLetras(paterno) == false);

        do{
            System.out.print("Apellido materno: ");
            materno = scanner.nextLine();
        }while(materno.length() == 0 || noNumeros(materno) == false || soloLetras(materno)==false);
        // Generación de iniciales
        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = materno.toUpperCase().charAt(0);
        iniciales[2] = nombre.toUpperCase().charAt(0);
        

        System.out.println("Comprobando datos:");
        System.out.println(nombre + " " + paterno + " " + materno);
        System.out.println("Iniciales:");
        Desplegar_arreglo(iniciales);

    }

    public static void Desplegar_arreglo(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static boolean noNumeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))){
                System.out.println("no usar numeros");
                return false;//hay numeros, no se permite
            }
        }   
        return true;//todo salio bien
    }

    public static boolean soloLetras(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isAlphabetic(cadena.charAt(i))){
                System.out.println("solo letras");
                return false;//hay caracteres especiales, no se permite
            }
        }   
        return true;//todo salio bien
    }
}
