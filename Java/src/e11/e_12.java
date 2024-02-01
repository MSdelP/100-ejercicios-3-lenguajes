// Escribir las instrucciones en Java que permiten crear la lista L asignándole los valores [6, 8, 3, 4, 1, 12, 2, 9, 2], 
// y luego ordenar los números de la lista en orden creciente. El programa de mostrar la lista L después de haber ordenado los números.

package e11;

import java.util.Arrays;

public class e_12 {
    public static void main(String[] args) {
        // Crear la lista L
        int[] L = { 6, 8, 3, 4, 1, 12, 2, 9, 2 };

        // Ordenar la lista en orden creciente
        Arrays.sort(L);

        // Mostrar la lista después de ordenar
        System.out.print("Lista después de ordenar: ");
        for (int i = 0; i < L.length; i++) {
            System.out.print(L[i] + " ");
        }
    }
}

// En este ejemplo, utilizamos el método sort de la clase Arrays para ordenar el
// array L. Después, recorremos el array para imprimir cada elemento después de
// ordenar. La salida esperada sería: "Lista después de ordenar: 1 2 2 3 4 6 8 9
// 12".
