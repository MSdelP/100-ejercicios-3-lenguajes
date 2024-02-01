// Escribe en Java un programa que permita sumar los valores del siguiente diccionario:
// {"Manzana":15, "Banana":8, "Pera":12, "Sandía":9, "Albaricoque":3

package e21;

import java.util.HashMap;

public class e_21 {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> frutas = new HashMap<>();
        frutas.put("Manzana", 15);
        frutas.put("Banana", 8);
        frutas.put("Pera", 12);
        frutas.put("Sandía", 9);
        frutas.put("Albaricoque", 3);

        // Calcular la suma de los valores
        int sumaValores = 0;
        for (int valor : frutas.values()) {
            sumaValores += valor;
        }

        // Mostrar la suma
        System.out.println("La suma de los valores es: " + sumaValores);
    }
}

// En este código, utilizamos un bucle for-each para iterar sobre los valores
// del HashMap y acumulamos la suma en la variable sumaValores. Luego, mostramos
// la suma en la consola