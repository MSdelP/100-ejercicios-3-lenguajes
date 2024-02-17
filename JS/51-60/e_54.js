function concatDicc(d1, d2) {
    return {...d1, ...d2};
}

// Ejemplo de uso:
let diccionario1 = {'a': 1, 'b': 2};
let diccionario2 = {'c': 3, 'd': 4};

let resultado = concatDicc(diccionario1, diccionario2);
console.log(resultado); // Devuelve {'a': 1, 'b': 2, 'c': 3, 'd': 4}


// Usamos el operador de propagación (...) para combinar los elementos de d1 y d2 en un nuevo objeto.
// Esto crea un nuevo objeto que contiene todas las claves y valores de d1 y d2.
// Finalmente, devolvemos este nuevo objeto que representa la concatenación de ambos diccionarios.