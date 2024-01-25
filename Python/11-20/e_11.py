# Escribir una instrucción en que permita crear una lista de números pares del 1 al 10 con una comprensión de lista en python.

numeros_pares = [i for i in range(2, 11, 2)]

# En esta instrucción, range(2, 11, 2) genera una secuencia de números desde 2 hasta 10 (excluyendo 11) con un paso de 2,
# la comprensión de lista [i for i in range(2, 11, 2)] crea una lista que contiene estos números pares.