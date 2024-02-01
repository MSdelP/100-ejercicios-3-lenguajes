// Escribre un programa en Java que permita ordenar una lista de tuplas L en orden ascendente, basándose en el sengundo elemento de la tupla
// L=[("Piña", 4), ("Granada", 2), ("Sandía", 7), ("Pera", 14), ("Aguacate", 8)]

package e11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class e_18 {
    public static void main(String[] args) {
        // Lista de tuplas
        List<Pair<String, Integer>> L = new ArrayList<>();
        L.add(new Pair<>("Piña", 4));
        L.add(new Pair<>("Granada", 2));
        L.add(new Pair<>("Sandía", 7));
        L.add(new Pair<>("Pera", 14));
        L.add(new Pair<>("Aguacate", 8));

        // Ordenar la lista de tuplas en orden ascendente basándose en el segundo
        // elemento
        Collections.sort(L, Comparator.comparing(Pair::getSecond));

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada: " + L);
    }

    // Clase Pair para representar una tupla
    static class Pair<T, U> {
        private final T first;
        private final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}

// En este código, se utiliza la interfaz Comparator junto con el método
// comparing para especificar la comparación basada en el segundo elemento de
// las tuplas. La clase Pair se utiliza para representar las tuplas. La salida
// esperada sería la lista L ordenada por el segundo elemento de cada tupla.