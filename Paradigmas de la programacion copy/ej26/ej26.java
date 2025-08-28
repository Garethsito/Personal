//Ejercicio 26 funciones lambda

public class ej26{
    public static void main(String[] args){
        // 1 declarar la interface y usar interface

        //coidgo dentro de las llaves sustituye al metodo abstracto
        MyInterface lambda1 = () -> {System.out.println("Probar Lambda 1");};

        lambda1.saludo();

        // funcion lambda con mas lineas de codigo
        MyInterface lambda2 = () ->{
            System.out.println("Primer encuentro con prog Funcional");
            System.out.println("probando funciones Lambda");
            System.out.println("suma 2+3 = " + (2+3));

        };

        lambda2.saludo();

        //cuando tienees una funcion lambda solo con una instruccion
        //puedees omitir las llaves
        lambda1 = () -> System.out.println("otro mensaje");
        lambda1.saludo();

        //3 usar lambda con parametros
        // MyInterface2 lambda3 = (nombre) -> {System.out.println(nombre + " aprendiendo funciones lambda");};
        // lambda3.prueba("oscar");
        //
        MyInterface2 lambda4 = (nombre) -> nombre + "aprendiendo lambda";
        System.out.println(lambda4.prueba2("oscar"));

        //4 clases y funciones anonimas
        new asistencia() {
            private int presente;
            public void asiste(){
                System.out.println("el aulumno asiste a clase");
            }
        }.asiste();

        //otra forma de hacer las clases anonimas
        Usuario persona = new Usuario(){
            public void crearUsuario(){
                System.out.println("creando usuario");
            }
            public void borrarUsuario(){
                System.out.println("borrando usuario");
            }
        };
        persona.borrarUsuario();
        persona.crearUsuario();

        persona = new Usuario(){
            public void crearUsuario(){
                System.out.println("creacion 2");
            }
            public void borrarUsuario(){
                System.out.println("borrando 2");
            }
        };


    }   
}