// Escribe en JS un programa que muestre el siguiente esquema piramidal

// *
// **
// ****
// ******
// ********


const alturaPiramide = 5;

for (let i = 1; i <= alturaPiramide; i++) {
    let asteriscos = '*'.repeat(2 * i - 1);
    console.log(asteriscos);
}


// Este código utiliza un bucle for que itera desde 1 hasta la altura de la pirámide (en este caso, 5). 
// En cada iteración, se crea una cadena de asteriscos (*) utilizando el método repeat y se imprime en la consola. 
//La longitud de la cadena de asteriscos aumenta de manera impares, creando así el patrón piramidal.
// Puedes ajustar la variable alturaPiramide para cambiar la altura de la pirámide según tus necesidades. 
// El programa imprimirá el esquema piramidal en la consola.