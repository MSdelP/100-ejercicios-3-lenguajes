import java.util.ArrayList;

public class e_56 {
    public static ArrayList<Integer> divMult(int n, int a, int numUmbral) {
        ArrayList<Integer> numerosEncontrados = new ArrayList<>();
        for (int num = 0; num <= numUmbral; num++) {
            if (num % n == 0 && num % a != 0) {
                numerosEncontrados.add(num);
            }
        }
        return numerosEncontrados;
    }

    public static void main(String[] args) {
        int n = 3;
        int a = 4;
        int numUmbral = 20;
        ArrayList<Integer> resultado = divMult(n, a, numUmbral);
        System.out.println(
                "Números divisibles por " + n + " y no múltiplos de " + a + " hasta " + numUmbral + ": " + resultado);
    }
}

// Esta función recorre cada número dentro del rango desde 0 hasta numUmbral.
// Para cada número, verifica si es divisible por n y no es múltiplo de a. Si
// cumple ambas condiciones, se agrega el número a la lista numerosEncontrados.
// Finalmente, se devuelve la lista de números encontrados. En el método main,
// se llama a esta función con un ejemplo de n, a y numUmbral, y se imprime el
// resultado.