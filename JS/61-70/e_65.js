function numOcurrencias(L) {
    var ocurrencias = {};
    for (var i = 0; i < L.length; i++) {
        var elemento = L[i];
        if (ocurrencias[elemento]) {
            ocurrencias[elemento] += 1;
        } else {
            ocurrencias[elemento] = 1;
        }
    }
    var resultado = [];
    for (var clave in ocurrencias) {
        resultado.push([parseInt(clave), ocurrencias[clave]]);
    }
    return resultado;
}

// Ejemplo de uso:
var lista = [1, 2, 3, 4, 2, 5, 2];
var resultado = numOcurrencias(lista);
console.log(resultado);


// Esta función crea un objeto ocurrencias,
// donde las claves son los elementos únicos de la lista y los valores son el número de ocurrencias de cada elemento.
// Luego, recorre este objeto y construye una matriz resultado donde cada elemento es una matriz con dos valores: 
// el elemento y su número de ocurrencias. Finalmente, devuelve esta matriz resultado.




