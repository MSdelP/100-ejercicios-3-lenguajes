// Crea en python un bucle que contenga los números del 10 al 20, dentro de ese bucle crea otro que repita la misma lista 10 veces.
// Imprime el resultado.

package e31;

public class e_34 {
    public static void main(String[] args) {
        // Bucle principal con los números del 10 al 20
        for (int numeroPrincipal = 10; numeroPrincipal <= 20; numeroPrincipal++) {
            // Lista del 10 al 20
            int[] listaNumeros = new int[11];
            for (int i = 0; i < listaNumeros.length; i++) {
                listaNumeros[i] = i + 10;
            }

            // Bucle interno que repite la lista 10 veces
            for (int j = 0; j < 10; j++) {
                // Imprime la lista
                imprimirLista(listaNumeros);
            }

            // Imprime el número principal
            System.out.println("Número principal: " + numeroPrincipal);
            System.out.println("=".repeat(20)); // Línea separadora
        }
    }

    // Método para imprimir la lista
    public static void imprimirLista(int[] lista) {
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

// Este código utiliza un bucle for para iterar a través de los números del 10
// al 20. Dentro de este bucle, hay otro bucle interno que crea la lista del 10
// al 20 y la imprime 10 veces. La impresión del número principal y la línea
// separadora se realiza una vez fuera del bucle interno
