# Escribe en python un programa que calcule la suma de los dígitos de un número, imprime el resultado.


def suma_digitos(numero):
    # Inicializa la variable para almacenar la suma
    suma = 0
    
    # Convierte el número a su representación como cadena de caracteres
    str_numero = str(numero)
    
    # Itera sobre cada dígito y suma su valor convertido a entero
    for digito in str_numero:
        suma += int(digito)
    
    return suma

# Solicita al usuario que ingrese un número
numero_usuario = int(input("Ingresa un número: "))

# Calcula la suma de los dígitos utilizando la función
resultado = suma_digitos(numero_usuario)

# Imprime el resultado
print(f"La suma de los dígitos de {numero_usuario} es: {resultado}")


# Este programa solicita al usuario que ingrese un número, 
# luego utiliza una función suma_digitos para calcular la suma de los dígitos del número ingresado y finalmente imprime el resultado.

