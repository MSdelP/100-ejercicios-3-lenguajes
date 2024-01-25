import java.util.Scanner;

public class e_04 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su peso en kilogramos
        System.out.print("Por favor, introduce tu peso en kilogramos: ");
        double pesoKg = scanner.nextDouble();

        // Mostrar el peso por consola
        System.out.println("Tu peso es: " + pesoKg + " kilogramos");

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }

}
