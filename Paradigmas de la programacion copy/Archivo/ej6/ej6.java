public class ej6 {
    public static void main(String[] args) {
        int valor = 7;
        int numero;
        int oprt =3;
        boolean acerto = false;
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


        } while (!acerto && oprt>0);
        if (!acerto){//nunca atino al valor
            System.out.println("el valor era: " + valor);
        }
    }
}
