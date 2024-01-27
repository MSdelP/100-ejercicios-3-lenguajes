# Escribe en python una función suprimirDuplicado(L) que tome una lista de enteros L como parámetro 
# y devuelva la lista L sin elementos duplicados en orden ascendente
# L=[4, 2, 8, 2, 6, 4, 8, 10], ([4,7,4,3,2,9])


def suprimirDuplicado(L):
    # Convierte la lista a un conjunto para eliminar duplicados
    conjunto_sin_duplicados = set(L)
    
    # Convierte el conjunto de nuevo a una lista y ordena los elementos
    lista_sin_duplicados_ordenada = sorted(list(conjunto_sin_duplicados))
    
    return lista_sin_duplicados_ordenada

# Ejemplos de uso
lista1 = [4, 2, 8, 2, 6, 4, 8, 10]
resultado1 = suprimirDuplicado(lista1)
print(resultado1)

lista2 = [4, 7, 4, 3, 2, 9]
resultado2 = suprimirDuplicado(lista2)
print(resultado2)


# Puedes lograr esto fácilmente utilizando un conjunto (set) para eliminar duplicados y luego convirtiendo el conjunto de nuevo a una lista y ordenándola.
# Este código creará y mostrará las listas sin duplicados y ordenadas para los ejemplos proporcionados.
# En el caso de lista1, el resultado sería [2, 4, 6, 8, 10], y para lista2 sería [2, 3, 4, 7, 9].