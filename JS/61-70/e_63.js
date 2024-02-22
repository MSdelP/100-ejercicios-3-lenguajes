function cambiaPalabras(frase, cambiaPalabra, palabra) {
    // Dividir la frase en palabras
    var palabras = frase.split(" ");
    
    // Iterar sobre las palabras y reemplazar aquellas que coincidan con cambiaPalabra
    for (var i = 0; i < palabras.length; i++) {
        if (cambiaPalabra.includes(palabras[i])) {
            palabras[i] = palabra;
        }
    }
    
    // Reconstruir la frase con las palabras cambiadas
    var fraseCambiada = palabras.join(" ");
    
    return fraseCambiada;
}

// Ejemplo de uso
var fraseOriginal = "Esta es una frase de ejemplo para cambiar palabras específicas";
var cambiaPalabra = ["frase", "ejemplo", "específicas"];
var palabraNueva = "palabra";
var fraseCambiada = cambiaPalabras(fraseOriginal, cambiaPalabra, palabraNueva);
console.log("Frase original:", fraseOriginal);
console.log("Frase cambiada:", fraseCambiada);


// Esta función cambiaPalabras toma la frase original, una lista de palabras a cambiar (cambiaPalabra) y la palabra nueva (palabra).
// Itera sobre las palabras de la frase y si alguna coincide con las palabras especificadas en cambiaPalabra, la reemplaza por la palabra nueva.
// Luego, reconstruye la frase con las palabras cambiadas y la devuelve.