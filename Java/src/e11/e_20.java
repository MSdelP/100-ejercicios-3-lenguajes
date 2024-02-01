// Escribe un programa en pyhton que muestre en consola el valor de las claves 'Manzana' y 'Banana' del diccionario {'Manzana':3,  'Banana':2, 'Kiwi':1}

package e11;

import java.util.HashMap;

public class e_20 {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> frutas = new HashMap<>();
        frutas.put("Manzana", 3);
        frutas.put("Banana", 2);
        frutas.put("Kiwi", 1);

        // Mostrar el valor de las claves 'Manzana' y 'Banana'
        System.out.println("Valor de Manzana: " + frutas.get("Manzana"));
        System.out.println("Valor de Banana: " + frutas.get("Banana"));
    }
}
