// Escribre un programa en JS que permita ordenar una lista de tuplas L en orden ascendente, basándose en el sengundo elemento de la tupla
// L=[("Piña", 4), ("Granada", 2), ("Sandía", 7), ("Pera", 14), ("Aguacate", 8)]

// Lista de tuplas
var L = [
    ["Piña", 4],
    ["Granada", 2],
    ["Sandía", 7],
    ["Pera", 14],
    ["Aguacate", 8]
  ];
  
  // Ordenar la lista de tuplas en orden ascendente basándose en el segundo elemento
  L.sort(function(a, b) {
    return a[1] - b[1];
  });
  
  // Mostrar la lista ordenada
  console.log("Lista ordenada:", L);

  
// En este código, la función de comparación function(a, b) { return a[1] - b[1]; } se utiliza como argumento para el método sort. 
// Esta función compara las tuplas en función de sus segundos elementos.
// La salida esperada sería la lista L ordenada por el segundo elemento de cada tupla.