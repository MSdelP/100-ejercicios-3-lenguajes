function divisoresPositivos(n) {
    const divisores = [];

    // Iterar desde 1 hasta n (inclusive)
    for (let i = 1; i <= n; i++) {
        // Verificar si i es divisor de n
        if (n % i === 0) {
            divisores.push(i);
        }
    }

    return divisores;
}

// Ejemplo de uso
const numero = 12;
const resultado = divisoresPositivos(numero);
console.log("Divisores positivos de", numero, ":", resultado);


// En esta función, se inicializa un array divisores para almacenar los divisores positivos de n. 
// Luego, se utiliza un bucle for para iterar desde 1 hasta n, y en cada iteración se verifica si i es un divisor de n. 
// Si lo es, se agrega a la lista divisores. Finalmente, la función devuelve la lista de divisores. 
// Puedes probar la función con diferentes valores de n para obtener los divisores positivos correspondientes.