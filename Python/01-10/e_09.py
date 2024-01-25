# Escribir un programa en python que permita imprimir en consola sólo los números impares entre 10 y 20.
# Nota: es necesario crear dos versiones, una con el bucle for y otra con el bucle while.


# Versión con bucle for:

# Bucle for para imprimir los números impares entre 10 y 20
for numero in range(11, 21, 2):
    print(numero)


# Versión con bucle while:

# Inicializar la variable para el bucle while
numero = 11

# Bucle while para imprimir los números impares entre 10 y 20
while numero <= 20:
    print(numero)
    numero += 2   


# En ambas versiones, se utilizan bucles para iterar sobre los números impares entre 10 y 20 e imprimir cada número en la consola. 
# En la versión con for, se utiliza range(11, 21, 2) para generar la secuencia de números impares. 
# En la versión con while, se utiliza una variable numero que se incrementa en cada iteración por 2 hasta llegar a 20.