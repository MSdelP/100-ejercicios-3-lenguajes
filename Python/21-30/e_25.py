# Escribe un programa en python con un array bidimensional que haga la tabla de multiplicar hasta el 9


# Crear un array bidimensional para almacenar la tabla de multiplicar
tabla_multiplicar = [[0] * 10 for _ in range(10)]

# Llenar el array bidimensional con la tabla de multiplicar
for i in range(1, 10):
    for j in range(1, 10):
        tabla_multiplicar[i][j] = i * j

# Imprimir la tabla de multiplicar
print("Tabla de multiplicar hasta el 9:")
for i in range(1, 10):
    for j in range(1, 10):
        print(f"{i} x {j} = {tabla_multiplicar[i][j]}\t", end="")
    print()

# Este programa crea un array bidimensional de 10x10 e llena sus elementos con los resultados de la tabla de multiplicar del 1 al 9.
# Luego, imprime la tabla de multiplicar. 