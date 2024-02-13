package e51;

public class e_51 {
    public static boolean controlMayus(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String frase1 = "Esta es una Frase de Ejemplo";
        String frase2 = "esta es una frase en minúsculas";

        System.out.println(controlMayus(frase1)); // Devolverá true
        System.out.println(controlMayus(frase2)); // Devolverá false
    }
}

// Esta función controlMayus itera sobre cada carácter en la frase y utiliza el
// método Character.isUpperCase() para verificar si el carácter en la posición
// actual es una letra mayúscula. Si encuentra al menos un carácter en
// mayúscula, devuelve true; de lo contrario, devuelve false.