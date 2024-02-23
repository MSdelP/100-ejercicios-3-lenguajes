package e61;

public class e_64 {
    public static void main(String[] args) {
        String fraseOriginal = "Hola cómo estás";
        String fraseInvertida = invertirFrase(fraseOriginal);
        System.out.println(fraseInvertida);
    }

    public static String invertirFrase(String frase) {
        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");
        // Crear un StringBuilder para construir la frase invertida
        StringBuilder fraseInvertida = new StringBuilder();
        // Recorrer las palabras desde el final hasta el principio e ir construyendo la
        // frase invertida
        for (int i = palabras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palabras[i]);
            // Agregar un espacio después de cada palabra, excepto después de la última
            if (i > 0) {
                fraseInvertida.append(" ");
            }
        }
        // Devolver la frase invertida como una cadena
        return fraseInvertida.toString();
    }
}

// Esta función en Java toma una cadena como entrada, la divide en palabras
// usando el espacio como delimitador, invierte el orden de las palabras y las
// une nuevamente en una sola cadena separadas por espacios. Luego imprime la
// frase invertida en la consola. La función invertirFrase devuelve la frase
// invertida como una cadena.
