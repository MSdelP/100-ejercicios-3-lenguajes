# Escribe una función en Python unionLista(L1,L2,L3) que toma como parámetros las listas de enteros L1, L2, y L3, 
# y devuelva una lista en orden asccendente de estas listas sin repetición de números, 
# los números repetidos duplicados serán omitido.

def unionLista(L1, L2, L3):
    # Combinar todas las listas en una sola y eliminar duplicados
    union = list(set(L1 + L2 + L3))
    # Ordenar la lista resultante en orden ascendente
    union.sort()
    return union

# Ejemplo de uso:
L1 = [1, 3, 5, 7, 9]
L2 = [2, 4, 6, 8, 10]
L3 = [1, 2, 3, 4, 5]
resultado = unionLista(L1, L2, L3)
print(resultado)


# Esta función combina todas las listas en una sola lista utilizando el operador +,
# luego utiliza set() para eliminar los elementos duplicados y convierte el resultado nuevamente en una lista.
# Finalmente, la lista resultante se ordena en orden ascendente utilizando sort().