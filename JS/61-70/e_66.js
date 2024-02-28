function unionLista(L1, L2, L3) {
    // Combina todas las listas en una sola y elimina duplicados
    var union = [...new Set([...L1, ...L2, ...L3])];
    // Ordena la lista resultante en orden ascendente
    union.sort((a, b) => a - b);
    return union;
}

// Ejemplo de uso:
var L1 = [1, 3, 5, 7, 9];
var L2 = [2, 4, 6, 8, 10];
var L3 = [1, 2, 3, 4, 5];
var resultado = unionLista(L1, L2, L3);
console.log(resultado);



// Esta función combina todas las listas en una sola usando el operador de propagación (...) y el conjunto Set para eliminar los duplicados.
// Luego, ordena la lista resultante en orden ascendente utilizando el método sort().