function mediaLista(L) {
    if (L.length === 0) {
        // Manejar el caso de una lista vacía
        return null;
    }

    // Calcular la suma de los elementos en la lista
    const suma = L.reduce((acumulador, elemento) => acumulador + elemento, 0);

    // Calcular la media dividiendo la suma entre el número de elementos
    const media = suma / L.length;

    return media;
}

// Ejemplo de uso
const lista_enteros = [1, 2, 3, 4, 5];
const resultado = mediaLista(lista_enteros);
console.log("La media de la lista es:", resultado);


// En este ejemplo, la función mediaLista utiliza el método reduce para calcular la suma de todos los elementos en la lista.
// Luego, divide esta suma por el número de elementos en la lista para obtener la media. 
// Si la lista está vacía, la función devuelve null. Puedes probar la función con diferentes listas de enteros para obtener la media correspondiente.