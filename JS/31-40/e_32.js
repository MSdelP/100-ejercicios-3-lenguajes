// Genera un número aleatorio entre 25 y 50 (ambos inclusive)
let numeroAleatorio = Math.floor(Math.random() * (50 - 25 + 1)) + 25;

// Imprime el número generado
console.log("Número aleatorio entre 25 y 50:", numeroAleatorio);


// En JavaScript, puedes usar la función Math.random() para generar un número decimal aleatorio entre 0 y 1, y luego ajustar ese número al rango deseado.
// En este ejemplo, Math.random() genera un número decimal aleatorio entre 0 (inclusive) y 1 (exclusivo).
// Luego, multiplicamos ese número por la diferencia entre los límites superior e inferior del rango deseado,
// le sumamos el límite inferior y aplicamos Math.floor() para redondear hacia abajo y obtener un número entero.
// Esto asegura que obtendrás un número en el rango de 25 a 50 (ambos inclusive).