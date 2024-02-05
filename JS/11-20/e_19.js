// Escribe un programa en JS que permita invertir una cadena de caracteres.
// El programa debe invertir la variable 'ch' que contiene la frase 'Hola Mundo'.

// Cadena de caracteres
var ch = 'Hola Mundo';

// Invertir la cadena
var cadenaInvertida = ch.split('').reverse().join('');

// Mostrar la cadena invertida
console.log("Cadena invertida:", cadenaInvertida);

// En este código, split('') convierte la cadena en un array de caracteres, 
// reverse() invierte el orden de los elementos en el array y join('') une los caracteres invertidos en una cadena nuevamente. 
// La salida esperada sería "odnuM aloH".
