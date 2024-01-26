function compruebaPresencia(x, L) {
    return L.includes(x);
}

// Ejemplo de uso
let elemento = 5;
let lista = [1, 3, 5, 7, 9];

let resultado = compruebaPresencia(elemento, lista);

console.log(`¿El elemento ${elemento} está en la lista? ${resultado}`);


// En este ejemplo, compruebaPresencia utiliza el método includes para verificar si el elemento x está presente en la lista L.
// El resultado de la función se imprime para el ejemplo dado. 
// Puedes cambiar los valores de elemento y lista según tus necesidades. La función devuelve true si el elemento está presente y false si no lo está.