package e11;

import java.util.ArrayList;
import java.util.List;

public class e_11 {
    public static void main(String[] args) {
        // Crear una lista para almacenar los números pares
        List<Integer> numerosPares = new ArrayList<>();

        // Llenar la lista con números pares del 1 al 10
        for (int i = 2; i <= 10; i += 2) {
            numerosPares.add(i);
        }

        // Imprimir la lista
        System.out.println(numerosPares);
    }
}

// En Java, no hay una construcción directa equivalente a las comprensiones de
// listas en Python o las funciones de mapeo en JavaScript.
// Sin embargo, puedes utilizar un bucle para lograr el mismo resultado.
// En este ejemplo, se utiliza un bucle for para iterar desde 2 hasta 10 con un
// incremento de 2 en cada paso,
// se agregan los números pares a la lista numerosPares. Después, se imprime la
// lista.