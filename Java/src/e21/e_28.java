package e21;

import java.util.ArrayList;
import java.util.List;

public class e_28 {
    public static void main(String[] args) {
        // Iniciar una lista para almacenar los números naturales del 1 al 20
        List<Integer> numerosNaturales = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numerosNaturales.add(i);
        }

        // Inicializar una lista para almacenar los números impares y sus posiciones
        List<NumeroImparPosicion> imparesYPosiciones = new ArrayList<>();

        // Iterar sobre la lista de números naturales
        for (int i = 0; i < numerosNaturales.size(); i++) {
            int numero = numerosNaturales.get(i);

            // Verificar si el número es impar
            if (numero % 2 != 0) {
                // Agregar el número impar y su posición a la lista
                imparesYPosiciones.add(new NumeroImparPosicion(numero, i));
            }
        }

        // Imprimir los números impares y sus posiciones
        for (NumeroImparPosicion item : imparesYPosiciones) {
            System.out.println("Número impar: " + item.getNumero() + ", Posición: " + item.getPosicion());
        }
    }
}

class NumeroImparPosicion {
    private int numero;
    private int posicion;

    public NumeroImparPosicion(int numero, int posicion) {
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public int getPosicion() {
        return posicion;
    }
}
