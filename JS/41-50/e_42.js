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