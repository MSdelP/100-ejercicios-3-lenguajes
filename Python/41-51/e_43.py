# Escribe en python una función maximo(L) que tome una lista de enteros como parámetro y devuelva el mayor valor. 
# La idea es no usar la función icorporada max.


def maximo(L):
    if not L:
        # Manejar el caso de una lista vacía
        return None
    
    max_valor = L[0]  # Inicializar con el primer elemento de la lista

    for num in L:
        if num > max_valor:
            max_valor = num

    return max_valor

# Ejemplo de uso
lista_numeros = [10, 5, 8, 15, 3]
resultado = maximo(lista_numeros)
print(resultado)


# En esta implementación, se itera sobre la lista y se compara cada elemento con el valor máximo actual. 
# Si se encuentra un elemento mayor, se actualiza el valor máximo. 
# Esta función también maneja el caso de una lista vacía y devuelve None. 
# Puedes probar la función con diferentes listas de enteros para encontrar el valor máximo.o.