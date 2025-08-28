package repaso;

import java.util.Scanner;
public class repa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola mundo!");
        //variables
        int edad;
        String pais, nacionalidad;
        String CP;
        String dato;
        boolean correcto = false;
        float[] costo={30,120,70,60};
        float dolares=0;
        //pedir datos
        do{
        System.out.println("edad: ");
        edad = leer.nextInt();
        leer.nextLine();
        //valido los datos
        } while (edad<0 || edad>120);
        if (edad<18) System.out.println(" es menor de edad");
        else{
            if (edad>=18 && edad<=30){
                System.out.println("es adulto joven");
            }
            else if (edad>30 && edad<60) System.out.println("adulto maduro");
            else System.out.println("es de la tercera edad");
        }
        //pido el pais
        do{
            System.out.println("Nacionalidad MEX-Mexicano USA-Estadounidense CHI-Chino KOR- Koreano");
            pais=leer.nextLine();
            pais=pais.toUpperCase();
        }while(pais.length()==0 || pais.length()>3);

        //pido cuanto dinero tiene
        System.out.println("Calcularemos para cuantas visas de alcanzan");
        System.out.println("cuantos dolares tienes?");
        dolares = Float.parseFloat(leer.nextLine());

        switch(pais){
            case "MEX" : pais = "Mexico"; break;
            case "USA" : pais = "Estados Unidos"; break;
            case "CHI" : pais = "China"; break;
            case "KOR" : pais = "Corea"; break;
            default: System.out.println("pais no valido");
                break;
        }
        //== no funciona para comparar, usar.equals
        if (pais.equals("MEX")){
            System.out.println("es mexicano");
            for (int i = 0; i <=3; i++){
                if(dolares>=costo[i]){
                    System.out.println("Visa de mexico");
                    dolares =  dolares - costo[i];
                }
            }
            if(dolares>=costo[1]){
                System.out.println("Visa de estados unidos");
                dolares =  dolares - costo[1];
            }
            if(dolares>=costo[2]){
                System.out.println("Visa de china");
                dolares =  dolares - costo[2];
            }
            if(dolares>=costo[3]){
                System.out.println("Visa de korea");
                dolares =  dolares - costo[3];
            }
        }

    }
    //preguntar nacionalidad


}
