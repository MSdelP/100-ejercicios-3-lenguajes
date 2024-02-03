// Escribe en python el código de la función sumaSublista (L,i,j) que toma tres paárametros de una lista L,
// un índice de inicio de cálculo y un índice de fin de cálculoj. 
// La función debe devolver la suma de los números que se encuentran entre los índices de i y j de la lista.

package e41;

import java.util.List;

public class e_44 {
    public static int sumaSublista(List<Integer> L, int i, int j) {
        // Verificar si los índices son válidos
        if (i < 0 || j >= L.size() || i > j) {
            System.out.println("Índices inválidos");
            return -1; // o algún valor que indique un error
        }

        // Calcular la suma de los elementos entre los índices i y j
        int suma = 0;
        for (int k = i; k <= j; k++) {
            suma += L.get(k);
        }
        return suma;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int indiceInicio = 2;
        int indiceFin = 6;

        int resultado = sumaSublista(listaNumeros, indiceInicio, indiceFin);
        System.out.println(resultado);
    }

}

// En este ejemplo, la función sumaSublista utiliza un bucle for para iterar
// sobre los elementos entre los índices i y j y calcular la suma. Se verifica
// que los índices sean válidos para evitar errores. Puedes probar la función
// con diferentes listas y rangos de índices.