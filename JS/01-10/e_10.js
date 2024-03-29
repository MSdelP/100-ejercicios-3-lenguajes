// Escribir una instrucción que permite crear una lista de números del 1 al 10 utilizando una comprensión de lista en JS. 
// (Se trata de imitar ese comportamiento en Java)


let numeros = Array.from({length: 10}, (_, index) => index + 1);


// Esta instrucción utiliza Array.from junto con una función de mapeo para generar un array que contiene los números del 1 al 10. 
// La función de mapeo recibe dos argumentos, el primer argumento (_) se ignora ya que no se utiliza,
// el segundo argumento (index) representa el índice actual en la lista, y se suma 1 para obtener los números del 1 al 10.