function presenVocal(frase) {
    // Expresión regular para buscar vocales en la frase
    var regex = /[aeiou]/i; // La 'i' hace que la búsqueda sea insensible a mayúsculas/minúsculas

    // Verificar si la frase contiene alguna vocal
    return regex.test(frase);
}

// Ejemplo de uso
var frase = "Hola Mundo";
console.log(presenVocal(frase)); // Devuelve true



// Esta función utiliza una expresión regular para buscar vocales en la frase. 
// La bandera i hace que la búsqueda sea insensible a mayúsculas y minúsculas, 
// lo que significa que también detectará vocales tanto en mayúsculas como en minúsculas.
// Si la función encuentra al menos una vocal, devuelve true; de lo contrario, devuelve false.




