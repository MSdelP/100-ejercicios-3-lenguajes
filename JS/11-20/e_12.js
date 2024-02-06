// Escribir las instrucciones en JS que permiten crear la lista L asignándole los valores [6, 8, 3, 4, 1, 12, 2, 9, 2], 
// luego ordenar los números de la lista en orden creciente. El programa de mostrar la lista L después de haber ordenado los números.


// Crear la lista L
var L = [6, 8, 3, 4, 1, 12, 2, 9, 2];

// Ordenar la lista en orden creciente
L.sort(function(a, b) {
    return a - b;
});

// Mostrar la lista después de ordenar
console.log("Lista después de ordenar:", L);

// En este código, utilizamos el método sort() de JavaScript para ordenar la lista. 
// El argumento de la función sort() toma una función de comparación que especifica cómo se deben comparar los elementos. 
// En este caso, la función de comparación (a, b) => a - b ordena los elementos en orden creciente. 
// Finalmente, utilizamos console.log() para mostrar la lista después de ordenar.