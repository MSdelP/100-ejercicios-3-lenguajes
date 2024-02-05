// Escribe un programa en Java que permita mezclar de manera aleatoria los elementos de una lista.
// L = [43, 22, 7, "Pepe", 2, "as", "Julián", 8]

package e31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class e_31 {
    public static void main(String[] args) {
        // Lista original
        List<Object> L = new ArrayList<>();
        L.add(43);
        L.add(22);
        L.add(7);
        L.add("Pepe");
        L.add(2);
        L.add("as");
        L.add("Julián");
        L.add(8);

        // Mezcla los elementos de la lista de manera aleatoria
        Collections.shuffle(L);

        // Imprime la lista mezclada
        System.out.println("Lista mezclada: " + L);
    }
}

// En Java, puedes utilizar la clase Collections junto con el método shuffle
// para mezclar de manera aleatoria los elementos de una lista.
// Este programa utiliza la clase Collections y su método shuffle para mezclar
// la lista L de manera aleatoria. Luego, imprime la lista resultante. Al
// ejecutar este código, obtendrás diferentes mezclas de la lista cada vez.