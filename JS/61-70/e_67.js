// Escribe un función en JS calculoMCD(a,b) que tome como parámetros dos enteros que introduce el usuario, a y b. 
// Después calcula el máximo común divisor utilizando el algoritmo de Euclides.
// Nota: La división euclidiana de a por b se escribe de la siguiente manera:
// a = b*q + r   
// q representa el cociente y r es el resto de la división.

function calculoMCD(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Solicitar al usuario que ingrese los números enteros a y b
let a = parseInt(prompt("Ingrese el primer número entero:"));
let b = parseInt(prompt("Ingrese el segundo número entero:"));

// Calcular el MCD utilizando la función calculoMCD
let mcd = calculoMCD(a, b);

// Imprimir el resultado
console.log(`El máximo común divisor (MCD) de ${a} y ${b} es: ${mcd}`);


// En este código, la función calculoMCD utiliza el algoritmo de Euclides para calcular el máximo común divisor (MCD) entre los números a y b.
// Luego, se solicita al usuario que ingrese dos números enteros mediante el uso de prompt, se calcula el MCD utilizando la función definida, 
// y finalmente se imprime el resultado mediante console.log