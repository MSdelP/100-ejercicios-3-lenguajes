// Escribe en JS el código de la función sumaSublista (L,i,j) que toma tres paárametros de una lista L,
// un índice de inicio de cálculo y un índice de fin de cálculoj. 
// La función debe devolver la suma de los números que se encuentran entre los índices de i y j de la lista.


function sumaSublista(L, i, j) {
    // Verificar si los índices son válidos
    if (i < 0 || j >= L.length || i > j) {
        return "Índices inválidos";
    }

    // Calcular la suma de los elementos entre los índices i y j
    const sublista = L.slice(i, j + 1);
    const suma = sublista.reduce((acumulador, elemento) => acumulador + elemento, 0);
    return suma;
}

// Ejemplo de uso
const arrayNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const indiceInicio = 2;
const indiceFin = 6;

const resultado = sumaSublista(arrayNumeros, indiceInicio, indiceFin);
console.log(resultado);


// En este ejemplo, la función sumaSublista utiliza el método slice para obtener una sublista que va desde el índice i hasta el índice j,
//  luego utiliza el método reduce para calcular la suma de los elementos en esa sublista. 
// Se verifica que los índices sean válidos para evitar errores. Puedes probar la función con diferentes arrays y rangos de índices.





