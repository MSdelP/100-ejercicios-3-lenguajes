import java.util.Scanner;

public class e_07 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su edad
        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();

        // Verificar si el usuario es mayor o menor de 18 años
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
