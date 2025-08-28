public class t1 {
    //variables no estaticas porque tendran diferentes valores con diferentes instacias.
    String name;
    int age;
    //metodo estatico porque no depende de ninguna istancia.
    public static void main(String[] args) {
        t1 persona1 = new t1();
        t1 persona2 = new t1();

        persona1.setName("carlos");
        persona2.setName("pedro");
        persona1.setAge(25);
        persona2.setAge(30);

        System.out.println("nombre de persona 1: " + persona1.getName());
        System.out.println("edad de persona 1: " + persona1.getAge());
        System.out.println("nombre de persona 2: " + persona2.getName());
        System.out.println("edad de persona 2: " + persona2.getAge());
        
    }

    //solo establece el valor del atributo, no regresa ningun valor
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //regresa el valor de name, por lo tanto no se usa un void.
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
