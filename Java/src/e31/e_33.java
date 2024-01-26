package e31;

public class e_33 {
    public static void main(String[] args) {
        // Bucle para imprimir la lista 10 veces
        for (int i = 0; i < 10; i++) {
            // Crea la lista del 10 al 20
            int[] listaNumeros = new int[11];
            for (int j = 0; j < listaNumeros.length; j++) {
                listaNumeros[j] = j + 10;
            }

            // Imprime la lista
            imprimirLista(listaNumeros);
        }
    }

    // Método para imprimir la lista
    public static void imprimirLista(int[] lista) {
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

// En Java, puedes utilizar un bucle for para crear la lista del 10 al 20 y
// luego imprimir esa lista 10 veces. En este ejemplo, el bucle for principal se
// ejecuta 10 veces. En cada iteración del bucle, se crea una lista del 10 al 20
// mediante otro bucle for interno, y luego se imprime esa lista utilizando un
// método separado (imprimirLista). Esto resultará en la impresión de la misma
// lista 10 veces.