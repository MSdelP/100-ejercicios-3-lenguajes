# Escribir en python un programa que cree la lista L asignçandole el valor [1,2,3,4,5,6,7,8,9,10], 
# luego crear una nueva lista L1 que recuperar un elemento de cada tres en la lista L. 

# Crear la lista L asignándole los valores [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
L = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Crear una nueva lista L1 que recupera un elemento de cada tres en la lista L
L1 = L[::3]

# Mostrar la lista L1
print("Lista L1:", L1)


# En este código, utilizamos la técnica de "slicing" ([::3]) para crear una nueva lista L1 que contiene elementos de la lista L tomados cada tres elementos. 
# La salida esperada sería la lista L1 con los elementos [1, 4, 7, 10].