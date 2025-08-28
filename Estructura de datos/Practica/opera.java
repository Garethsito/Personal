package Practica;

public class opera {
    public static int suma(int a, int b){
        int resultado;
        resultado = a+b;
        return resultado;
    }
    
    public static int resta(int a, int b){
        int r;
        r = a - b;
        return r;
    }

    public static int mul(int a, int b){
    int r = a * b;
    return r;
    }

    public static int div(int a, int b){
        if(b==0){
            System.out.println(" no se puede dividir entre cero");
        }
        int r = a/b;
        return r;
    }
}
