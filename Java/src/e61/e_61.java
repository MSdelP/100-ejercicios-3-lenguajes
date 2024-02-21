package e61;

import java.util.ArrayList;
import java.util.List;

public class e_61 {
    public static List<Integer> posicionEltLista(List<Integer> L, int x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) == x) {
                indices.add(i);
            }
        }
        if (!indices.isEmpty()) {
            return indices;
        } else {
            System.out.println("El elemento " + x + " no está en la lista " + L);
            return new ArrayList<>();
        }
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
        int elemento = 2;
        List<Integer> indices = posicionEltLista(lista, elemento);
        if (!indices.isEmpty()) {
            System.out.println("El elemento " + elemento + " se encuentra en los índices: " + indices);
        }
    }
}

// Esta función recorre la lista L y verifica si el elemento en cada posición es
// igual a x. Si es así, agrega el índice a la lista indices. Si no se encuentra
// ningún índice, se imprime un mensaje indicando que el elemento no está en la
// lista y se devuelve una lista vacía. La función main muestra un ejemplo de
// uso de la función posicionEltLista.