function f(y, x, j) {
    return y * Math.pow(j, 3) + 2 * y * Math.pow(j, 2) + x;
}

// Ejemplo de uso
let y = 3;
let x = 5;
let j = 2;
let resultadoFuncion = f(y, x, j);

console.log(`El resultado de la función para y=${y}, x=${x}, j=${j} es: ${resultadoFuncion}`);


// En este ejemplo, 
// la función f(y, x, j) toma tres parámetros y, x y j, y calcula el resultado utilizando Math.pow(j, 3) para elevar j al cubo y Math.pow(j, 2) para elevarlo al cuadrado.
// Luego, el resultado se imprime para el ejemplo dado. Puedes cambiar los valores de y, x y j según tus necesidades