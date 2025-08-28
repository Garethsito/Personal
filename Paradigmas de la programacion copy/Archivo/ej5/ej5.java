
public class ej5 {
    public static void main(String[] args) {
        int valor = 7;
        int numero =0;
        int oprt =3;

        do {
            System.out.println("tienes: " + oprt + " oportunidades ");
            oprt--; 
            numero =(int)(Math.random()*50+0);
            System.out.println("el numero es: " + numero);


            if(numero<valor){
                System.out.println("te falto");
            }
            else if(numero>valor){
                System.out.println("te pasaste");
            }

        } while (numero!=valor && oprt>0);
        if (numero!=valor){
            System.out.println("el valor era: " + valor);
        }
    }
}
