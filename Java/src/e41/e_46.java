package e41;

public class e_46 {
    public static void main(String[] args) {
        int alturaPiramide = 5;

        for (int i = 1; i <= alturaPiramide; i++) {
            // Imprimir espacios en la parte superior izquierda de la pirámide
            for (int j = alturaPiramide - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Imprimir asteriscos en la parte superior derecha de la pirámide
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Cambiar de línea para la siguiente fila
        }
    }
}

// Para crear una pirámide completa, puedes imprimir espacios en la parte
// superior izquierda para que tenga una apariencia simétrica. En este código,
// se utiliza un bucle adicional para imprimir espacios en blanco en la parte
// superior izquierda de la pirámide, antes de imprimir los asteriscos en la
// parte superior derecha. Este enfoque crea una apariencia más simétrica para
// la pirámide completa. Puedes ajustar la variable alturaPiramide para cambiar
// la altura de la pirámide según tus necesidades. El programa imprimirá la
// pirámide completa en la consola.
