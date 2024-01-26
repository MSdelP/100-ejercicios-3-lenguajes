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