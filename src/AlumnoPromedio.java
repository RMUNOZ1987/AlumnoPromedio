import java.util.Scanner;
public class AlumnoPromedio {

    // Atributos
    String nombre;
    double[] calificaciones = new double[5];

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            suma = suma + calificaciones[i];
        }

        double promedio = suma / 5;
        return promedio;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacion(double promedio) {

        char letra;

        if (promedio <= 50) {
            letra = 'F';
        } else if (promedio <= 60) {
            letra = 'E';
        } else if (promedio <= 70) {
            letra = 'D';
        } else if (promedio <= 80) {
            letra = 'C';
        } else if (promedio <= 90) {
            letra = 'B';
        } else {
            letra = 'A';
        }

        return letra;
    }

    // Método para imprimir resultados
    public void imprimirResultados(double promedio, char calificacion) {

        System.out.println("\nNombre del estudiante: " + nombre);

        for (int i = 0; i < 5; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        AlumnoPromedio alumno = new AlumnoPromedio();

        // Pedir nombre
        System.out.print("Ingresa el nombre del alumno: ");
        alumno.nombre = entrada.nextLine();

        // Pedir calificaciones
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            alumno.calificaciones[i] = entrada.nextDouble();
        }

        // Calcular promedio
        double promedio = alumno.calcularPromedio();

        // Obtener calificación final
        char letra = alumno.obtenerCalificacion(promedio);

        // Mostrar resultados
        alumno.imprimirResultados(promedio, letra);
    }
}