# Escribe un programa en python que inicie un bucle para rellenar elementos en una lista.
# La lista debe ser los números desde el 1 hasta el 20. Selecciona los números impares e imprime dichos números y su posición en la lista


# Iniciar una lista para almacenar los números naturales del 1 al 20
numeros_naturales = list(range(1, 21))

# Inicializar una lista para almacenar los números impares y sus posiciones
impares_y_posiciones = []

# Iterar sobre la lista de números naturales
for indice, numero in enumerate(numeros_naturales):
    # Verificar si el número es impar
    if numero % 2 != 0:
        # Agregar el número impar y su posición a la lista
        impares_y_posiciones.append((numero, indice))

# Imprimir los números impares y sus posiciones
for numero_impar, posicion in impares_y_posiciones:
    print(f"Número impar: {numero_impar}, Posición: {posicion}")


# Puedes utilizar un bucle para llenar una lista con números naturales del 1 al 20 y luego imprimir los números impares junto con su posición en la lista.
# Este programa utiliza enumerate() para obtener tanto el índice como el valor mientras itera sobre la lista de números naturales.
# Luego, verifica si cada número es impar y, en caso afirmativo, agrega una tupla con el número impar y su posición a la lista impares_y_posiciones.
# Finalmente, imprime los números impares y sus posiciones en la lista.
