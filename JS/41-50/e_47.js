//  Escribe una función en python minimo(L) que tome una lista de enteros L como parámetro y devuelva el valor más pequeño.

function minimo(L) {
    if (L.length === 0) {
        // Manejar el caso de un array vacío
        return null;
    }

    // Utilizar Math.min para obtener el valor mínimo del array
    return Math.min(...L);
}

// Ejemplo de uso
const arrayNumeros = [10, 5, 8, 15, 3];
const resultado = minimo(arrayNumeros);
console.log(resultado);


// En este ejemplo, la función minimo utiliza el operador de propagación (...) para pasar los elementos del array como argumentos individuales a la función Math.min.
// Si el array está vacío, la función devuelve null. Puedes probar la función con diferentes arrays de enteros para encontrar el valor mínimo.