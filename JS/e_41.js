function suprimirDuplicado(L) {
    // Convierte la lista a un conjunto para eliminar duplicados
    const conjuntoSinDuplicados = new Set(L);
    
    // Convierte el conjunto de nuevo a una lista y ordena los elementos
    const listaSinDuplicadosOrdenada = Array.from(conjuntoSinDuplicados).sort((a, b) => a - b);
    
    return listaSinDuplicadosOrdenada;
}

// Ejemplos de uso
const lista1 = [4, 2, 8, 2, 6, 4, 8, 10];
const resultado1 = suprimirDuplicado(lista1);
console.log(resultado1);

const lista2 = [4, 7, 4, 3, 2, 9];
const resultado2 = suprimirDuplicado(lista2);
console.log(resultado2);


// Este código crea y muestra las listas sin duplicados y ordenadas para los ejemplos proporcionados.
// En el caso de lista1, el resultado sería [2, 4, 6, 8, 10], y para lista2 sería [2, 3, 4, 7, 9]. 
// La función utiliza un conjunto para eliminar duplicados y luego convierte el conjunto de nuevo a una lista, que es ordenada antes de ser devuelta.