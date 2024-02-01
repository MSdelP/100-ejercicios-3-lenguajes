// Escribe las instrucciones en Java que permitan ordenar una cadena de caracteres en orden alfabético ascendente. 
// Para probar, vamos a tomar la cadena c = "finlandia".

package e11;

import java.util.Arrays;

public class e_16 {
    public static void main(String[] args) {
        // Cadena de caracteres
        String c = "finlandia";

        // Convertir la cadena en un array de caracteres
        char[] caracteres = c.toCharArray();

        // Ordenar el array de caracteres
        Arrays.sort(caracteres);

        // Convertir el array ordenado de nuevo a una cadena
        String c_ordenada = String.valueOf(caracteres);

        // Mostrar la cadena ordenada
        System.out.println("Cadena ordenada: " + c_ordenada);
    }
}

// En Java, puedes ordenar una cadena de caracteres en orden alfabético
// ascendente utilizando el método toCharArray(), Arrays.sort() y
// String.valueOf().
// En este código, convertimos la cadena en un array de caracteres utilizando
// toCharArray(), luego utilizamos Arrays.sort() para ordenar el array de
// caracteres y finalmente, String.valueOf() para convertir el array ordenado de
// nuevo en una cadena. La salida esperada sería "aadfiilnn".