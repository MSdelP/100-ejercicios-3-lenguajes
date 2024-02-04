// Escribe un programa en Java con un array bidimensional que haga la tabla de multiplicar hasta el 9

package e21;

public class e_25 {
    public static void main(String[] args) {
        // Crear un array bidimensional para almacenar la tabla de multiplicar
        int[][] tablaMultiplicar = new int[10][10];

        // Llenar el array bidimensional con la tabla de multiplicar
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                tablaMultiplicar[i][j] = i * j;
            }
        }

        // Imprimir la tabla de multiplicar
        System.out.println("Tabla de multiplicar hasta el 9:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// Este programa crea un array bidimensional de 10x10 e llena sus elementos con
// los resultados de la tabla de multiplicar del 1 al 9. Luego, imprime la tabla
// de multiplicar en la consola.