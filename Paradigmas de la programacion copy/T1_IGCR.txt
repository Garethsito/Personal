import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] iniciales = new char[10];
        String nombre;
        String paterno;
        String materno;
        byte aa, mm, dd;
        boolean bisiesto;

        // Ejercicio 1: Pedir nombre, apellidos, fecha de nacimiento y generar iniciales
        System.out.println("Ejercicio 1\n");

        System.out.print("Nombre: ");
        nombre = scanner.next();

        System.out.print("Apellido paterno: ");
        paterno = scanner.next();

        System.out.print("Apellido materno: ");
        materno = scanner.next();

        System.out.println("Dame tu año de nacimiento (últimos 2 dígitos): ");
        do {
            System.out.print("Año: ");
            aa = scanner.nextByte();
        } while (aa < 1 || aa > 99);

        do {
            System.out.print("Mes: ");
            mm = scanner.nextByte();
        } while (mm < 1 || mm > 12);

        do {
            System.out.print("Día: ");
            dd = scanner.nextByte();
        } while (dd < 1 || dd > 31);

        // Generación de iniciales
        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = materno.toUpperCase().charAt(0);
        iniciales[2] = nombre.toUpperCase().charAt(0);
        
        // Manejo de año
        String aaStr = String.format("%02d", aa);
        iniciales[3] = aaStr.charAt(0);
        iniciales[4] = aaStr.charAt(1);
        
        // Manejo de mes
        String mmStr = String.format("%02d", mm);
        iniciales[5] = mmStr.charAt(0);
        iniciales[6] = mmStr.charAt(1);

        // Manejo de día
        String ddStr = String.format("%02d", dd);
        iniciales[7] = ddStr.charAt(0);
        iniciales[8] = ddStr.charAt(1);

        System.out.println("Comprobando datos:");
        System.out.println(nombre + " " + paterno + " " + materno);
        System.out.println("Iniciales:");
        Desplegar_arreglo(iniciales);

        // Verificación de año bisiesto
        int year = 2000 + aa; // Asumimos años de 2000 en adelante
        bisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (bisiesto) {
            System.out.println("El año es bisiesto");
            // Comparación de nacimiento en febrero con día no válido
            if (mm == 2 && dd > 29) {
                System.out.println("Naciste en febrero con un día no válido debido a un año bisiesto.");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }

    }

    

    public static void Desplegar_arreglo(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
