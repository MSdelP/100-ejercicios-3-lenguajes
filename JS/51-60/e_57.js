function divMult(n, a, numUmbral) {
    let numerosEncontrados = [];
    for (let num = 0; num <= numUmbral; num++) {
        if (num % n === 0 && num % a !== 0) {
            numerosEncontrados.push(num);
        }
    }
    return numerosEncontrados;
}

// Solicitar al usuario que ingrese el valor de numUmbral
const numUmbral = parseInt(prompt("Ingrese el valor de numUmbral:"));

// Ejemplo de uso:
const n = 3;
const a = 4;
const resultado = divMult(n, a, numUmbral);
console.log(`Números divisibles por ${n} y no múltiplos de ${a} hasta ${numUmbral}:`, resultado);


// En este código, numUmbral se solicita al usuario mediante prompt(). 
// Luego, se llama a la función divMult() con los valores de n, a y numUmbral proporcionados por el usuario, y se imprime el resultado.