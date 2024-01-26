package e31;

import java.util.ArrayList;
import java.util.List;

public class e_35 {
    public static void main(String[] args) {
        // Lista original
        List<Integer> L = List.of(0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30);

        // Crear la nueva lista L1 mediante un bucle
        List<Double> L1 = new ArrayList<>();
        for (int x : L) {
            L1.add((double) x / 3);
        }

        // Imprimir la lista L1
        System.out.println("Lista L1: " + L1);
    }
}

// En Java, no existe una construcción directa equivalente a la comprensión de
// listas en Python o expresiones de mapeo en JavaScript. Sin embargo, puedes
// lograr el mismo resultado utilizando un bucle para recorrer la lista original
// y construir la nueva lista. En este ejemplo, se utiliza un bucle for-each
// para recorrer la lista original L, y cada elemento se divide por 3 y se
// agrega a la nueva lista L1. La nueva lista L1 es de tipo Double para manejar
// la división y la salida incluye decimales. Ten en cuenta que las listas en
// Java no admiten la sintaxis de la comprensión de listas directamente como en
// Python o JavaScript.