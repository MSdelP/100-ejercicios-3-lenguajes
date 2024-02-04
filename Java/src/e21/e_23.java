// # Escribe un programa en python que permita formatear la cadena de caracteres "Me llamo miNombre y tengo edad años. Estoy aprendiendo el lenguaje Lenguaje".
// El programa debe permitir formatear esta cadena asignándole el contenido de las siguientes variables:
// miNombre = "Mario", edad = 37, Lenguaje = Python

package e21;

public class e_23 {
    public static void main(String[] args) {
        // Variables
        String miNombre = "Mario";
        int edad = 37;
        String lenguaje = "Java";

        // Formatear cadena usando String.format()
        String cadenaFormateada = String.format("Me llamo %s y tengo %d años. Estoy aprendiendo el lenguaje %s.",
                miNombre, edad, lenguaje);

        // Otra forma: Concatenar las variables directamente
        // String cadenaFormateada = "Me llamo " + miNombre + " y tengo " + edad + "
        // años. Estoy aprendiendo el lenguaje " + lenguaje + ".";

        // Imprimir la cadena formateada
        System.out.println(cadenaFormateada);
    }
}

// En este ejemplo, usamos String.format() para formatear la cadena con las
// variables proporcionadas. %s se utiliza para representar una cadena, %d para
// representar un entero. También he proporcionado una forma alternativa
// utilizando la concatenación de cadenas para mostrar cómo se puede lograr el
// mismo resultado de una manera más directa