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
