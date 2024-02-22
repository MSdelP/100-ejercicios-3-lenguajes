package e61;

public class e_62 {
    public static String filtraPalabras(String frase, int longitudMinima) {
        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Crear un StringBuilder para construir la frase filtrada
        StringBuilder fraseFiltrada = new StringBuilder();

        // Iterar sobre las palabras y agregarlas al StringBuilder si cumplen con la
        // longitud mínima
        for (String palabra : palabras) {
            if (palabra.length() >= longitudMinima) {
                fraseFiltrada.append(palabra).append(" ");
            }
        }

        // Eliminar el espacio en blanco adicional al final de la frase
        if (fraseFiltrada.length() > 0) {
            fraseFiltrada.deleteCharAt(fraseFiltrada.length() - 1);
        }

        return fraseFiltrada.toString();
    }

    public static void main(String[] args) {
        String fraseOriginal = "Esta es una frase de ejemplo para filtrar palabras según su longitud";
        int longitudMinima = 4;
        String fraseFiltrada = filtraPalabras(fraseOriginal, longitudMinima);
        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase filtrada: " + fraseFiltrada);
    }
}

// Esta clase FiltradorPalabras contiene un método estático llamado
// filtraPalabras que toma una frase y una longitud mínima como parámetros.
// Divide la frase en palabras, itera sobre ellas y agrega aquellas que cumplen
// con la longitud mínima a un StringBuilder. Luego, elimina cualquier espacio
// en blanco adicional al final de la frase filtrada y devuelve la frase
// filtrada como una cadena. En el método main, se muestra un ejemplo de uso de
// esta función.
