public class Alumno {
    // 1. Atributos
    String nombre;
    double[] calificaciones = new double[5];

    // Constructor
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // 4a. Método para calcular el promedio
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    // 4b. Método para obtener la calificación final
    public static char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // 4c. Método para imprimir resultados
    public static void imprimirResultados(String nombre, double[] calificaciones, double promedio, char calificacion) {

        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método main (para ejecutar el programa)
    public static void main(String[] args) {

        // Datos de ejemplo
        String nombre = "Juan Pérez";
        double[] calificaciones = {85, 90, 78, 88, 92};

        // Crear objeto
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Calcular promedio
        double promedio = calcularPromedio(calificaciones);

        // Obtener calificación
        char calificacionFinal = obtenerCalificacion(promedio);

        // Imprimir resultados
        imprimirResultados(nombre, calificaciones, promedio, calificacionFinal);
    }
}
