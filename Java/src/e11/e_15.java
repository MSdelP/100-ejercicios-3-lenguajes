package e11;

import java.util.ArrayList;
import java.util.List;

public class e_15 {
    public static void main(String[] args) {
        // Crear la lista L asignándole los valores [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        List<Integer> L = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            L.add(i);
        }

        // Crear una nueva lista L1 que recupera un elemento de cada tres en la lista L
        List<Integer> L1 = new ArrayList<>();
        for (int i = 0; i < L.size(); i += 3) {
            L1.add(L.get(i));
        }

        // Mostrar la lista L1
        System.out.println("Lista L1: " + L1);
    }
}

// En este código, primero creamos la lista L con los valores del 1 al 10.
// Luego, utilizamos un bucle for para seleccionar un elemento de cada tres en
// la lista L y agregarlo a la nueva lista L1. Finalmente, mostramos la lista L1
// utilizando System.out.println(). La salida esperada sería la lista L1 con los
// elementos [1, 4, 7, 10].