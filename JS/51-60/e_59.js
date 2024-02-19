function elimEspacio(frase) {
    // Utilizamos el método replace() con una expresión regular para eliminar los espacios
    return frase.replace(/\s/g, '');
}

// Ejemplo de uso
var frase = "Hola Mundo";
console.log(elimEspacio(frase)); // Devuelve "HolaMundo"



// Esta función elimEspacio toma una frase como parámetro,
// y utiliza el método replace() de JavaScript con una expresión regular /\s/g que busca todos los espacios en la frase,
// y los reemplaza con una cadena vacía, eliminándolos. Luego devuelve la frase sin espacios.