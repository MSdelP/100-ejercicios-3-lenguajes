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