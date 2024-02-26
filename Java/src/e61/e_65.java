package e61;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e_65 {
    public static List<Map.Entry<Integer, Integer>> numOcurrencias(List<Integer> L) {
        Map<Integer, Integer> ocurrencias = new HashMap<>();
        // Contar ocurrencias de cada elemento en L
        for (int elemento : L) {
            ocurrencias.put(elemento, ocurrencias.getOrDefault(elemento, 0) + 1);
        }

        // Convertir el mapa de ocurrencias en una lista de entradas
        List<Map.Entry<Integer, Integer>> resultado = new ArrayList<>(ocurrencias.entrySet());
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(2);
        lista.add(5);
        lista.add(2);

        List<Map.Entry<Integer, Integer>> resultado = numOcurrencias(lista);
        for (Map.Entry<Integer, Integer> entrada : resultado) {
            System.out.println("Elemento: " + entrada.getKey() + ", Ocurrencias: " + entrada.getValue());
        }
    }
}

// Esta función utiliza un HashMap para contar las ocurrencias de cada elemento
// en la lista L. Luego, convierte este mapa de ocurrencias en una lista de
// entradas (Map.Entry) para poder manejarla más fácilmente. Finalmente,
// devuelve esta lista de entradas que contienen el elemento y su número de
// ocurrencias. La función main muestra un ejemplo de uso de la función
// numOcurrencias.
