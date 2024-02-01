// Escribe un programa en Java que dadas dos listas L1 y L2, devuelva una lista llamada L3 que contenga los elementos en comun:
// L1[7,,10,4,32,5.9,3,"a","hello","x"]
// L2[4,9,2,65,4.3,56,"x",]

package e11;

import java.util.ArrayList;

public class e_17 {
    public static void main(String[] args) {
        // Listas L1 y L2
        ArrayList<Object> L1 = new ArrayList<>();
        L1.add(7);
        L1.add(10);
        L1.add(4);
        L1.add(32);
        L1.add(5.9);
        L1.add(3);
        L1.add("a");
        L1.add("hello");
        L1.add("x");

        ArrayList<Object> L2 = new ArrayList<>();
        L2.add(4);
        L2.add(9);
        L2.add(2);
        L2.add(65);
        L2.add(4.3);
        L2.add(56);
        L2.add("x");

        // Crear una lista L3 que contenga los elementos comunes
        ArrayList<Object> L3 = new ArrayList<>(L1);
        L3.retainAll(L2);

        // Mostrar la lista con elementos comunes
        System.out.println("Elementos comunes: " + L3);
    }
}

// En este código, creamos dos ArrayList (L1 y L2), luego creamos un tercer
// ArrayList llamado L3 que contiene los elementos de L1 y utiliza el método
// retainAll() para retener solo los elementos comunes con L2. Finalmente,
// mostramos la lista L3 que contiene los elementos comunes. La salida esperada
// sería [4, x] ya que 4 y "x" son los elementos que aparecen en ambas listas.
