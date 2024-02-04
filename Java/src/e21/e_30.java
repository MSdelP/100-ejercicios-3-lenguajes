// Escribe en Java un programa que permita calcular el tiempo de ejecución de un script. Tomamos como ejemplo el programa del ejercicio 24.

package e21;

public class e_30 {
    public static void main(String[] args) {
        // Inicio del tiempo de ejecución
        long inicioTiempo = System.currentTimeMillis();

        // Script original
        int numero = 7;
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fin del tiempo de ejecución
        long finTiempo = System.currentTimeMillis();

        // Calcular la duración en milisegundos
        long duracion = finTiempo - inicioTiempo;

        System.out.println("\nEl script tomó " + duracion + " milisegundos en ejecutarse.");
    }
}

// En Java, puedes utilizar la clase System y el método currentTimeMillis() para
// medir el tiempo de ejecución de un script. En este ejemplo,
// System.currentTimeMillis() se utiliza para obtener el tiempo actual en
// milisegundos antes y después de ejecutar el script. La diferencia entre estos
// tiempos te dará la duración de la ejecución del script en milisegundos. La
// duración se imprime al final del script. Ten en cuenta que esta medida de
// tiempo proporciona una precisión razonable para medir tiempos de ejecución en
// milisegundos.
