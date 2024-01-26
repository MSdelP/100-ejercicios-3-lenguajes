package e31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e_36 {
    public static void main(String[] args) {
        // Crear la lista original
        List<Double> L = Arrays.asList(-4.2, 2.3, 8.0, -2.0, 6.8);

        // Crear la nueva lista L1 mediante un bucle
        List<Double> L1 = new ArrayList<>();
        for (double x : L) {
            if (x > 0) {
                L1.add(x);
            }
        }

        // Imprimir la lista L1
        System.out.println("Lista L1: " + L1);
    }
}

// En este ejemplo, Arrays.asList se utiliza para crear una lista original L y
// un bucle for-each se utiliza para recorrer la lista original y agregar cada
// número positivo o mayor que 0 a la nueva lista L1. La nueva lista L1 se
// imprime al final del programa. Ten en cuenta que este ejemplo asume que los
// números son de tipo double, pero puedes ajustarlo según tus necesidades
// específicas.