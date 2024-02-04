// Escribe un programa en Java que muestre la tabla de multiplicar de 7:

package e21;

public class e_24 {
    public static void main(String[] args) {
        // Número para la tabla de multiplicar
        int numero = 8;

        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Imprimir la tabla de multiplicar del 8
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

// Este programa utiliza un bucle for para iterar desde 1 hasta 10 (inclusive) y
// calcula el resultado de multiplicar el número 8 por cada valor del bucle.
// Luego, imprime cada línea de la tabla de multiplicar del 8.