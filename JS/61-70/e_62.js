function filtraPalabras(frase, longitudMinima) {
    // Dividir la frase en palabras
    var palabras = frase.split(" ");
    
    // Filtrar las palabras según la longitud mínima
    var palabrasFiltradas = palabras.filter(function(palabra) {
        return palabra.length >= longitudMinima;
    });
    
    // Reconstruir la frase con las palabras filtradas
    var fraseFiltrada = palabrasFiltradas.join(" ");
    
    return fraseFiltrada;
}

// Ejemplo de uso
var fraseOriginal = "Esta es una frase de ejemplo para filtrar palabras según su longitud";
var longitudMinima = 4;
var fraseFiltrada = filtraPalabras(fraseOriginal, longitudMinima);
console.log("Frase original:", fraseOriginal);
console.log("Frase filtrada:", fraseFiltrada);


// Esta función filtraPalabras toma la frase original y la longitud mínima como parámetros. 
// Divide la frase en palabras, filtra las palabras según la longitud mínima especificada y luego reconstruye la frase con las palabras filtradas.