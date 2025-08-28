public class ej3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        //probar clases externas, probar los moldes
        Nodo caja = new Nodo();
        caja.mascota="firulais";
        System.out.println(caja.mascota);
        System.out.println(caja.siguiente);
        Nodo cajota = new Nodo();
        cajota.mascota = "oso panda";
        caja.siguiente = cajota;
        System.out.println(cajota.mascota);
        System.out.println(cajota.siguiente);
        System.out.println(caja.siguiente);
        System.out.println(cajota);
    }

}
