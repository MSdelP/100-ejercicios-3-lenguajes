# Escribe un función en python llamada añadirElementoDic(clave,valor,d) que toma tres parámentros de entrada: un diccionario d, una clave y su valor asociado.
# La función debe permitir agregar esta clave y su valor al diccionario d. Por último, la función debe devolver el diccionario d que contiene la nueva clave.


def añadirElementoDic(clave, valor, d):
    # Agrega la clave y su valor al diccionario
    d[clave] = valor
    return d

# Ejemplo de uso
diccionario_inicial = {'nombre': 'Juan', 'edad': 25, 'ciudad': 'Madrid'}
nueva_clave = 'intereses'
nuevo_valor = ['python', 'viajar', 'música']

# Agrega la nueva clave y valor al diccionario
diccionario_actualizado = añadirElementoDic(nueva_clave, nuevo_valor, diccionario_inicial)

# Imprime el diccionario actualizado
print(diccionario_actualizado)
