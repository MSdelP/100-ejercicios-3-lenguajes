const fs = require('fs');

function leerFichero(rutaFichero) {
    try {
        const contenido = fs.readFileSync(rutaFichero, 'utf8');
        console.log("Contenido del archivo:");
        console.log(contenido);
    } catch (error) {
        console.error("Ocurrió un error al leer el archivo:", error);
    }
}

// Ruta del archivo a leer
const rutaFichero = "ruta/completa/del/archivo.txt"; // Reemplaza con la ruta completa de tu archivo

// Llamada a la función para leer el archivo
leerFichero(rutaFichero);

// Este código utiliza el módulo fs de Node.js para leer el contenido del archivo especificado.
// La función readFileSync lee el archivo de forma síncrona y devuelve su contenido como una cadena. 
// Luego, se muestra el contenido por consola. Si ocurre algún error, se imprime un mensaje de error en la consola.
// Asegúrate de reemplazar "ruta/completa/del/archivo.txt" con la ruta completa de tu archivo.