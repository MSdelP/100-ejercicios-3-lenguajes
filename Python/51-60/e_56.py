# Escribe una función en Python llamada divMult(n,a,numUmbral) que permita encontrar los números (desde 0 hasta numUmbral)
# que son divisibles por n y no son múltiplos de a.

def divMult(n, a, numUmbral):
    numeros_encontrados = []
    for num in range(numUmbral + 1):
        if num % n == 0 and num % a != 0:
            numeros_encontrados.append(num)
    return numeros_encontrados

# Ejemplo de uso:
n = 3
a = 4
numUmbral = 20
resultado = divMult(n, a, numUmbral)
print(f"Números divisibles por {n} y no múltiplos de {a} hasta {numUmbral}: {resultado}")


# Esta función recorre cada número dentro del rango desde 0 hasta numUmbral. Para cada número, verifica si es divisible por n y no es múltiplo de a. 
# Si cumple ambas condiciones, agrega el número a la lista de numeros_encontrados. Finalmente, devuelve la lista de números encontrados.