public class ej7{
    public static void main(String[] args) {
        double valor1 = (int) (Math.random()*50 + 1);
        double iva = 0;
        //precio de 3 productos, cuando el valor sea entre 30 a 39,
        //cobrar un iva de 2%. precio sea mayor a 39, cobrar un 3% de iva.
        //iva = (valor1<30) ? valor1*0.01 : valor1*0.02;
        /*if(valor1>30 ){
            iva=valor1 * 0.01;
        }
        else if(valor1>39)
            iva=valor1 * 0.03;*/
        //precio menor a 30  sin iva, de 30 a 39 cobra 2% de iva, mayor a 39 iva3%
        iva= (valor1<39) ? valor1 * 0.03 : ((valor1>29) ? valor1*0.02 : 0);
        System.out.println("precion: "+valor1);
        System.out.println("IVA "+iva);
        System.out.println("total " + (valor1+iva));
        
    }
    
}