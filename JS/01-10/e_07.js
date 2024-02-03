// Escribir un progrograma en JS que solicite al usuario su edad y la almacena en una variable. 
// El programa debe verificar si el usuario tiene una edad mayor o menor a 18 años. 
// Si la edad del usuario es igual o mayor que 18 el programa imprime "Eres mayor de edad", de lo contrario debe imprimir "Eres menor de edad".


// Solicitar al usuario su edad
let edad = parseInt(prompt("Por favor, introduce tu edad:"));

// Verificar si el usuario es mayor o menor de 18 años
if (edad >= 18) {
    console.log("Eres mayor de edad");
} else {
    console.log("Eres menor de edad");
}


// En este código, se utiliza prompt para obtener la entrada del usuario, parseInt para convertir esa entrada a un entero y luego se compara con 18. 
// Finalmente, se utiliza console.log para imprimir el resultado correspondiente.