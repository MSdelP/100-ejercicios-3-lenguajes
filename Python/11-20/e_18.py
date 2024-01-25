# Escribre un programa en python que permita ordenar una lista de tuplas L en orden ascendente, basándose en el sengundo elemento de la tupla
# L=[("Piña", 4), ("Granada", 2), ("Sandía", 7), ("Pera", 14), ("Aguacate", 8)]

# Lista de tuplas
L = [("Piña", 4), ("Granada", 2), ("Sandía", 7), ("Pera", 14), ("Aguacate", 8)]

# Ordenar la lista de tuplas en orden ascendente basándose en el segundo elemento
L_ordenada = sorted(L, key=lambda x: x[1])

# Mostrar la lista ordenada
print("Lista ordenada:", L_ordenada)


# En este código, la función lambda x: x[1] se utiliza como clave (key) para la función sorted. 
# Esta función lambda toma cada tupla x y devuelve su segundo elemento (x[1]). 
# La salida esperada sería la lista L ordenada por el segundo elemento de cada tupla