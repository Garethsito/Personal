package ej8;

public class valida {
    public static boolean strVacio(String elem){
        if (elem.length()==0){
            return true;
        }
        else return false;
    }

    public static boolean soloLetras(String cadena){
        int ultimo=cadena.length()-1;
        if(cadena.charAt(0)==' ' || cadena.charAt(ultimo)==' '){
            System.out.println("no usar espacios en blanco");
            return false;
        }



        for (int index = 0; index < cadena.length(); index++){
            if(cadena.charAt(index)==' '){
                //????????
            }

            else{
                if (Character.isIdeographic(cadena.charAt(index))==false){
                    System.out.println("solo letras");
                    return false;//caracteres espceciales no se permiten
                }
            }
        }
        return true;// todo salio bien, solo hay letras
    }

    public static boolean positivo(int numero){
        if(numero<0){
            System.out.println("no usar numeros negativos");
            return false;
        }
        return true;
    }
}
