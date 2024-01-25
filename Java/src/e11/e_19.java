package e11;

public class e_19 {
    public static void main(String[] args) {
        // Cadena de caracteres
        String ch = "Hola Mundo";

        // Invertir la cadena
        String cadenaInvertida = invertirCadena(ch);

        // Mostrar la cadena invertida
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadena(String str) {
        // Utilizar StringBuilder para invertir la cadena
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}

// En este código, la función invertirCadena toma una cadena de entrada y
// utiliza la clase StringBuilder para invertirla. La salida esperada sería
// "odnuM aloH".