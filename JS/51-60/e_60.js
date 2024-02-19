function contarVocales(frase) {
    // Inicializar un objeto para contar las vocales
    var conteoVocales = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0};

    // Convertir la frase a minúsculas para hacer la comparación más fácil
    frase = frase.toLowerCase();

    // Iterar sobre cada caracter en la frase
    for (var i = 0; i < frase.length; i++) {
        var letra = frase[i];
        // Verificar si el caracter es una vocal
        if (letra in conteoVocales) {
            // Incrementar el contador correspondiente
            conteoVocales[letra]++;
        }
    }

    // Mostrar el desglose de vocales en pantalla
    console.log("Desglose de vocales:");
    for (var vocal in conteoVocales) {
        console.log(vocal + ": " + conteoVocales[vocal]);
    }
}

// Pedir al usuario que ingrese una frase
var fraseUsuario = prompt("Ingresa una frase:");

// Llamar a la función contarVocales con la frase proporcionada por el usuario
contarVocales(fraseUsuario);


// Esta función contarVocales toma una frase como entrada y utiliza un objeto para contar la cantidad de cada tipo de vocal en la frase. 
// Luego, muestra el desglose de las vocales y la cantidad de cada tipo en la consola.