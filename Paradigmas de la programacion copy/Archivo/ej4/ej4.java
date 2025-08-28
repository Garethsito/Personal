import java.util.Scanner;

public class ej4 {
    public static void main(String[] args){
        @SuppressWarnings("resource")//no se que hace
        Scanner leer = new Scanner(System.in);
        int dinero;
        int opcion;
        int sobra;
        System.out.println("cuanto dinero tienes: ");

        dinero = Integer.parseInt(leer.nextLine());
        System.out.println("tu saldo es $" + dinero);
        opcion=Integer.parseInt(leer.nextLine());

        while(dinero>10 && opcion!=9){
            menu();
            System.out.println("que desea?: ");
            opcion=Integer.parseInt(leer.nextLine());
            switch (opcion) {
                case 1 -> {
                    sobra=dinero-10;
                    System.out.println("te resta: " + sobra);
                }
            } 
        }
        System.out.println("saldo final" + dinero);
    }

    

    public static void menu(){
        System.out.println("1. mazapan $10");
        System.out.println("2. chocolate $15");
        System.out.println("3. gomitas $20");
        System.out.println("9. exit");
    }

}
