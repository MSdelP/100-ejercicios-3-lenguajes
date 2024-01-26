package e21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class e_29 {
    public static void main(String[] args) {
        // Ejemplo de uso
        String nombreArchivo = "mi_archivo.txt";
        String extension = obtenerExtension(nombreArchivo);

        System.out.println("La extensión del archivo '" + nombreArchivo + "' es: " + extension);
    }

    static String obtenerExtension(String nombreArchivo) {
        // Obtener la extensión del archivo usando la clase Path
        Path path = Paths.get(nombreArchivo);
        String extension = "";

        // Obtener la extensión
        String fileName = path.getFileName().toString();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex + 1);
        }

        return extension;
    }
}

// En este programa, la función obtenerExtension toma el nombre de un archivo,
// utiliza la clase Path para trabajar con rutas, obtiene el nombre del archivo
// y busca la última aparición del punto para separar la extensión del nombre
// del archivo. Luego, imprime la extensión del archivo. Puedes cambiar el valor
// de nombreArchivo por el nombre del archivo que desees analizar.