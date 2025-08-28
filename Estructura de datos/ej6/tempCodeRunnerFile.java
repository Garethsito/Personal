    public static void main (String[] args){
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        lista grupo = new lista();
        String nombre;
        int opc=0;
        String colado;
        LocalDateTime fechaHoraActual;
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            switch(opc){
                case 1:
                    System.out.println("insertar nombre");
                    nombre = leer.nextLine();
                    grupo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Lista del grupo");
                    if(grupo.vacia()==true){
                        System.out.println("La lista está vacia");
                        break;
                    }
                    else grupo.mostrar();
                    break;
                case 3:
                if (grupo.vacia()==true){
                    System.out.println("La lista está vacia");
                }
                else{
                System.out.println("Nombre para borrar: ");
                nombre = leer.nextLine();
                grupo.borrar(nombre);
                }                    
                    break;
            }
    
        }while( opc!=9);
    }//fin del main