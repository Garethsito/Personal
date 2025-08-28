package ej22;

import java.util.Scanner;
public class ej22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        persona vendedor = new persona();
        //persona profesor = new persona("roberto"," Estadistica");
        persona profesor = new persona("roberto");
        persona alumno = new persona("arturo", 1.78f, true);
        puesto secretaria = new puesto(2000, "asistente administrativo");

        // System.out.println(vendedor.toString());
        // System.out.println(profesor.toString());
        // System.out.println(alumno.toString());

        empleado asistente1 = new empleado(1, 'v');
        asistente1.setNombre("Oscar");
        asistente1.setActivo(true);
        asistente1.setActividad(secretaria);
        System.out.println(asistente1.toString());
    }
}
