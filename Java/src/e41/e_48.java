package e41;

import java.util.List;

public class e_48 {
    public static int longitud(List<?> L) {
        return L.size();
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Object> listaMixta = List.of(1, 2, "tres", 4.5, List.of(5, 6, 7), "ocho", true);
        int resultado = longitud(listaMixta);
        System.out.println("La longitud de la lista es: " + resultado);
    }
}

// En este ejemplo, listaMixta es una lista que contiene varios tipos de datos.
// La función longitud toma una lista de tipo genérico List<?> como parámetro y
// utiliza el método size() para obtener la longitud de la lista. Puedes probar
// la función con diferentes listas para obtener el número de elementos.