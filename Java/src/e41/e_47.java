package e41;

import java.util.Collections;
import java.util.List;

public class e_47 {
    public static Integer minimo(List<Integer> L) {
        if (L.isEmpty()) {
            // Manejar el caso de una lista vacía
            return null;
        }

        // Utilizar Collections.min para obtener el valor mínimo de la lista
        return Collections.min(L);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> listaNumeros = List.of(10, 5, 8, 15, 3);
        Integer resultado = minimo(listaNumeros);
        System.out.println(resultado);
    }

}

// En este ejemplo, la función minimo utiliza la función Collections.min de Java
// para encontrar el valor mínimo en la lista de enteros proporcionada. Si la
// lista está vacía, la función devuelve null. Puedes probar la función con
// diferentes listas de enteros para encontrar el valor mínimo.