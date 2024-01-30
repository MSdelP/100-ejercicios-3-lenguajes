function imprimirPiramideCompleta(alturaPiramide) {
    for (let i = 1; i <= alturaPiramide; i++) {
        // Imprimir espacios en la parte superior izquierda de la pirámide
        let espacios = " ".repeat(alturaPiramide - i);
        process.stdout.write(espacios);

        // Imprimir asteriscos en la parte superior derecha de la pirámide
        let asteriscos = "*".repeat(2 * i - 1);
        console.log(asteriscos);
    }
}

// Ejemplo de uso con altura de pirámide 5
imprimirPiramideCompleta(5);


// Este código utiliza el método repeat para generar cadenas de espacios y asteriscos y utiliza process.stdout.write para imprimir sin saltar de línea.
// Puedes ajustar el valor pasado a la función imprimirPiramideCompleta para cambiar la altura de la pirámide según tus necesidades.
// El programa imprimirá la pirámide completa en la consola.