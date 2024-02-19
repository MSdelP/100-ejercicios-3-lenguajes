import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String fraseUsuario = scanner.nextLine();
        contarVocales(fraseUsuario);
        scanner.close();
    }

    public static void contarVocales(String frase) {
        // Inicializar un mapa para contar las vocales
        Map<Character, Integer> conteoVocales = new HashMap<>();
        conteoVocales.put('a', 0);
        conteoVocales.put('e', 0);
        conteoVocales.put('i', 0);
        conteoVocales.put('o', 0);
        conteoVocales.put('u', 0);

        // Convertir la frase a minúsculas para hacer la comparación más fácil
        frase = frase.toLowerCase();

        // Iterar sobre cada caracter en la frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            // Verificar si el caracter es una vocal
            if (conteoVocales.containsKey(letra)) {
                // Incrementar el contador correspondiente
                conteoVocales.put(letra, conteoVocales.get(letra) + 1);
            }
        }

        // Mostrar el desglose de vocales en pantalla
        System.out.println("Desglose de vocales:");
        for (Map.Entry<Character, Integer> entry : conteoVocales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

// Esta función contarVocales toma una frase como entrada y utiliza un HashMap
// para contar la cantidad de cada tipo de vocal en la frase. Luego, muestra el
// desglose de las vocales y la cantidad de cada tipo en la consola.
