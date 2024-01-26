package e21;

import java.util.ArrayList;
import java.util.List;

public class e_27 {
    public static void main(String[] args) {
        // Lista inicial
        List<Integer> lista = new ArrayList<>();
        lista.add(9);
        lista.add(8);
        lista.add(7);
        lista.add(6);
        lista.add(5);
        lista.add(4);

        // Número que queremos eliminar
        int numeroAEliminar = 7;

        // Verificar si el número está en la lista antes de intentar eliminarlo
        if (lista.contains(numeroAEliminar)) {
            lista.remove(Integer.valueOf(numeroAEliminar));
            System.out.println("Elemento " + numeroAEliminar + " eliminado.");
            System.out.println("Lista actualizada: " + lista);
        } else {
            System.out.println("El elemento " + numeroAEliminar + " no está en la lista.");
            System.out.println("Lista original: " + lista);
        }
    }
}

// En Java, puedes utilizar el método remove() de la clase ArrayList para
// eliminar un elemento específico de una lista.
// Este programa utiliza una lista (ArrayList en este caso) y el método remove()
// para eliminar el número especificado de la lista. Se verifica si el número
// está presente en la lista antes de intentar eliminarlo. La lista actualizada
// se imprime después de realizar la eliminación. Si el número no está presente
// en la lista, se imprime un mensaje indicando que el elemento no está en la
// lista y se muestra la lista original.