# Escribe una función en Python concatDiccc(d1,d2) que tome dos diccionarios d1 y d2 como parámetros,
# y devuelva la concatenación de estos dos diccionarios 


def concatDicc(d1, d2):
    resultado = d1.copy()  # Hacemos una copia de d1 para no modificarlo
    resultado.update(d2)   # Actualizamos el diccionario copiado con los elementos de d2
    return resultado

# Ejemplo de uso:
diccionario1 = {'a': 1, 'b': 2}
diccionario2 = {'c': 3, 'd': 4}

resultado = concatDicc(diccionario1, diccionario2)
print(resultado)  # Devuelve {'a': 1, 'b': 2, 'c': 3, 'd': 4}


# Creamos una copia del primer diccionario d1 utilizando el método copy(), para evitar modificar el diccionario original.
# Luego, utilizamos el método update() para agregar los elementos del segundo diccionario d2 a la copia de d1.
# Finalmente, retornamos la copia actualizada, que ahora contiene la concatenación de ambos diccionarios.