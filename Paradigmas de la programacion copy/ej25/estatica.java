public class estatica {

    //funcion pura
    public static boolean biciesto(int num){
        return num%4==0;

    }

    // no es funcion pura
    public static int aleatorio(int min, int max){
        int aux = (int) (Math.random()*(max-min+1) + min);
        System.out.println("valor generado" + aux);
        return aux;
    }

    //funcion altera el valor del num, por lo tanto es una funcion no pura
    public static int sigDecada(int num){
        int incremento = 10;
        num += incremento;
        return num;
    }
}
