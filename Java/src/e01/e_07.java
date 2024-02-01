// Escribir un progrograma en Java que solicite al usuario su edad y la almacena en una variable. 
// El programa debe verificar si el usuario tiene una edad mayor o menor a 18 años. 
// Si la edad del usuario es igual o mayor que 18 el programa imprime "Eres mayor de edad", de lo contrario debe imprimir "Eres menor de edad".

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
