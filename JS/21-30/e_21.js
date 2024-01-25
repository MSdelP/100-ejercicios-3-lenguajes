
// Objeto
var frutas = {"Manzana": 15, "Banana": 8, "Pera": 12, "Sandía": 9, "Albaricoque": 3};

// Calcular la suma de los valores
var sumaValores = 0;
for (var key in frutas) {
    sumaValores += frutas[key];
}

// Mostrar la suma
console.log("La suma de los valores es:", sumaValores);


// Este programa utiliza un bucle for...in para iterar sobre las claves del objeto y Object.values() para obtener los valores correspondientes.
// Luego, se suman los valores y se muestra la suma en la consola.