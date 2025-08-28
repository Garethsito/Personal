package ej9;

import java.util.Scanner;
//corregir
public class ej9 {
    public static void main(String[] args) {
        //menu
        Scanner leer = new Scanner(System.in);
        int dd, mm, aa;
        String dia="";
        System.out.println("Repaso ciclo y condiciones");
        System.out.println("Escriba en dos digitos");
        System.out.println("Fecha de nacimiento");
        System.out.println("Dia: ");
        dd= Integer.parseInt(leer.nextLine());
        //validacion del dia
        do{
            System.out.println("mes: ");
            mm= leer.nextInt();
        }while(mm<1 || mm>12);
        System.out.println("Anio: ");
        aa= leer.nextInt();
        //asignacion del dia
        System.out.println("naciste el: " +nombreDia(dd)+" de "+ nombreMes(mm) + " del "+ nombreAnio(aa));

        // o



    }

    public static String nombreMes(int numero){
        String mes = "";
        switch(numero){
            case 1: mes = "enero"; break;
            case 2: mes = "febrero"; break;
            case 3: mes = "marzo"; break;
            case 4: mes = "abril"; break;
            case 5: mes = "mayo"; break;
            case 6: mes = "junio"; break;
            case 7: mes = "julio"; break;
            case 8: mes = "agosto"; break;
            case 9: mes = "septiembre"; break;
            case 10: mes = "octubre"; break;
            case 11: mes = "noviembre"; break;
            case 12: mes = "diciembre"; break;
        }
        return mes;

        
    }

    public static String nombreDia(int numero){
        String dia = "";
        int decenas = numero/10;
        int  unidades = numero % 10;
        if (numero<=15 && numero>=10){      
            switch(numero){
                case 10: dia = "diez"; break;
                case 11: dia = "once"; break;
                case 12: dia = "doce"; break;
                case 13: dia = "trece"; break;
                case 14: dia = "catorce"; break;
                case 15: dia = "quince"; break;
            }
        }
        else{
            switch (decenas) {
                case 1: dia = "dieci"; break;
                case 2: dia = "veinti"; break;
                case 3: dia = "treintai"; break;
                default:
                    throw new AssertionError();
            }

            switch (unidades) {
                case 1: dia = dia + "uno"; break;
                case 2: dia = dia + "dos"; break;
                case 3: dia = dia + "tres"; break;
                case 4: dia = dia + "cuatro"; break;
                case 5: dia = dia + "cicno"; break;
                case 6: dia = dia + "seis"; break;   
                case 7: dia = dia + "siete"; break;
                case 8: dia = dia + "ocho"; break;
                case 9: dia = dia + "nueve"; break;         

            }
        }
        return dia;
    }
    public static String nombreAnio(int numero){
        String anio = "";
        int decenas = numero/10;
        int  unidades = numero % 10;
        if(numero>25){
            switch (decenas) {
                case 2: anio= "mil novecientos veinti"; break;
                case 3: anio= "mil novecientos treintai"; break;
                case 4: anio= "mil novecientos cuarentai"; break;
                case 5: anio= "mil novecientos cinquientai"; break;
                case 6: anio= "mil novecientos sesentai"; break;
                case 7: anio= "mil novecientos setentai"; break;
                case 8: anio= "mil novecientos ochentai"; break;
                case 9: anio= "mil novecientos noventai"; break;
            }
            switch (unidades) {
                case 1: anio = anio + "uno"; break;
                case 2: anio = anio + "dos"; break;
                case 3: anio = anio + "tres"; break;
                case 4: anio = anio + "cuatro"; break;
                case 5: anio = anio + "cicno"; break;
                case 6: anio = anio + "seis"; break;   
                case 7: anio = anio + "siete"; break;
                case 8: anio = anio + "ocho"; break;
                case 9: anio = anio + "nueve"; break;         

            }

            
        }
        else{
            if (numero<=15 && numero>=10){      
                switch(numero){
                    case 10: anio = "dos mil diez"; break;
                    case 11: anio = "dos mil once"; break;
                    case 12: anio = "ddos mil oce"; break;
                    case 13: anio = "dos mil trece"; break;
                    case 14: anio = "dos mil catorce"; break;
                    case 15: anio = "dos mil quince"; break;
                }
            }
            else{
                switch (decenas) {
                    case 1: anio = "dos mil dieci"; break;
                    case 2: anio = "dos mil veinti"; break;
                    default:
                        throw new AssertionError();
                }
            }
            switch (unidades) {
                case 1: anio = anio + "uno"; break;
                case 2: anio = anio + "dos"; break;
                case 3: anio = anio + "tres"; break;
                case 4: anio = anio + "cuatro"; break;
                case 5: anio = anio + "cicno"; break;
                case 6: anio = anio + "seis"; break;   
                case 7: anio = anio + "siete"; break;
                case 8: anio = anio + "ocho"; break;
                case 9: anio = anio + "nueve"; break;         

            }
            
        }
        return anio;

    }
}
