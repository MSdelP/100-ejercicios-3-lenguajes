package e61;

public class e_63 {
    public static String cambiaPalabras(String frase, String[] cambiaPalabra, String palabra) {
        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Iterar sobre las palabras y reemplazar aquellas que coincidan con
        // cambiaPalabra
        for (int i = 0; i < palabras.length; i++) {
            for (String palabraCambia : cambiaPalabra) {
                if (palabras[i].equals(palabraCambia)) {
                    palabras[i] = palabra;
                    break;
                }
            }
        }

        // Reconstruir la frase con las palabras cambiadas
        StringBuilder fraseCambiada = new StringBuilder();
        for (String palabraActual : palabras) {
            fraseCambiada.append(palabraActual).append(" ");
        }

        return fraseCambiada.toString().trim(); // Eliminar el espacio en blanco al final
    }

    public static void main(String[] args) {
        String fraseOriginal = "Esta es una frase de ejemplo para cambiar palabras específicas";
        String[] cambiaPalabra = { "frase", "ejemplo", "específicas" };
        String palabraNueva = "palabra";
        String fraseCambiada = cambiaPalabras(fraseOriginal, cambiaPalabra, palabraNueva);
        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase cambiada: " + fraseCambiada);
    }
}

// Esta clase CambiadorPalabras contiene un método estático llamado
// cambiaPalabras que toma la frase original, una lista de palabras a cambiar
// (cambiaPalabra) y la palabra nueva (palabra). Itera sobre las palabras de la
// frase y si alguna coincide con las palabras especificadas en cambiaPalabra,
// la reemplaza por la palabra nueva. Luego, reconstruye la frase con las
// palabras cambiadas y la devuelve. En el método main, se muestra un ejemplo de
// uso de esta función.
