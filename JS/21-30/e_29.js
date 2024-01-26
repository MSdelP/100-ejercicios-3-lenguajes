function obtenerExtension(nombreArchivo) {
    // Obtener la última aparición del punto para separar la extensión
    const puntoIndex = nombreArchivo.lastIndexOf('.');
    
    // Verificar si hay un punto en el nombre del archivo
    if (puntoIndex !== -1) {
        // Obtener la subcadena después del último punto
        const extension = nombreArchivo.slice(puntoIndex + 1);
        return extension;
    } else {
        // Si no hay un punto, el archivo no tiene extensión
        return "El archivo no tiene extensión";
    }
}

// Ejemplo de uso
const nombreArchivo = "mi_archivo.txt";
const extension = obtenerExtension(nombreArchivo);

console.log(`La extensión del archivo '${nombreArchivo}' es: ${extension}`);


// Este programa define una función llamada obtenerExtension que toma el nombre de un archivo,
// encuentra la última aparición del punto (que separa la extensión del nombre del archivo) y luego obtiene la subcadena que representa la extensión.
// Si no se encuentra un punto en el nombre del archivo, se imprime un mensaje indicando que el archivo no tiene extensión.
// Puedes cambiar el valor de nombreArchivo por el nombre del archivo que desees analizar.