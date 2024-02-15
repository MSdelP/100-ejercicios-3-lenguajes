# Escribe una función en Python numValoresDicc(d) que tome un diccionario como parámetro,
# y devuelva el número de valores contenidos en las listas asociadas a las claves
# Nota: A efectos de este ejercicio consideramos que todos los valores asociados a las claves están en forma de lista.


def numValoresDicc(d):
    total_valores = 0
    for lista in d.values():
        total_valores += len(lista)
    return total_valores

# Ejemplo de uso:
diccionario = {
    'clave1': [1, 2, 3],
    'clave2': [4, 5, 6, 7],
    'clave3': [8, 9]
}

print(numValoresDicc(diccionario))  # Devuelve 9 (1+2+3+4+5+6+7+8+9)


# Iteramos sobre los valores del diccionario utilizando el método values().
# Para cada lista asociada a una clave, utilizamos la función len() para obtener la longitud de la lista y sumamos este valor al total de valores.
# Al final, retornamos el total de valores encontrados en todas las listas asociadas a las claves del diccionario.