// Escribe en Java una función f(y,x,j) tomando como parámetros 3 enteros y,x,j y devuelve el resultado de la siguiente función:
// f(y,x,j) =  y*(j**3) + 2*y*(j**2) + x

package e31;

public class e_37 {
    public static void main(String[] args) {
        // Ejemplo de uso
        int y = 3;
        int x = 5;
        int j = 2;
        int resultadoFuncion = f(y, x, j);

        System.out.println(
                "El resultado de la función para y=" + y + ", x=" + x + ", j=" + j + " es: " + resultadoFuncion);
    }

    static int f(int y, int x, int j) {
        return y * (int) Math.pow(j, 3) + 2 * y * (int) Math.pow(j, 2) + x;
    }
}

// En este ejemplo,
// la función f(y, x, j) toma tres parámetros y, x y j, y calcula el resultado
// utilizando Math.pow(j, 3) para elevar j al cubo y Math.pow(j, 2) para
// elevarlo al cuadrado.
// Se realiza un casting a int porque Math.pow devuelve un double. El resultado
// se imprime para el ejemplo dado. Puedes cambiar los valores de y, x y j según
// tus necesidades.