// Bucle principal con los números del 10 al 20
for (let numeroPrincipal = 10; numeroPrincipal <= 20; numeroPrincipal++) {
    // Lista del 10 al 20
    let listaNumeros = Array.from({ length: 11 }, (_, index) => index + 10);

    // Bucle interno que repite la lista 10 veces
    for (let i = 0; i < 10; i++) {
        // Imprime la lista
        console.log(listaNumeros);
    }

    // Imprime el número principal
    console.log(`Número principal: ${numeroPrincipal}`);
    console.log("=".repeat(20));  // Línea separadora
}


// Este código utiliza un bucle for para iterar a través de los números del 10 al 20.
// Dentro de este bucle, hay otro bucle interno que crea la lista del 10 al 20 y la imprime 10 veces.
// La impresión del número principal y la línea separadora se realiza una vez fuera del bucle interno.