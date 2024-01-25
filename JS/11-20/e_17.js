// Arrays L1 y L2
var L1 = [7, 10, 4, 32, 5.9, 3, "a", "hello", "x"];
var L2 = [4, 9, 2, 65, 4.3, 56, "x"];

// Convertir los arrays en conjuntos para facilitar la comparación
var set_L1 = new Set(L1);
var set_L2 = new Set(L2);

// Encontrar los elementos comunes
var set_L3 = new Set([...set_L1].filter(x => set_L2.has(x)));

// Convertir el conjunto resultante en un array
var L3 = Array.from(set_L3);

// Mostrar el array con elementos comunes
console.log("Elementos comunes:", L3);


// En este código, convertimos los arrays L1 y L2 en conjuntos (Set) para aprovechar la funcionalidad de conjuntos, 
// utilizamos el método filter junto con has para obtener los elementos comunes. 
// El resultado, set_L3, es un conjunto que contiene los elementos comunes entre ambas listas. 
// Luego, convertimos este conjunto resultante en un array y mostramos los elementos comunes. 
// La salida esperada sería ['x', 4] ya que "x" y 4 son los elementos que aparecen en ambas listas.