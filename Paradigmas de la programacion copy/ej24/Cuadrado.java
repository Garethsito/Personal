public class Cuadrado {
    private double base;
    private double altura;
    private double A;
    private double P;


    public Cuadrado(){
        this.altura=0;
        this.base=0;
        this.A=0;
        this.P=0;
    }
    //base sera el radio
    public void area(){
        A = base*base;
    }
    //pi x diametro
    public void perimetro(){
        this.A=base*4;
    }

    public double getA() {
        return A;
    }


    public void setA(double a) {
        A = a;
    }


    public double getP() {
        return P;
    }


    public void setP(double p) {
        P = p;
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Cuadrado [Lado=" + base + ", A=" + A + ", P=" + P + "]";
    }
    
}
