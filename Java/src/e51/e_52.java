import java.util.ArrayList;
import java.util.List;

public class e_52 {
    public static List<Integer> concatListas(List<Integer> L1, List<Integer> L2, List<Integer> L3) {
        List<Integer> concatenadas = new ArrayList<>();
        concatenadas.addAll(L1);
        concatenadas.addAll(L2);
        concatenadas.addAll(L3);
        return concatenadas;
    }

    public static void main(String[] args) {
        List<Integer> L1 = List.of(1, 2, 3);
        List<Integer> L2 = List.of(4, 5, 6);
        List<Integer> L3 = List.of(7, 8, 9);

        List<Integer> resultado = concatListas(L1, L2, L3);
        System.out.println(resultado); // Devuelve [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

// La función concatListas() toma tres listas como argumentos y devuelve una
// nueva lista que es la concatenación de las tres listas.
// Dentro de esta función, primero se crea una nueva lista llamada concatenadas.
// Luego, se agregan todos los elementos de las tres listas de entrada a la
// lista concatenadas utilizando el método addAll().
// Finalmente, se devuelve la lista concatenada.
// Recuerda que en este ejemplo se están utilizando listas inmutables
// (List.of()), pero también puedes utilizar ArrayList si necesitas mutabilidad.