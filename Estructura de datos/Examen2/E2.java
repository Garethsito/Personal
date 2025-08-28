package Examen2;

public class E2 {
    public static void main(String[] args) throws Exception {
        colas fila1 = new colas();
        colas fila2 = new colas();
        colas unifila = new colas(); // La cola unificada

        // Cargar los datos desde los archivos de texto a las colas
        fila1.cargarDatos("Examen2/fila1.txt");
        System.out.println("Fila 1:");
        fila1.mostrar();
        fila2.cargarDatos("Examen2/fila2.txt");
        System.out.println("Fila 2: ");
        fila2.mostrar();

        // Variables para almacenar las personas extraídas de cada fila
        nodo personaFila1 = fila1.extraer();
        nodo personaFila2 = fila2.extraer();

        // Mientras haya personas en cualquiera de las filas
        while (personaFila1 != null || personaFila2 != null) {
            if (personaFila1 != null && personaFila2 != null) {
                // Ambas personas existen, aplicamos la prioridad
                if (personaFila1.getEdad() >= 65 && personaFila2.getEdad() >= 65) {
                    // Ambas son de la tercera edad; prioridad para la fila 1
                    unifila.insertar(personaFila1.getElem(), personaFila1.getEdad());
                    personaFila1 = fila1.extraer();
                    unifila.insertar(personaFila2.getElem(), personaFila2.getEdad());
                    personaFila2 = fila2.extraer();
                } else if (personaFila1.getEdad() >= 65) {
                    // Solo la persona de fila 1 es de la tercera edad
                    unifila.insertar(personaFila1.getElem(), personaFila1.getEdad());
                    personaFila1 = fila1.extraer();
                    unifila.insertar(personaFila2.getElem(), personaFila2.getEdad());
                    personaFila2 = fila2.extraer();
                } else if (personaFila2.getEdad() >= 65) {
                    // Solo la persona de fila 2 es de la tercera edad
                    unifila.insertar(personaFila2.getElem(), personaFila2.getEdad());
                    personaFila2 = fila2.extraer();
                    unifila.insertar(personaFila1.getElem(), personaFila1.getEdad());
                    personaFila1 = fila1.extraer();
                } else {
                    // Ninguna es de la tercera edad, alternamos
                    unifila.insertar(personaFila1.getElem(), personaFila1.getEdad());
                    personaFila1 = fila1.extraer();
                    
                    unifila.insertar(personaFila2.getElem(), personaFila2.getEdad());
                    personaFila2 = fila2.extraer();
                }
            } else if (personaFila1 != null) {
                // Solo quedan personas en fila 1
                unifila.insertar(personaFila1.getElem(), personaFila1.getEdad());
                personaFila1 = fila1.extraer();
            } else if (personaFila2 != null) {
                // Solo quedan personas en fila 2
                unifila.insertar(personaFila2.getElem(), personaFila2.getEdad());
                personaFila2 = fila2.extraer();
            }
        }

        // Mostrar la fila unificada
        System.out.println("\nFila Unificada:");
        unifila.mostrar();
    }
}
