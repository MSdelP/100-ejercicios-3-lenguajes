# Escribe en Python una función que tome un entero n como parámetro, devuelva una lista que contenga todos los divisores positivos de n en orden ascendente.


def divisores_positivos(n):
    # Inicializar una lista para almacenar los divisores
    divisores = []
    
    # Iterar desde 1 hasta n (inclusive)
    for i in range(1, n + 1):
        # Verificar si i es divisor de n
        if n % i == 0:
            divisores.append(i)
    
    return divisores

# Ejemplo de uso
numero = 12
resultado = divisores_positivos(numero)
print("Divisores positivos de", numero, ":", resultado)


# La función divisores_positivos itera desde 1 hasta n (inclusive) y verifica si cada número es un divisor de n utilizando el operador % (módulo).
# Si un número i es un divisor de n, se agrega a la lista divisores. 
# Finalmente, la función devuelve la lista de divisores. 
# Puedes probar la función con diferentes valores de n para obtener los divisores positivos correspondientes.




