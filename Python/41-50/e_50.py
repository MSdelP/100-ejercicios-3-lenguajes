# Escribe en Python una función mediaLista(L) que tome como parámetros una lista de enteros y devuelva la media de una lista L.


def mediaLista(L):
    if not L:
        # Manejar el caso de una lista vacía
        return None
    
    # Calcular la suma de los elementos en la lista
    suma = sum(L)
    
    # Calcular la media dividiendo la suma entre el número de elementos
    media = suma / len(L)
    
    return media

# Ejemplo de uso
lista_enteros = [1, 2, 3, 4, 5]
resultado = mediaLista(lista_enteros)
print("La media de la lista es:", resultado)


# En este ejemplo, la función mediaLista calcula la suma de todos los elementos en la lista utilizando la función sum de Python. 
# Luego, divide esta suma por el número de elementos en la lista para obtener la media. 
# Si la lista está vacía, la función devuelve None. Puedes probar la función con diferentes listas de enteros para obtener la media correspondiente.