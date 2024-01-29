package e41;

import java.util.HashMap;
import java.util.Map;

public class e_42 {
    public static Map<String, Object> añadirElementoMapa(String clave, Object valor, Map<String, Object> mapa) {
        // Agrega la clave y su valor al mapa
        mapa.put(clave, valor);
        return mapa;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Map<String, Object> mapaInicial = new HashMap<>();
        mapaInicial.put("nombre", "Juan");
        mapaInicial.put("edad", 25);
        mapaInicial.put("ciudad", "Madrid");

        String nuevaClave = "intereses";
        String nuevoValor = "['python', 'viajar', 'música']";

        // Agrega la nueva clave y valor al mapa
        Map<String, Object> mapaActualizado = añadirElementoMapa(nuevaClave, nuevoValor, mapaInicial);

        // Imprime el mapa actualizado
        System.out.println(mapaActualizado);
    }
}

// En este ejemplo, se utiliza un HashMap como implementación de la interfaz
// Map. La función añadirElementoMapa toma una clave, un valor y un mapa, y
// agrega la clave y el valor al mapa. Luego, el programa principal muestra el
// mapa inicial y el mapa actualizado después de agregar la nueva clave y valor
// asociado.
