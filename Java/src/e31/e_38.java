// Escribe en Java una función llamada compruebaPresencia (x,L), que toma como parámetros una lista L y un elemento x. 
// La función devuelve True si el elemento x existe en la lista L y False y el elemento x no existe en la lista L.

package e31;

import java.util.List;

public class e_38 {
    public static void main(String[] args) {
        // Ejemplo de uso
        int elemento = 5;
        List<Integer> lista = List.of(1, 3, 5, 7, 9);

        boolean resultado = compruebaPresencia(elemento, lista);

        System.out.println("¿El elemento " + elemento + " está en la lista? " + resultado);
    }

    static <T> boolean compruebaPresencia(T x, List<T> L) {
        return L.contains(x);
    }
}

// En este ejemplo, compruebaPresencia utiliza el método contains para verificar
// si el elemento x está presente en la lista L. El resultado de la función se
// imprime para el ejemplo dado. Puedes cambiar el tipo de los elementos y los
// valores de elemento y lista según tus necesidades. La función devuelve true
// si el elemento está presente y false si no lo está.