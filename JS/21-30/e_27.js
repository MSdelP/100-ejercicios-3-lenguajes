// Lista inicial
let L = [9, 8, 7, 6, 5, 4];

// Número que queremos eliminar
let numeroAEliminar = 7;

// Encontrar la posición del número en la lista
let index = L.indexOf(numeroAEliminar);

// Verificar si el número está en la lista antes de intentar eliminarlo
if (index !== -1) {
    // Eliminar el elemento en la posición encontrada
    L.splice(index, 1);
    console.log(`Elemento ${numeroAEliminar} eliminado.`);
    console.log("Lista actualizada:", L);
} else {
    console.log(`El elemento ${numeroAEliminar} no está en la lista.`);
    console.log("Lista original:", L);
}


// En JavaScript, puedes utilizar el método indexOf() para encontrar la posición de un elemento en la lista,
// luego usar el método splice() para eliminar ese elemento. 
// Este código encuentra la posición del número a eliminar utilizando indexOf() y luego usa splice() para eliminar ese elemento de la lista. 
// La lista actualizada se imprime después de realizar la eliminación.
// Si el número no está presente en la lista, se imprime un mensaje indicando que el elemento no está en la lista y se muestra la lista original.