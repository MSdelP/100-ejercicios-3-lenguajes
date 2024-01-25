# Escribir un programa en python que permita imprimir en consola los números del 1 al 20.
# Nota: es necesario crear dos versiones, una con el bucle for y otra con el bucle while.

# Versión con bucle for:
# Bucle for para imprimir los números del 1 al 20
for numero in range(1, 21):
    print(numero)

# Versión con bucle while:
# Inicializar la variable para el bucle while
numero = 1

# Bucle while para imprimir los números del 1 al 20
while numero <= 20:
    print(numero)
    numero += 1


# En ambas versiones, se utilizan bucles para iterar sobre los números del 1 al 20 e imprimir cada número en la consola. 
# En la versión con for, se utiliza range(1, 21) para generar la secuencia de números del 1 al 20. 
# En la versión con while, se utiliza una variable numero que se incrementa en cada iteración hasta llegar a 20.