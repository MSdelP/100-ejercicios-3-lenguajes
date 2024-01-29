# Escribe en python una función maximo(L) que tome una lista de enteros como parámetro y devuelva el mayor valor. La idea es usar la función max.


def maximo(L):
    if not L:
        # Manejar el caso de una lista vacía
        return None
    else:
        # Utilizar la función max para obtener el valor máximo de la lista
        return max(L)

# Ejemplo de uso
lista_numeros = [10, 5, 8, 15, 3]
resultado = maximo(lista_numeros)
print(resultado)


# En este caso, la función maximo simplemente devuelve el resultado de aplicar la función max a la lista L.
# Si la lista está vacía, la función devuelve None. Puedes probar la función con diferentes listas de enteros para encontrar el valor máximo.