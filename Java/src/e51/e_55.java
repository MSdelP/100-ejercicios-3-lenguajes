public class e_55 {
    public static long calcFactorial(int n) {
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + calcFactorial(numero));
    }
}

// En este código Java, la función calcFactorial(n) calcula el factorial del
// número n. Si n es negativo, imprime un mensaje de error y devuelve -1. Si n
// es 0, devuelve 1. Si n es un número positivo, calcula el factorial utilizando
// un bucle for y devuelve el resultado. En el método main, se llama a esta
// función con un ejemplo de número y se imprime el resultado.