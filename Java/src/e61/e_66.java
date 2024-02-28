package e61;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e_66 {
    public static List<Integer> unionLista(List<Integer> L1, List<Integer> L2, List<Integer> L3) {
        // Combinar todas las listas en un conjunto para eliminar duplicados
        Set<Integer> conjunto = new HashSet<>();
        conjunto.addAll(L1);
        conjunto.addAll(L2);
        conjunto.addAll(L3);

        // Convertir el conjunto en una lista para ordenarla
        List<Integer> union = new ArrayList<>(conjunto);
        // Ordenar la lista resultante en orden ascendente
        union.sort(null);

        return union;
    }

    public static void main(String[] args) {
        List<Integer> L1 = List.of(1, 3, 5, 7, 9);
        List<Integer> L2 = List.of(2, 4, 6, 8, 10);
        List<Integer> L3 = List.of(1, 2, 3, 4, 5);

        List<Integer> resultado = unionLista(L1, L2, L3);
        System.out.println(resultado);
    }
}

// Esta función combina todas las listas en un HashSet para eliminar duplicados,
// luego convierte el HashSet en una ArrayList para poder ordenarla. Finalmente,
// la lista resultante se ordena en orden ascendente utilizando el método
// sort().
// La función main muestra un ejemplo de uso de la función unionLista.