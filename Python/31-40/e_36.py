# Escribe en python un programa para crear la lista L = [-4.2, 2.3, 8, -2, 6.8]. 
# A continuación crea una nueva lista L1 usando comprensión de lista con los números de L que son positivos o mayores que 0. 
# Imprime la lista L1.


# Crear la lista original
L = [-4.2, 2.3, 8, -2, 6.8]

# Crear la nueva lista L1 mediante comprensión de lista
L1 = [x for x in L if x > 0]

# Imprimir la lista L1
print("Lista L1:", L1)


# Puedes crear la nueva lista L1 utilizando una comprensión de lista que incluya solo los números positivos o mayores que 0 de la lista original L.
# En este ejemplo, la comprensión de lista [x for x in L if x > 0] selecciona cada elemento x de la lista L solo si es positivo o mayor que 0,
# creando así la nueva lista L1. La lista L1 se imprime al final del programa.





