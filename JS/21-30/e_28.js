// Iniciar una lista para almacenar los números naturales del 1 al 20
let numerosNaturales = Array.from({ length: 20 }, (_, index) => index + 1);

// Inicializar una lista para almacenar los números impares y sus posiciones
let imparesYPosiciones = [];

// Iterar sobre la lista de números naturales
numerosNaturales.forEach((numero, indice) => {
    // Verificar si el número es impar
    if (numero % 2 !== 0) {
        // Agregar el número impar y su posición a la lista
        imparesYPosiciones.push({ numero: numero, posicion: indice });
    }
});

// Imprimir los números impares y sus posiciones
imparesYPosiciones.forEach(item => {
    console.log(`Número impar: ${item.numero}, Posición: ${item.posicion}`);
});


// Este código utiliza Array.from para crear una lista de números naturales y forEach para iterar sobre esa lista.
// Se verifica si cada número es impar y, en caso afirmativo, se agrega un objeto con el número impar y su posición a la lista imparesYPosiciones.
// Finalmente, se imprime cada objeto que contiene un número impar y su posición en la lista.