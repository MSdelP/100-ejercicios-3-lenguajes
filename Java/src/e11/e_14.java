package e11;

import java.util.ArrayList;
import java.util.List;

public class e_14 {
    public static void main(String[] args) {
        // Crear una lista vacía L
        List<Object> L = new ArrayList<>();

        // Agregar enteros a la lista
        L.add(10);
        L.add(25);
        L.add(42);
        L.add(69);
        L.add(31);

        // Agregar cadenas de caracteres a la lista
        L.add("jd");
        L.add("xa");
        L.add("rtx");

        // Mostrar la lista después de agregar elementos
        System.out.println("Lista después de agregar elementos: " + L);
    }
}

// En este código, creamos una lista vacía L utilizando la interfaz List y la
// implementación ArrayList. Luego, utilizamos el método add() para agregar los
// enteros y cadenas de caracteres a la lista. Finalmente, mostramos la lista
// después de agregar los elementos utilizando System.out.println(). La salida
// esperada sería la lista con los elementos agregados. Ten en cuenta que hemos
// utilizado Object como el tipo de la lista para permitir la mezcla de enteros
// y cadenas en la misma lista.
