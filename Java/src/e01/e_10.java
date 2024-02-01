// Escribir una instrucción que permite crear una lista de números del 1 al 10 utilizando una comprensión de lista en python. 
// (Se trata de imitar ese comportamiento en Java)

import java.util.ArrayList;
import java.util.List;

public class e_10 {
    public static void main(String[] args) {
        // Crear una lista para almacenar los números
        List<Integer> numeros = new ArrayList<>();

        // Llenar la lista con números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Imprimir la lista
        System.out.println(numeros);
    }
}

// En Java, no existe una construcción directa para comprensiones de listas como
// en Python o JavaScript.
// Sin embargo, puedes utilizar un bucle para lograr el mismo resultado.
// En este ejemplo, se utiliza un bucle for para iterar desde 1 hasta 10 e ir
// agregando cada número a la lista numeros. Después, se imprime la lista.