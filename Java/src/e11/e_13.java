// Escribir en Java las instrucciones que permiten crear la lista L asignándole los valores [3, 2, 2, 1, 8, 1, 4, 7, 5, 1], 
// a continuación el programa debe calcular el número de apariciones del número 1 en la lista L.

package e11;

public class e_13 {
    public static void main(String[] args) {
        // Crear la lista L
        int[] L = { 3, 2, 2, 1, 8, 1, 4, 7, 5, 1 };

        // Inicializar una variable de conteo
        int aparicionesNumero1 = 0;

        // Iterar sobre el array y contar las apariciones del número 1
        for (int i = 0; i < L.length; i++) {
            if (L[i] == 1) {
                aparicionesNumero1++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número de apariciones del número 1 en la lista es: " + aparicionesNumero1);
    }
}

// En este código, el bucle for se utiliza para recorrer el array L, y por cada
// elemento, se verifica si es igual a 1. Si es así, se incrementa la variable
// aparicionesNumero1. Finalmente, se muestra el resultado usando
// System.out.println(). La salida esperada sería el número de veces que el
// valor 1 aparece en el array.
