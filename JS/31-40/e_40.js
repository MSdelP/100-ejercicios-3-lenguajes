function calcularLetraDNI(numeroDNI) {
    const tablaLetras = 'TRWAGMYFPDXBNJZSQVHLCKE';
    const resto = numeroDNI % 23;
    return tablaLetras[resto];
}

function validarDNI(dni) {
    try {
        // Intenta convertir la entrada a un número
        const numeroDNI = parseInt(dni.slice(0, -1), 10);
        const letraUsuario = dni.slice(-1).toUpperCase();

        // Calcula la letra esperada
        const letraEsperada = calcularLetraDNI(numeroDNI);

        // Comprueba si la letra ingresada es válida
        return letraUsuario === letraEsperada;
    } catch (error) {
        return false;
    }
}

// Solicita al usuario que ingrese su DNI
const dniUsuario = prompt("Ingresa tu DNI (sin espacios ni guiones):");

// Valida el DNI y muestra el resultado
if (validarDNI(dniUsuario)) {
    console.log("El DNI es válido.");
} else {
    console.log("El DNI no es válido.");
}


// Este código utiliza la función calcularLetraDNI para obtener la letra esperada y la función validarDNI para comprobar,
// si la letra ingresada por el usuario es válida.
// Solicita al usuario que ingrese su DNI mediante el uso de prompt y muestra un mensaje en la consola indicando si el DNI es válido o no.
// Ten en cuenta que este código asume que el usuario ingresará un DNI válido,
// no incluye una verificación exhaustiva de todas las posibles entradas incorrectas.
