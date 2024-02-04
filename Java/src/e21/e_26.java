// Escribe un programa en Java que muestre la carpeta en la que se encuentra el script actual

package e21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class e_26 {
    public static void main(String[] args) {
        // Obtener la ruta del directorio actual del script
        Path carpetaActual = Paths.get("").toAbsolutePath();

        System.out.println("El script se encuentra en la carpeta: " + carpetaActual);
    }
}

// En Java, puedes usar la clase Paths del paquete java.nio.file para obtener la
// ruta del directorio actual del script. Este programa utiliza Paths.get("")
// para obtener un Path que representa el directorio actual y luego
// toAbsolutePath() para convertirlo en una ruta absoluta. Finalmente, se
// imprime la carpeta en la que se encuentra el script. Ten en cuenta que la
// carpeta actual puede variar dependiendo de cómo se ejecuta el script.