// Crear una serie de instrucciones en JS que permita crear una variable "var" y asignarle el valor "Hola". 
// El programa debe verificar si "var" es un entero o una cadena de caracteres. 
// Si es entero, el programa debe mostrar en consola "Entero", si no lo es debe mostrar "Cadena de caracteres".


// Crear la variable y asignarle el valor "Hola"
let varValue = "Hola";

// Verificar el tipo de la variable
if (Number.isInteger(varValue)) {
    console.log("Entero");
} else {
    console.log("Cadena de caracteres");
}


// En JavaScript, no hay una distinción clara entre enteros y números de punto flotante, 
// por lo que utilizamos la función Number.isInteger() para verificar si el valor es un número entero. 
// Dado que hemos asignado una cadena de caracteres a la variable, el resultado será "Cadena de caracteres".