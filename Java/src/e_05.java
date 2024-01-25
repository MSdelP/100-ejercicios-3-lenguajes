public class e_05 {
    public static void main(String[] args) {
        // Crear la variable y asignarle el valor "Hola"
        Object var = "Hola";

        // Verificar el tipo de la variable
        if (var instanceof Integer) {
            System.out.println("Entero");
        } else if (var instanceof String) {
            System.out.println("Cadena de caracteres");
        } else {
            System.out.println("Tipo no reconocido");
        }
    }
}

// En este ejemplo, he utilizado Object como el tipo de la variable var, ya que
// instanceof necesita una referencia de tipo objeto.
// El código verifica si la variable es de tipo Integer (para enteros) o de tipo
// String (para cadenas de caracteres).
// Dado que hemos asignado la cadena "Hola" a la variable, el resultado será
// "Cadena de caracteres".