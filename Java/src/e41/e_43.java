package e41;

import java.util.Collections;
import java.util.List;

public class e_43 {
    public static Integer maximo(List<Integer> L) {
        if (L.isEmpty()) {
            // Manejar el caso de una lista vacía
            return null;
        } else {
            // Utilizar Collections.max para obtener el valor máximo de la lista
            return Collections.max(L);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> listaNumeros = List.of(10, 5, 8, 15, 3);
        Integer resultado = maximo(listaNumeros);
        System.out.println(resultado);
    }
}

// En este ejemplo, la función maximo toma una lista de enteros y utiliza
// Collections.max para encontrar el valor máximo.
// Si la lista está vacía, la función devuelve null. Puedes probar la función
// con diferentes listas de enteros para encontrar el valor máximo.