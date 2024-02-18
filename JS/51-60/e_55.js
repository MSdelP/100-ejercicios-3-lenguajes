function calcFactorial(n) {
    if (n < 0) {
        return "El factorial no está definido para números negativos.";
    } else if (n === 0) {
        return 1;
    } else {
        let factorial = 1;
        for (let i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

// Ejemplo de uso:
const numero = 5;
console.log(`El factorial de ${numero} es: ${calcFactorial(numero)}`);


// Esta función en JavaScript sigue la misma lógica que la función en Python. 
// Verifica si el número es negativo y devuelve un mensaje de error si es así. 
// Si el número es cero, devuelve 1, ya que el factorial de 0 es 1. 
// Si el número es positivo, calcula el factorial utilizando un bucle for y devuelve el resultado al finalizar el cálculo.