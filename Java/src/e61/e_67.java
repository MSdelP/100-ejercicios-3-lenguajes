// Escribe un función en JS calculoMCD(a,b) que tome como parámetros dos enteros que introduce el usuario, a y b. 
// Después calcula el máximo común divisor utilizando el algoritmo de Euclides.
// Nota: La división euclidiana de a por b se escribe de la siguiente manera:
// a = b*q + r   
// q representa el cociente y r es el resto de la división.

package e61;

import java.util.Scanner;

public class e_67 {
    public static int calculoMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los números enteros a y b
        System.out.print("Ingrese el primer número entero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int b = scanner.nextInt();

        // Calcular el MCD utilizando la función calculoMCD
        int mcd = calculoMCD(a, b);

        // Imprimir el resultado
        System.out.println("El máximo común divisor (MCD) de " + a + " y " + b + " es: " + mcd);

        scanner.close();
    }
}

// En este código, la función calculoMCD utiliza el algoritmo de Euclides para
// calcular el máximo común divisor (MCD) entre los números a y b.
// Luego, se solicita al usuario que ingrese dos números enteros utilizando un
// objeto Scanner, se calcula el MCD utilizando la función definida,
// y finalmente se imprime el resultado utilizando System.out.println().