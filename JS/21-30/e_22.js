function truncarDecimal(numero, cifrasDespuesComa) {
    var factor = Math.pow(10, cifrasDespuesComa);
    var resultado = Math.trunc(numero * factor) / factor;
    return resultado;
}

// Ejemplo de uso
var numeroOriginal = 342.9478274632;
var cifrasDespuesComa = 2;

var numeroTruncado = truncarDecimal(numeroOriginal, cifrasDespuesComa);

console.log('Número original:', numeroOriginal);
console.log('Número truncado a', cifrasDespuesComa, 'cifras después de la coma:', numeroTruncado);


// En este ejemplo, la función truncarDecimal multiplica el número original por 10 elevado a la potencia de las cifras deseadas después de la coma, 
// luego aplica Math.trunc() para eliminar la parte decimal,
// finalmente divide el resultado por el mismo factor para obtener el número truncado con la cantidad deseada de cifras después de la coma.
// El resultado se imprime en la consola.