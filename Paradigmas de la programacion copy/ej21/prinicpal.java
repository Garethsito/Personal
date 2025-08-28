package ej21;

public class prinicpal {

    public static Runtime runtime = Runtime.getRuntime();
    public static void main(String[] args) {
        invertir(148);
    }

    public static int invertir(int n){
        int invert = 0;
        while(n>0){
            invert = invert * 10 + (n%10);
            n/=10;
        }
        System.out.println("en el metodo: " + (runtime.totalMemory()-runtime.freeMemory()));
        return invert;
    }

    public static int invertirRec(int n, int invert){
        if(n==0){
            System.out.println("El metodo recursivo" + (runtime.totalMemory()-runtime.freeMemory()));
            return invertirRec(n/10, invert * 10 + (n%10));
        }
        return 0;

    }
}

