# Escribe un programa en python que permita mezclar de manera aleatoria los elementos de una lista.
# L = [43, 22, 7, "Pepe", 2, "as", "Julián", 8]


import random

# Lista original
L = [43, 22, 7, "Pepe", 2, "as", "Julián", 8]

# Mezcla los elementos de la lista de manera aleatoria
random.shuffle(L)

# Imprime la lista mezclada
print("Lista mezclada:", L)


# Puedes usar la función shuffle del módulo random para mezclar de manera aleatoria los elementos de una lista en Python. 
# Este programa importa el módulo random, utiliza la función shuffle para mezclar la lista L de manera aleatoria y luego imprime la lista resultante. 
# Cada vez que ejecutes el programa, obtendrás una mezcla diferente de los elementos.