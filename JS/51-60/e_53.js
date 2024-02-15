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


// Utilizamos un bucle for...of para iterar sobre los valores del diccionario utilizando Object.values(d).
// Para cada lista asociada a una clave, obtenemos su longitud utilizando lista.length y sumamos este valor al total de valores.
// Al final, retornamos el total de valores encontrados en todas las listas asociadas a las claves del diccionario.