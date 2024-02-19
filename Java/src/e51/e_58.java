public class e_58 {
    public static void main(String[] args) {
        String frase = "Hola Mundo";
        System.out.println(presenVocal(frase)); // Devuelve true
    }

    public static boolean presenVocal(String frase) {
        // Convertir la frase a minúsculas para hacer la comparación más fácil
        frase = frase.toLowerCase();

        // Array de vocales
        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

        // Iterar sobre cada letra en la frase
        for (char letra : frase.toCharArray()) {
            // Verificar si la letra es una vocal
            for (char vocal : vocales) {
                if (letra == vocal) {
                    return true;
                }
            }
        }
        // Si no se encontró ninguna vocal, devolver false
        return false;
    }
}

// En esta implementación, la función presenVocal toma la frase como parámetro,
// la convierte a minúsculas para hacer la comparación de letras más fácil y
// luego itera sobre cada letra de la frase. Si encuentra alguna vocal, devuelve
// true, de lo contrario, devuelve false.