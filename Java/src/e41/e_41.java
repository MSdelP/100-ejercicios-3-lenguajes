package e41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e_41 {
    public static List<Integer> suprimirDuplicado(List<Integer> L) {
        // Convierte la lista a un conjunto para eliminar duplicados
        Set<Integer> conjuntoSinDuplicados = new HashSet<>(L);

        // Convierte el conjunto de nuevo a una lista y ordena los elementos
        List<Integer> listaSinDuplicadosOrdenada = new ArrayList<>(conjuntoSinDuplicados);
        listaSinDuplicadosOrdenada.sort(Integer::compareTo);

        return listaSinDuplicadosOrdenada;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        List<Integer> lista1 = List.of(4, 2, 8, 2, 6, 4, 8, 10);
        List<Integer> resultado1 = suprimirDuplicado(lista1);
        System.out.println("Resultado 1: " + resultado1);

        List<Integer> lista2 = List.of(4, 7, 4, 3, 2, 9);
        List<Integer> resultado2 = suprimirDuplicado(lista2);
        System.out.println("Resultado 2: " + resultado2);
    }
}

// Este código utiliza las clases HashSet y ArrayList para eliminar duplicados y
// ordenar los elementos. En el método suprimirDuplicado, se crea un HashSet a
// partir de la lista para eliminar duplicados, y luego se crea un ArrayList a
// partir del conjunto para preservar el orden de inserción y, finalmente, se
// ordena la lista. Los resultados se imprimen en la consola.