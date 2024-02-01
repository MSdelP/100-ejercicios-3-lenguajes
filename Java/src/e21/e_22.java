// Escribe un programa en Java que permita truncar un número decimal a 2 cigras despuçes de la coma.
// Por ejemplo, podemos usar el número decimal 342.9478274632

package e21;

import java.math.BigDecimal;

public class e_22 {
    public static void main(String[] args) {
        // Ejemplo de uso
        BigDecimal numeroOriginal = new BigDecimal("342.9478274632");
        int cifrasDespuesComa = 2;

        BigDecimal numeroTruncado = truncarDecimal(numeroOriginal, cifrasDespuesComa);

        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número truncado a " + cifrasDespuesComa + " cifras después de la coma: " + numeroTruncado);
    }

    public static BigDecimal truncarDecimal(BigDecimal numero, int cifrasDespuesComa) {
        return numero.setScale(cifrasDespuesComa, BigDecimal.ROUND_DOWN);
    }
}

// En este ejemplo, la función truncarDecimal utiliza el método setScale de la
// clase BigDecimal para establecer el número de cifras después de la coma y
// utiliza el modo BigDecimal.ROUND_DOWN para truncar hacia abajo. El resultado
// se imprime en la consola. Ten en cuenta que la entrada y salida del número se
// manejan como BigDecimal para evitar problemas de precisión con números
// decimales en punto flotante.
