// Escribe en python un programa para preguntar al usuario por su dni y comprobar si este es válido.
// Imprime si es válido o no.
// Reglas para saber la letra del dni: Toma el número del DNI y divídelo por 23. El resultado de esta división será el cociente y el resto.
// La letra del DNI se determina según el resto obtenido en el paso anterior. Tabla de letras:
// Resto   Letra
// -----   -----
//   0     T
//   1     R
//   2     W
//   3     A
//   4     G
//   5     M
//   6     Y
//   7     F
//   8     P
//   9     D
//  10     X
//  11     B
//  12     N
//  13     J
//  14     Z
//  15     S
//  16     Q
//  17     V
//  18     H
//  19     L
//  20     C
//  21     K
//  22     E

package e31;

import java.util.Scanner;

public class e_40 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese su DNI
        System.out.print("Ingresa tu DNI (sin espacios ni guiones): ");
        String dniUsuario = scanner.nextLine();

        // Valida el DNI y muestra el resultado
        if (validarDNI(dniUsuario)) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }

        // Cierra el objeto Scanner
        scanner.close();
    }

    // Función para calcular la letra del DNI
    public static char calcularLetraDNI(int numeroDNI) {
        String tablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroDNI % 23;
        return tablaLetras.charAt(resto);
    }

    // Función para validar el DNI
    public static boolean validarDNI(String dni) {
        try {
            // Intenta convertir la entrada a un número
            int numeroDNI = Integer.parseInt(dni.substring(0, dni.length() - 1));
            char letraUsuario = dni.charAt(dni.length() - 1);

            // Calcula la letra esperada
            char letraEsperada = calcularLetraDNI(numeroDNI);

            // Comprueba si la letra ingresada es válida
            return letraUsuario == letraEsperada;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

// Este programa utiliza la clase Scanner para solicitar al usuario que ingrese
// su DNI. Luego, utiliza las funciones calcularLetraDNI y validarDNI para
// calcular la letra esperada y verificar si la letra ingresada por el usuario
// es válida. Muestra un mensaje en la consola indicando si el DNI es válido o
// no. Ten en cuenta que este código asume que el usuario ingresará un DNI
// válido y no incluye una verificación exhaustiva de todas las posibles
// entradas incorrectas.