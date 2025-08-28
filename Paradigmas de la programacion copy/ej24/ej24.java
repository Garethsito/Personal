import java.util.Scanner;
public class ej24{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //sobrecargas
        Articulo juguete = new Articulo();
        juguete.valida(500);
        juguete.valida("rompecabezas",0);

        System.out.println(juguete.toString());

        juguete.valida(1200);
        juguete.valida("legos", 0);

        System.out.println(juguete.toString());

        Circulo balon = new Circulo();
        System.out.println(balon.toString());
        balon.setBase(10);
        balon.area();
        balon.perimetro();
        System.out.println(balon.toString());
        Cuadrado mesa =  new Cuadrado();
        System.out.println(mesa.toString());
        mesa.setBase(5);
        mesa.area();
        mesa.perimetro();
        System.out.println(mesa.toString());

        
    }
}