# Escribe un programa en python que dadas dos listas L1 y L2, devuelva una lista llamada L3 que contenga los elementos en comun:
# L1[7,,10,4,32,5.9,3,"a","hello","x"]
# L2[4,9,2,65,4.3,56,"x",]

# Listas L1 y L2
L1 = [7, 10, 4, 32, 5.9, 3, "a", "hello", "x"]
L2 = [4, 9, 2, 65, 4.3, 56, "x"]

# Convertir las listas en conjuntos para facilitar la comparación
set_L1 = set(L1)
set_L2 = set(L2)

# Encontrar los elementos comunes
set_L3 = set_L1.intersection(set_L2)

# Convertir el conjunto resultante en una lista
L3 = list(set_L3)

# Mostrar la lista con elementos comunes
print("Elementos comunes:", L3)


# En este código, convertimos las listas L1 y L2 en conjuntos (set) para aprovechar la operación de intersección (intersection).
# El resultado, set_L3, contiene los elementos comunes entre ambas listas. 
# Luego, convertimos el conjunto resultante en una lista y mostramos los elementos comunes. 
# La salida esperada sería ['x', 4] ya que "x" y 4 son los elementos que aparecen en ambas listas