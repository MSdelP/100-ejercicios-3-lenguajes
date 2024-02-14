function concatListas(L1, L2, L3) {
    return L1.concat(L2, L3);
}

// Ejemplo de uso:
let L1 = [1, 2, 3];
let L2 = [4, 5, 6];
let L3 = [7, 8, 9];

let resultado = concatListas(L1, L2, L3);
console.log(resultado); // Devuelve [1, 2, 3, 4, 5, 6, 7, 8, 9]


// Esta función utiliza el método concat() de las listas para concatenar las tres listas y devuelve la lista resultante.