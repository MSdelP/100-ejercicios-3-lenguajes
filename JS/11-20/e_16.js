// Escribe las instrucciones en JS que permitan ordenar una cadena de caracteres en orden alfabético ascendente. 
// Para probar, vamos a tomar la cadena c = "finlandia".


// Cadena de caracteres
var c = "finlandia";

// Convertir la cadena en un array de caracteres, ordenar y luego unir de nuevo en una cadena
var c_ordenada = c.split('').sort().join('');

// Mostrar la cadena ordenada
console.log("Cadena ordenada:", c_ordenada);

// En este código, split('') convierte la cadena en un array de caracteres, sort() ordena los caracteres,
// finalmente, join('') une los caracteres ordenados en una cadena nuevamente. La salida esperada sería "aadfiilnn".