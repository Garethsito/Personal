package ej16;

import java.util.Scanner;
public class ej16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float m = 0; //masa corporal en kilogramos
        float h = 0; //altura
        float imc = 0; //indice de masa corporal
        short edad = 0; //
        char genero = ' '; 
        String status = "";

        System.out.println("ingrese su estatura: ");
        h = Float.parseFloat(leer.nextLine());
        System.out.println("ingrese su masa corporal: ");
        m = Float.parseFloat(leer.nextLine());
        imc = imcGral( m,h );
        edad = pedirEdad();
        genero = pedirGenero();
        status = tamblaIMC(imc, edad, genero);
        toString( m,h, imc, edad, genero);

        
    }//main

    //fotrmula general
    public static float imcGral(float m, float h){
        float imc = m / ( h*h );
        return imc;
    }
    //desplegar el imc
    public static void toString(float m, float h, float imc, short edad, char genero){
        System.out.println("Indice de masa corporal");
        System.out.println("Segun formula general imc = m / (h)^2");
        System.out.print("el imc es: ");
        System.out.printf("%.2f",imc);
        System.out.println("");
        System.out.println();

    }

    public static short pedirEdad(){
        Scanner leer = new Scanner(System.in);
        String dato;
        short valor=0;
        boolean valido;
        do{
            valido = true;
            System.out.println("edad: ");
            dato = leer.nextLine();
            for (int i = 0; i < dato.length(); i++) 
                if (!Character.isDigit(dato.charAt(i))) valido = false;             
            
            if (valido) valor = Short.parseShort(dato);
            
        }while(valor < 0 || valor > 120 || !valido);
        return valor;
    }

    public static char pedirGenero(){
        Scanner leer = new Scanner(System.in);
        String dato;
        char genero= ' ';

        do{
            genero = ' ';
            System.out.println("Genero? M/H: ");
            dato = leer.nextLine();
            if (dato.length()>0){
                genero = dato.toUpperCase().charAt(0);
            }

        }while(genero!='M' && genero!='H');
        return genero;
    }

    public static void tamblaIMC(float imc, short edad, char genero){
        String status = "";
        if (genero == 'M'){
            if (edad<=19){
                if (imc>32) status = "obesidad";
                else if (imc>27) status = "sobrepeso";
                else if (imc>22) status = "normal";
                else if (imc>17) status = "buena";
                else if (imc==17)status = "excelente";
                else status = "En peligro";
            }
            else if (edad>=20 && edad<=29){
                if (imc>33) status = "obesidad";
                else if (imc>28) status = "sobrepeso";
                else if (imc>23) status = "normal";
                else if (imc>18) status = "buena";
                else if (imc==18)status = "excelente";
                else status = "En peligro";
            }
            else if (edad>=30 && edad<=39){
                if (imc>34) status = "obesidad";
                else if (imc>29) status = "sobrepeso";
                else if (imc>24) status = "normal";
                else if (imc>19) status = "buena";
                else if (imc==19)status = "excelente";
                else status = "En peligro";
            }
            else if (edad>=40 && edad<=49){
                if (imc>35) status = "obesidad";
                else if (imc>30) status = "sobrepeso";
                else if (imc>25) status = "normal";
                else if (imc>20) status = "buena";
                else if (imc==20)status = "excelente";
                else status = "En peligro";
            }
            else if (edad>=50){
                if (imc>36) status = "obesidad";
                else if (imc>31) status = "sobrepeso";
                else if (imc>26) status = "normal";
                else if (imc>21) status = "buena";
                else if (imc==21)status = "excelente";
                else status = "En peligro";
            }
            
        }
        //operadores terniarios
        else if (genero == 'H'){
            if (edad<=19){
                status = imc >27 ? "obesidad": (imc>22?"sobrepeso":(imc>17?"normal":(imc>12?"buena":(imc==12?"excelente":"en peligro"))));
            }
            else if (edad>=20 && edad<=29){
                status = imc >28? "obesidad": (imc>23?"sobrepeso":(imc>18?"normal":(imc>13?"buena":(imc==13?"excelente":"en peligro"))));
            }
            else if (edad>=30 && edad<=39){
                status = imc >29? "obesidad": (imc>24?"sobrepeso":(imc>19?"normal":(imc>14?"buena":(imc==14?"excelente":"en peligro"))));
            }
            else if (edad>=40 && edad<=49){
                status = imc >30? "obesidad": (imc>25?"sobrepeso":(imc>20?"normal":(imc>15?"buena":(imc==15?"excelente":"en peligro"))));
            }
            else{
                status = imc >31? "obesidad": (imc>26?"sobrepeso":(imc>21?"normal":(imc>16?"buena":(imc==16?"excelente":"en peligro"))));
            }
        }

    }
}//principal
