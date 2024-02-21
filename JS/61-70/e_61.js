function posicionEltLista(L, x) {
    var indices = [];
    for (var i = 0; i < L.length; i++) {
        if (L[i] === x) {
            indices.push(i);
        }
    }
    if (indices.length > 0) {
        return indices;
    } else {
        console.log("El elemento " + x + " no está en la lista " + L);
        return [];
    }
}

// Ejemplo de uso:
var lista = [1, 2, 3, 4, 2, 5, 2];
var elemento = 2;
var indices = posicionEltLista(lista, elemento);
if (indices.length > 0) {
    console.log("El elemento " + elemento + " se encuentra en los índices: " + indices);
}



// Esta función recorre el arreglo L y verifica si el elemento en cada posición es igual a x. Si es así, agrega el índice a la matriz indices. 
// Si no se encuentra ningún índice, se imprime un mensaje indicando que el elemento no está en la lista y se devuelve una matriz vacía.