package e41;

import java.util.ArrayList;
import java.util.List;

public class e_49 {
    public static List<Integer> divisoresPositivos(int n) {
        List<Integer> divisores = new ArrayList<>();

        // Iterar desde 1 hasta n (inclusive)
        for (int i = 1; i <= n; i++) {
            // Verificar si i es divisor de n
            if (n % i == 0) {
                divisores.add(i);
            }
        }

        return divisores;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = 12;
        List<Integer> resultado = divisoresPositivos(numero);
        System.out.println("Divisores positivos de " + numero + ": " + resultado);
    }
}

// En esta función, se inicializa una lista divisores para almacenar los
// divisores positivos de n. Luego, se utiliza un bucle for para iterar desde 1
// hasta n, y en cada iteración se verifica si i es un divisor de n. Si lo es,
// se agrega a la lista divisores. Finalmente, la función devuelve la lista de
// divisores. Puedes probar la función con diferentes valores de n para obtener
// los divisores positivos correspondientes.