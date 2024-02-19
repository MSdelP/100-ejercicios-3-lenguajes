public class e_59 {
    public static void main(String[] args) {
        String frase = "Hola Mundo";
        System.out.println(elimEspacio(frase)); // Devuelve "HolaMundo"
    }

    public static String elimEspacio(String frase) {
        // Utilizamos el método replaceAll() con una expresión regular para eliminar los
        // espacios
        return frase.replaceAll("\\s", "");
    }
}

// En esta implementación, la función elimEspacio toma una frase como parámetro
// y utiliza el método replaceAll() de la clase String con la expresión regular
// "\\s", que coincide con todos los caracteres de espacio en blanco (espacios,
// tabulaciones, saltos de línea, etc.), y los reemplaza con una cadena vacía,
// eliminándolos. Luego devuelve la frase sin espacios.