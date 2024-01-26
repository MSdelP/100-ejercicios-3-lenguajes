function sumaDigitos(numero) {
    // Inicializa la variable para almacenar la suma
    let suma = 0;

    // Convierte el número a su representación como cadena de caracteres
    const strNumero = String(numero);

    // Itera sobre cada dígito y suma su valor convertido a entero
    for (let i = 0; i < strNumero.length; i++) {
        suma += parseInt(strNumero[i], 10);
    }

    return suma;
}

// Solicita al usuario que ingrese un número
const numeroUsuario = parseInt(prompt("Ingresa un número:"), 10);

// Calcula la suma de los dígitos utilizando la función
const resultado = sumaDigitos(numeroUsuario);

// Imprime el resultado
console.log(`La suma de los dígitos de ${numeroUsuario} es: ${resultado}`);


// Este programa utiliza una función llamada sumaDigitos para calcular la suma de los dígitos del número ingresado por el usuario.
// Se solicita al usuario que ingrese un número mediante el uso de prompt y luego se imprime el resultado en la consola.
// La función parseInt se utiliza para convertir la entrada del usuario a un número entero.