// Escribir en JS las instrucciones que permiten crear la lista L asignándole los valores [3, 2, 2, 1, 8, 1, 4, 7, 5, 1], 
// a continuación el programa debe calcular el número de apariciones del número 1 en la lista L.


// Crear la lista L
var L = [3, 2, 2, 1, 8, 1, 4, 7, 5, 1];

// Inicializar una variable de conteo
var aparicionesNumero1 = 0;

// Iterar sobre el array y contar las apariciones del número 1
for (var i = 0; i < L.length; i++) {
    if (L[i] === 1) {
        aparicionesNumero1++;
    }
}

// Mostrar el resultado
console.log("El número de apariciones del número 1 en la lista es: " + aparicionesNumero1);


// En este código, recorremos el array con un bucle for, y por cada elemento, verificamos si es igual a 1. 
// Si es así, incrementamos la variable aparicionesNumero1. 
// Finalmente, mostramos el resultado usando console.log(). La salida esperada sería el número de veces que el valor 1 aparece en el array.