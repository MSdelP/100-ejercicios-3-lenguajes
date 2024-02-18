# Escribe en Python una función llamada calcFactorial(n) que permita calcular el factorial de un número (en su sentido matemático),
# y devuelva el resultado obtenido al final de dicho cálculo.


def calcFactorial(n):
    factorial = 1
    if n < 0:
        return "El factorial no está definido para números negativos."
    elif n == 0:
        return 1
    else:
        for i in range(1, n + 1):
            factorial *= i
        return factorial

# Ejemplo de uso:
numero = 5
print(f"El factorial de {numero} es: {calcFactorial(numero)}")


# Esta función verifica si el número es negativo y devuelve un mensaje de error si es así. 
# Si el número es cero, devuelve 1 ya que el factorial de 0 es 1. 
# Si el número es positivo, calcula el factorial utilizando un bucle for y devuelve el resultado al finalizar el cálculo.