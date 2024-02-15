import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e_53 {
    public static int numValoresDicc(Map<String, List<Integer>> d) {
        int totalValores = 0;
        for (List<Integer> lista : d.values()) {
            totalValores += lista.size();
        }
        return totalValores;
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> diccionario = new HashMap<>();
        diccionario.put("clave1", List.of(1, 2, 3));
        diccionario.put("clave2", List.of(4, 5, 6, 7));
        diccionario.put("clave3", List.of(8, 9));

        System.out.println(numValoresDicc(diccionario)); // Devuelve 9 (1+2+3+4+5+6+7+8+9)
    }
}

// La función numValoresDicc() toma un diccionario donde las claves son de tipo
// String y los valores son listas de enteros (List<Integer>).
// Itera a través de los valores del diccionario usando el método values() de la
// clase Map.
// Para cada lista asociada a una clave, obtiene su tamaño utilizando el método
// size() y suma este valor al total de valores.
// Finalmente, retorna el total de valores encontrados en todas las listas
// asociadas a las claves del diccionario.