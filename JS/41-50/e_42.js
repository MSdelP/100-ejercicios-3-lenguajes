// Escribe un función en JS llamada añadirElementoDic(clave,valor,d) que toma tres parámentros de entrada: un diccionario d, una clave y su valor asociado.
// La función debe permitir agregar esta clave y su valor al diccionario d. Por último, la función debe devolver el diccionario d que contiene la nueva clave.


function añadirElementoDic(clave, valor, d) {
    // Agrega la clave y su valor al objeto
    d[clave] = valor;
    return d;
}

// Ejemplo de uso
const objeto = {nombre: 'Juan', edad: 25, ciudad: 'Madrid'};
const nuevaClave = 'intereses';
const nuevoValor = ['python', 'viajar', 'música'];

// Agrega la nueva clave y valor al objeto
const objetoActualizado = añadirElementoDic(nuevaClave, nuevoValor, objeto);

// Imprime el objeto actualizado
console.log(objetoActualizado);


// Este ejemplo utiliza un objeto (objeto) con información sobre una persona.
// Luego, se agrega una nueva clave 'intereses' con un array de intereses como valor.
// El resultado será un objeto actualizado con la nueva clave y valor asociado. El objeto actualizado se imprime en la consola.