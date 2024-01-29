function maximo(L) {
    if (L.length === 0) {
        // Manejar el caso de un array vacío
        return null;
    } else {
        // Utilizar Math.max para obtener el valor máximo del array
        return Math.max(...L);
    }
}

// Ejemplo de uso
const arrayNumeros = [10, 5, 8, 15, 3];
const resultado = maximo(arrayNumeros);
console.log(resultado);


// En este ejemplo, la función maximo utiliza el operador de propagación (...) para pasar los elementos del array como argumentos individuales a la función Math.max. 
// Si el array está vacío, la función devuelve null. Puedes probar la función con diferentes arrays de enteros para encontrar el valor máximo.