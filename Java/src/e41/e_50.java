package e41;

import java.util.List;

public class e_50 {
    public static Double mediaLista(List<Integer> L) {
        if (L.isEmpty()) {
            // Manejar el caso de una lista vacía
            return null;
        }

        // Calcular la suma de los elementos en la lista
        double suma = 0;
        for (int num : L) {
            suma += num;
        }

        // Calcular la media dividiendo la suma entre el número de elementos
        double media = suma / L.size();

        return media;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> lista_enteros = List.of(1, 2, 3, 4, 5);
        Double resultado = mediaLista(lista_enteros);
        System.out.println("La media de la lista es: " + resultado);
    }
}

// En este ejemplo, la función mediaLista toma una lista de enteros como
// parámetro y utiliza un bucle for para calcular la suma de todos los elementos
// en la lista. Luego, divide esta suma por el número de elementos en la lista
// para obtener la media. Si la lista está vacía, la función devuelve null.
// Puedes probar la función con diferentes listas de enteros para obtener la
// media correspondiente.