package e61;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class e_68 {
    public static void leerFichero(String rutaFichero) {
        try {
            File archivo = new File(rutaFichero);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ruta del archivo a leer
        String rutaFichero = "ruta/completa/del/archivo.txt"; // Reemplaza con la ruta completa de tu archivo

        // Llamada a la función para leer el archivo
        leerFichero(rutaFichero);
    }
}

// Este código abrirá el archivo especificado en modo lectura, leerá su
// contenido línea por línea y lo mostrará por consola.
// Si el archivo no existe o si ocurre algún error durante la lectura, se
// mostrará un mensaje de error.
// Asegúrate de reemplazar "ruta/completa/del/archivo.txt" con la ruta completa
// de tu archivo.