// Escribir una instrucción en que permita crear una lista de números pares del 1 al 10 con una comprensión de lista en JS.

let numerosPares = [];

for (let i = 2; i <= 10; i += 2) {
    numerosPares.push(i);
}

console.log(numerosPares);

// En JavaScript, no existe una construcción directa para comprensiones de listas como en Python. 
// Puedes utilizar un bucle para lograr el mismo resultado.
// En este ejemplo, se utiliza un bucle for para iterar desde 2 hasta 10 con un incremento de 2 en cada paso,
// se agregan los números pares al array numerosPares. Finalmente, se imprime el array.