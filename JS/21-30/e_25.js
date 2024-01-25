// Crear un array bidimensional para almacenar la tabla de multiplicar
let tablaMultiplicar = new Array(10);
for (let i = 0; i < 10; i++) {
    tablaMultiplicar[i] = new Array(10);
}

// Llenar el array bidimensional con la tabla de multiplicar
for (let i = 1; i <= 9; i++) {
    for (let j = 1; j <= 9; j++) {
        tablaMultiplicar[i][j] = i * j;
    }
}

// Imprimir la tabla de multiplicar
console.log("Tabla de multiplicar hasta el 9:");
for (let i = 1; i <= 9; i++) {
    let fila = "";
    for (let j = 1; j <= 9; j++) {
        fila += `${i} x ${j} = ${tablaMultiplicar[i][j]}\t`;
    }
    console.log(fila);
}


// Este programa crea un array bidimensional de 10x10 e llena sus elementos con los resultados de la tabla de multiplicar del 1 al 9. 
// Luego, imprime la tabla de multiplicar en la consola.