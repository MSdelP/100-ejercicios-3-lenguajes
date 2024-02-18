# Escribe otra vez el ejercicio anterior en Python (número 56), pero esta vez numUmbral lo define el usuario del programa.


def divMult(n, a, numUmbral):
    numeros_encontrados = []
    for num in range(numUmbral + 1):
        if num % n == 0 and num % a != 0:
            numeros_encontrados.append(num)
    return numeros_encontrados

# Solicitar al usuario que ingrese el valor de numUmbral
numUmbral = int(input("Ingrese el valor de numUmbral: "))

# Ejemplo de uso:
n = 3
a = 4
resultado = divMult(n, a, numUmbral)
print(f"Números divisibles por {n} y no múltiplos de {a} hasta {numUmbral}: {resultado}")


# En este código, numUmbral se solicita al usuario mediante input(). 
# Luego, se llama a la función divMult() con los valores de n, a y numUmbral proporcionados por el usuario, y se imprime el resultado.