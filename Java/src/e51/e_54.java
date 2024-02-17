import java.util.HashMap;
import java.util.Map;

public class e_54 {
    public static Map<String, Integer> concatDicc(Map<String, Integer> d1, Map<String, Integer> d2) {
        Map<String, Integer> resultado = new HashMap<>(d1); // Hacemos una copia de d1
        resultado.putAll(d2); // Agregamos todos los elementos de d2
        return resultado;
    }

    public static void main(String[] args) {
        Map<String, Integer> diccionario1 = new HashMap<>();
        diccionario1.put("a", 1);
        diccionario1.put("b", 2);

        Map<String, Integer> diccionario2 = new HashMap<>();
        diccionario2.put("c", 3);
        diccionario2.put("d", 4);

        Map<String, Integer> resultado = concatDicc(diccionario1, diccionario2);
        System.out.println(resultado); // Devuelve {a=1, b=2, c=3, d=4}
    }
}

// Se crea una copia del primer diccionario (d1) utilizando el constructor de
// HashMap.
// Se utiliza el método putAll() para agregar todos los elementos del segundo
// diccionario (d2) a la copia del primer diccionario.
// Finalmente, se devuelve la copia actualizada, que contiene la concatenación
// de ambos diccionarios.