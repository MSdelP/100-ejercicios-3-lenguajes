# Escribe una función en Python llamada posicionEltLista(L,x) que tome como parámetros una lista de elementos L y un elemento x,
# y devuelva el índice (o índices) donde se encuentra el elmento x en la lista L.
# La función debe devolver una lista de índices. Si el elemento x no se encuentra en la lista L, el programa mostrará en consola:
#    "El elemento x no está en la lista L".


def posicionEltLista(L, x):
    indices = []
    for i, elemento in enumerate(L):
        if elemento == x:
            indices.append(i)
    if indices:
        return indices
    else:
        print(f"El elemento {x} no está en la lista {L}")
        return []

# Ejemplo de uso:
lista = [1, 2, 3, 4, 2, 5, 2]
elemento = 2
indices = posicionEltLista(lista, elemento)
if indices:
    print(f"El elemento {elemento} se encuentra en los índices: {indices}")


# Esta función recorre la lista L y verifica si el elemento en cada posición es igual a x. Si es así, agrega el índice a la lista de indices.
# Si no se encuentra ningún índice, se imprime un mensaje indicando que el elemento no está en la lista y se devuelve una lista vacía.