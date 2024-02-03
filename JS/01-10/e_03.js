// Escribe una serie de instrucciones en JS que permita declarar dos variables "x" e "y" asignando los valores 3 y 8.32, 
// luego convertir el tipo de estas variables a una cadena de caracteres. 
// Al final, el programa debe mostrar el tipo de estas variables antes y después de la conversión


// Declarar las variables y asignarles valores
let x = 3;
let y = 8.32;

// Mostrar el tipo de las variables antes de la conversión
console.log("Tipo de x antes de la conversión:", typeof x);
console.log("Tipo de y antes de la conversión:", typeof y);

// Convertir el tipo de las variables a cadenas de caracteres
x = String(x);
y = String(y);

// Mostrar el tipo de las variables después de la conversión
console.log("Tipo de x después de la conversión:", typeof x);
console.log("Tipo de y después de la conversión:", typeof y);
