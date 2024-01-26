// Inicio del tiempo de ejecución
const inicioTiempo = new Date();

// Script original
const numero = 7;
console.log(`Tabla de multiplicar del ${numero}:`);
for (let i = 1; i <= 10; i++) {
    const resultado = numero * i;
    console.log(`${numero} x ${i} = ${resultado}`);
}

// Fin del tiempo de ejecución
const finTiempo = new Date();

// Calcular la duración en milisegundos
const duracion = finTiempo - inicioTiempo;

console.log(`\nEl script tomó ${duracion} milisegundos en ejecutarse.`);



// En JavaScript, puedes utilizar el objeto Date para medir el tiempo de ejecución de un script. 
// En este ejemplo, se utiliza new Date() para obtener la marca de tiempo antes y después de ejecutar el script.
// La diferencia entre estas marcas de tiempo te dará la duración de la ejecución del script en milisegundos.
// La duración se imprime al final del script.
// Ten en cuenta que la precisión de la medición de tiempo puede depender del entorno de ejecución del navegador o Node.js.