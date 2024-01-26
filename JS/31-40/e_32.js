// Lista original
let L = [43, 22, 7, "Pepe", 2, "as", "Julián", 8];

// Función de comparación aleatoria
function comparacionAleatoria() {
    return Math.random() - 0.5;
}

// Mezcla los elementos de la lista de manera aleatoria
L.sort(comparacionAleatoria);

// Imprime la lista mezclada
console.log("Lista mezclada:", L);



// Puedes lograr la mezcla aleatoria de una lista en JavaScript utilizando la función sort junto con una función de comparación aleatoria.
// La función comparacionAleatoria devuelve un número aleatorio entre -0.5 y 0.5, 
// lo que hace que la función de ordenamiento sort ordene la lista de manera aleatoria. 
// Al ejecutar este código, obtendrás diferentes mezclas de la lista cada vez.