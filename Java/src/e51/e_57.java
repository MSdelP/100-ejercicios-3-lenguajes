import java.util.ArrayList;
import java.util.Scanner;

public class e_57 {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de numUmbral: ");
        int numUmbral = scanner.nextInt();

        int n = 3;
        int a = 4;
        ArrayList<Integer> resultado = divMult(n, a, numUmbral);
        System.out.println(
                "Números divisibles por " + n + " y no múltiplos de " + a + " hasta " + numUmbral + ": " + resultado);

        scanner.close();
    }
}

// En este código, se utiliza la clase Scanner para leer la entrada del usuario
// y obtener el valor de numUmbral. Luego, se llama a la función divMult() con
// los valores de n, a y numUmbral proporcionados por el usuario, y se imprime
// el resultado.