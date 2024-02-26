# Escribe una función en Python numOcurrencias(L), que tome como parámetro una lista L y devuelva una lista de tuplas,
# donde cada tupla corresponda a un elemento de la lista L con su número de ocurrencias en la lista.


def numOcurrencias(L):
    ocurrencias = {}
    for elemento in L:
        if elemento in ocurrencias:
            ocurrencias[elemento] += 1
        else:
            ocurrencias[elemento] = 1
    return [(elemento, ocurrencias[elemento]) for elemento in ocurrencias]

# Ejemplo de uso:
lista = [1, 2, 3, 4, 2, 5, 2]
resultado = numOcurrencias(lista)
print(resultado)


# Esta función crea un diccionario ocurrencias donde las claves son los elementos únicos de la lista y los valores son el número de ocurrencias de cada elemento. 
# Luego, crea una lista de tuplas donde cada tupla contiene un elemento de la lista junto con su número de ocurrencias,
# utilizando una comprensión de listas. Finalmente, devuelve esta lista de tuplas.