function divMult(n, a, numUmbral) {
    let numerosEncontrados = [];
    for (let num = 0; num <= numUmbral; num++) {
        if (num % n === 0 && num % a !== 0) {
            numerosEncontrados.push(num);
        }
    }
    return numerosEncontrados;
}

// Ejemplo de uso:
const n = 3;
const a = 4;
const numUmbral = 20;
const resultado = divMult(n, a, numUmbral);
console.log(`Números divisibles por ${n} y no múltiplos de ${a} hasta ${numUmbral}:`, resultado);


// Esta función recorre cada número dentro del rango desde 0 hasta numUmbral. Para cada número, verifica si es divisible por n y no es múltiplo de a. 
// Si cumple ambas condiciones, se agrega el número a la lista numerosEncontrados. Finalmente, se devuelve la lista de números encontrados.
