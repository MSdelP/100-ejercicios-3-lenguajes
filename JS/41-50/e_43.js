function maximo(L) {
    if (L.length === 0) {
        // Manejar el caso de un array vacío
        return null;
    }

    let maxValor = L[0]; // Inicializar con el primer elemento del array

    for (let i = 1; i < L.length; i++) {
        if (L[i] > maxValor) {
            maxValor = L[i];
        }
    }

    return maxValor;
}

// Ejemplo de uso
const arrayNumeros = [10, 5, 8, 15, 3];
const resultado = maximo(arrayNumeros);
console.log(resultado);



// En esta implementación, se itera sobre el array y se compara cada elemento con el valor máximo actual. 
// Si se encuentra un elemento mayor, se actualiza el valor máximo. Esta función también maneja el caso de un array vacío y devuelve null. 
// Puedes probar la función con diferentes arrays de enteros para encontrar el valor máximo.