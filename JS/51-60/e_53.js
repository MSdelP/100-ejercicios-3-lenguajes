function numValoresDicc(d) {
    let totalValores = 0;
    for (let lista of Object.values(d)) {
        totalValores += lista.length;
    }
    return totalValores;
}

// Ejemplo de uso:
let diccionario = {
    'clave1': [1, 2, 3],
    'clave2': [4, 5, 6, 7],
    'clave3': [8, 9]
};

console.log(numValoresDicc(diccionario)); // Devuelve 9 (1+2+3+4+5+6+7+8+9)


