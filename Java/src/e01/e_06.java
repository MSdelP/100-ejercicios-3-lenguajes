// Escribir en Java un programa que declare la variable "d" y le asigne el valor y verifique si esta variable es mayor o menor que 0. 
// Si la variable es mayor a 0, debe imprimir "Positiva", si no lo es debe imprimir "Negativa".

public class e_06 {
    public static void main(String[] args) {
        // Declarar la variable y asignarle un valor
        int d = 10; // Puedes cambiar este valor según tus necesidades

        // Verificar si la variable es mayor o menor que 0
        if (d > 0) {
            System.out.println("Positiva");
        } else if (d < 0) {
            System.out.println("Negativa");
        } else {
            System.out.println("La variable es igual a 0");
        }
    }
}
