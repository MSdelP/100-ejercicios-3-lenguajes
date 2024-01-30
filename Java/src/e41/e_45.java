package e41;

public class e_45 {
    public static void main(String[] args) {
        int alturaPiramide = 5;

        for (int i = 1; i <= alturaPiramide; i++) {
            String asteriscos = "*".repeat(2 * i - 1);
            System.out.println(asteriscos);
        }
    }
}

// Este programa utiliza un bucle for que itera desde 1 hasta la altura de la
// pirámide (en este caso, 5). En cada iteración, se crea una cadena de
// asteriscos (*) utilizando el método repeat y se imprime en la consola. La
// longitud de la cadena de asteriscos aumenta de manera impares, creando así el
// patrón piramidal.

// Este código utiliza System.out.println para imprimir en la consola. Puedes
// ajustar la variable alturaPiramide para cambiar la altura de la pirámide
// según tus necesidades. El programa imprimirá el esquema piramidal en la
// consola. Ten en cuenta que el método repeat está disponible a partir de Java
// 11. Si estás utilizando una versión anterior de Java, puedes implementar una
// función simple para repetir caracteres.