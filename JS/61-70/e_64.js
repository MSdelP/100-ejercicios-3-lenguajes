function invertirFrase(frase) {
    // Dividir la frase en palabras
    let palabras = frase.split(" ");
    // Invertir el orden de las palabras
    palabras = palabras.reverse();
    // Unir las palabras en una sola cadena
    let fraseInvertida = palabras.join(" ");
    // Imprimir la frase invertida en consola
    console.log(fraseInvertida);
    // Devolver la frase invertida
    return fraseInvertida;
}

// Ejemplo de uso
let fraseOriginal = "Hola cómo estás";
let fraseInvertida = invertirFrase(fraseOriginal);


// Esta función toma una cadena como entrada, la divide en palabras usando el espacio como delimitador, 
// invierte el orden de las palabras, las une nuevamente en una sola cadena separadas por espacios, 
// imprime la frase invertida en la consola y devuelve la frase invertida.




