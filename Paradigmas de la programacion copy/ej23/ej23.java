package ej23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class ej23 {
    public static Scanner leer = new Scanner(System.in);
    public static int opcion;
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        persona vendedor = new persona();
        //persona profesor = new persona("roberto"," Estadistica");
        persona profesor = new persona("roberto");
        persona alumno = new persona("arturo", 1.78f, true);
        puesto secretaria = new puesto(2000, "asistente administrativo");
        puesto chofer = new puesto(3000, "conductor");
        // System.out.println(vendedor.toString());
        // System.out.println(profesor.toString());
        // System.out.println(alumno.toString());

        // empleado asistente1 = new empleado(1, 'v');
        // asistente1.setNombre("Oscar");
        // asistente1.setActivo(true);
        // asistente1.setActividad(secretaria);
        // System.out.println(asistente1.toString());

        // System.out.println("Lista de puestos: ");
        // System.out.println(secretaria.toString());
        // System.out.println(chofer.toString());

        String archivo = "puestos.txt";
        ArrayList<puesto> puestos = new ArrayList<>();
        ArrayList<empleado> empleados = new ArrayList<>();
        leerArchivo(archivo, puestos);
        empleado auxEmp;
        puesto auxPuesto;
        int salario, id, ult,num;
        char turno;
        String nombre;
        float estatura;
        int antiguedad;
        puesto aux;
        do{
            menu(); //menu hace un valor a opcion (variable global)
            switch (opcion) {
                case 1:// Alta de puestos
                    System.out.println("Nombre del puesto: ");
                    nombre = leer.nextLine();
                    System.out.println("Salario: ");
                    salario = Integer.parseInt(leer.nextLine());
                    ult = puestos.size();
                    id = puestos.get(ult-1).getNum() + 1;
                    aux = new puesto(id ,salario, nombre);
                    puestos.add(aux);
                    break;
                case 2:// Mostrar puestos
                    for (puesto puesto : puestos) {
                        System.out.println(puesto);
                    }
                    break;
                case 3:// Guardar puestos
                    guardarArchivo(archivo, puestos);
                    
                    break;
                case 4: //insertar empleados
                System.out.println("Nombre: ");
                nombre = leer.nextLine();
                System.out.println("Ingrese su estatura: ");
                estatura = Float.parseFloat(leer.nextLine());
                System.out.println("Antiguedad: ");
                antiguedad = Integer.parseInt(leer.nextLine());
                System.out.println("Turno M/V/N: ");
                turno = leer.nextLine().charAt(0);
                System.out.println("Numero de puesto: ");
                for (puesto puesto : puestos) {
                    System.out.println(puesto);
                }
                System.out.println("num puesto");
                num = Integer.parseInt(leer.nextLine());
                //en el arraylist num=-1 porque inicia en 0.
                auxPuesto = new puesto(puestos.get(num-1).getNum(),puestos.get(num-1).getSalario(),puestos.get(num-1).getNombre());
                //caclular el numero del empleado
                if(empleados.size()==0) id=1;
                else{
                ult = empleados.size();
                id = empleados.get(ult-1).getId() + 1;
                }
                auxEmp = new empleado();
                auxEmp.setId(id);
                auxEmp.setNombre(nombre);
                auxEmp.setEstatura(estatura);
                auxEmp.setActivo(true);
                auxEmp.setTurno(turno);
                auxEmp.setTiempo(antiguedad);
                auxEmp.setActividad(auxPuesto);
                empleados.add(auxEmp);
                // sacar del array list de puestos el numero que tecleo
                    break;
                case 5:
                    for (empleado empleado : empleados) {
                        System.out.println(empleado);
                    }
                    break;
                case 6:
                for (empleado empleado : empleados) {
                    System.out.println(empleado);
                }
                System.out.println("que numero de empleado quiere borrar?");
                id = Integer.parseInt(leer.nextLine());
                int borrar=0;
                for (int index = 0; index < empleados.size(); index++) {
                    if(id==empleados.get(index).getId()){
                        borrar=index;
                    }
                }
                empleados.remove(borrar);
                break;
                default:
                    break;
            }
        }while(opcion!=9);


    }

    public static void leerArchivo(String archivo, ArrayList<puesto> array) throws Exception{
        InputStream ins = new FileInputStream("ej23/puestos.txt");
        Scanner obj = new Scanner(ins);
        puesto aux;
        while(obj.hasNextLine()){
            String linea = obj.nextLine();
            String[] parts = linea.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];
            //System.out.println(part1 + " - " + part2 + " - " + part3);
            aux = new puesto(Integer.parseInt(part1),Integer.parseInt(part3), part2);
            array.add(aux);
        }
    }

    public static void menu(){
        System.out.println("Ejercicio 23 Empleados con objetos");
        System.out.println("1. Insertar puestos");
        System.out.println("2. Mostrar Puestos");
        System.out.println("3. Guardar puestos");
        System.out.println("4. Insertar Empleado");
        System.out.println("5. Mostrar Empleados");
        System.out.println("6. Dar de baja Empleado");
        System.out.println("7. Guardar Empleados");
        System.out.println("9. Salir");
        opcion = Integer.parseInt(leer.nextLine());

    }

    public static void guardarArchivo(String archivo, ArrayList<puesto> array) throws Exception{
        File file  = new File(archivo);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (puesto puesto : array) {
            writer.write(puesto.getNum() + ", " + puesto.getNombre() + ", " + puesto.getSalario() + "\n");
        }
        writer.close();
    }
}
