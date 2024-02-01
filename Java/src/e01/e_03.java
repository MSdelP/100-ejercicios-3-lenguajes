// Escribe una serie de instrucciones en Java que permita declarar dos variables "x" e "y" asignando los valores 3 y 8.32, 
// luego convertir el tipo de estas variables a una cadena de caracteres. 
// Al final, el programa debe mostrar el tipo de estas variables antes y después de la conversión

public class e_03 {
    public static void main(String[] args) {
        // Declarar las variables y asignarles valores
        int x = 3;
        double y = 8.32;

        // Mostrar el tipo de las variables antes de la conversión
        System.out.println("Tipo de x antes de la conversión: " + obtenerTipo(x));
        System.out.println("Tipo de y antes de la conversión: " + obtenerTipo(y));

        // Convertir el tipo de las variables a cadenas de caracteres
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);

        // Mostrar el tipo de las variables después de la conversión
        System.out.println("Tipo de x después de la conversión: " + obtenerTipo(strX));
        System.out.println("Tipo de y después de la conversión: " + obtenerTipo(strY));
    }

    // Función para obtener el tipo de una variable como cadena
    private static String obtenerTipo(Object variable) {
        return variable.getClass().getSimpleName();
    }

}

// Este método, obtenerTipo, tiene los modificadores private y static por
// razones específicas relacionadas con su diseño y uso en el contexto de
// programación.

// Private:
// La palabra clave private indica que el método solo es accesible dentro de la
// misma clase en la que está definido. No puede ser accedido directamente desde
// fuera de la clase, ya sea desde otras clases del mismo paquete o clases
// externas.
// La encapsulación mediante el modificador private ayuda a controlar el acceso
// a los detalles internos de la implementación de la clase y promueve una mejor
// modularidad y mantenimiento del código. Otros componentes del programa no
// pueden acceder directamente a este método, limitando el alcance y evitando
// posibles problemas de manipulación no autorizada.

// Static:
// La palabra clave static indica que el método pertenece a la clase en lugar de
// a una instancia específica de la clase. Esto significa que el método se puede
// llamar sin crear una instancia del objeto.
// En este caso, como el método opera solo en la clase de obtenerTipo, no
// necesita acceder a ninguna instancia específica de la clase para realizar su
// tarea. La información que requiere está contenida en el parámetro variable,
// que es de tipo Object.
// Hacer el método static permite llamarlo directamente desde la clase sin
// necesidad de instanciar un objeto de esa clase. Por ejemplo, puedes llamar al
// método así: NombreDeLaClase.obtenerTipo(algunaVariable).
// En resumen, el modificador private garantiza que el método solo sea accesible
// dentro de la misma clase, mientras que static permite su invocación sin crear
// instancias de la clase. Estos modificadores se utilizan para controlar el
// acceso y proporcionar una interfaz clara y específica para el uso del método
// dentro del contexto de la clase en la que está definido.