// Crear la lista L asignándole los valores [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
var L = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// Crear una nueva lista L1 que recupera un elemento de cada tres en la lista L
var L1 = [];
for (var i = 0; i < L.length; i += 3) {
    L1.push(L[i]);
}

// Mostrar la lista L1
console.log("Lista L1:", L1);


// En este código, utilizamos un bucle for para iterar sobre la lista L y seleccionar un elemento de cada tres.
// Luego, utilizamos el método push() para agregar esos elementos a la nueva lista L1. La salida esperada sería la lista L1 con los elementos [1, 4, 7, 10].