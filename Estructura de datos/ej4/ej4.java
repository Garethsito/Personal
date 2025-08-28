public class ej4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        //probar clases externas, probar los moldes
        int variable = 24;
        nodo caja =new nodo();
        //caja.mascota="firulais";
        caja.setMascota("firulais");
        System.out.println(caja.getMascota());
        System.out.println(caja.getnext());
        nodo cajota = new nodo();
        cajota.setMascota("oso panda");
        caja.setnext(cajota);
        System.out.println(cajota.getMascota());
        System.out.println(cajota.getnext());
        System.out.println(caja.getnext());
        System.out.println(cajota);
    }

}
