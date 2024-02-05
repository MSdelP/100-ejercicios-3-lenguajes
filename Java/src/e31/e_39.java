// Escribe en Java un programa que calcule la suma de los dígitos de un número, imprime el resultado.

package e31;

import java.util.Scanner;

public class e_39 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numeroUsuario = scanner.nextInt();

        // Calcula la suma de los dígitos utilizando la función
        int resultado = sumaDigitos(numeroUsuario);

        // Imprime el resultado
        System.out.println("La suma de los dígitos de " + numeroUsuario + " es: " + resultado);

        // Cierra el objeto Scanner
        scanner.close();
    }

    // Función para calcular la suma de los dígitos
    public static int sumaDigitos(int numero) {
        // Inicializa la variable para almacenar la suma
        int suma = 0;

        // Convierte el número a su representación como cadena de caracteres
        String strNumero = Integer.toString(numero);

        // Itera sobre cada dígito y suma su valor convertido a entero
        for (int i = 0; i < strNumero.length(); i++) {
            suma += Character.getNumericValue(strNumero.charAt(i));
        }

        return suma;
    }
}

// Este programa utiliza la clase Scanner para solicitar al usuario que ingrese
// un número. Luego, utiliza una función llamada sumaDigitos para calcular la
// suma de los dígitos del número ingresado y finalmente imprime el resultado.
// La función Integer.toString se utiliza para convertir el número a su
// representación como cadena de caracteres, y Character.getNumericValue se
// utiliza para obtener el valor numérico de cada dígito.