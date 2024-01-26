package e31;

import java.util.Random;

public class e_32 {
    public static void main(String[] args) {
        // Crea una instancia de la clase Random
        Random random = new Random();

        // Genera un número aleatorio entre 25 y 50 (ambos inclusive)
        int numeroAleatorio = random.nextInt(26) + 25;

        // Imprime el número generado
        System.out.println("Número aleatorio entre 25 y 50: " + numeroAleatorio);
    }
}

// En Java, puedes usar la clase Random para generar un número aleatorio y la
// fórmula adecuada para ajustarlo al rango deseado. En este ejemplo,
// random.nextInt(26) genera un número aleatorio entre 0 (inclusive) y 25
// (exclusivo), y luego le sumamos 25 para ajustar el rango al intervalo
// deseado. Al ejecutar este programa, obtendrás un número aleatorio en el rango
// de 25 a 50 (ambos inclusive).