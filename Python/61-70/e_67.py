# Escribe un función en Python calculoMCD(a,b) que tome como parámetros dos enteros que introduce el usuario, a y b. 
# Después calcula el máximo común divisor utilizando el algoritmo de Euclides.
# Nota: La división euclidiana de a por b se escribe de la siguiente manera:
# a = b*q + r   
# q representa el cociente y r es el resto de la división.

def calculoMCD(a, b):
    while b != 0:
        a, b = b, a % b
    return a

# Solicitar al usuario que ingrese los números enteros a y b
a = int(input("Ingrese el primer número entero: "))
b = int(input("Ingrese el segundo número entero: "))

# Calcular el MCD utilizando la función calculoMCD
mcd = calculoMCD(a, b)

# Imprimir el resultado
print(f"El máximo común divisor (MCD) de {a} y {b} es: {mcd}")


# En este código, la función calculoMCD utiliza el algoritmo de Euclides para calcular el máximo común divisor (MCD) entre los números a y b. 
# Luego, se solicita al usuario que ingrese dos números enteros y se calcula el MCD utilizando la función definida, y finalmente se imprime el resultado.