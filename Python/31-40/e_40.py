# Escribe en python un programa para preguntar al usuario por su dni y comprobar si este es válido.
# Imprime si es válido o no.
# Reglas para saber la letra del dni: Toma el número del DNI y divídelo por 23. El resultado de esta división será el cociente y el resto.
# La letra del DNI se determina según el resto obtenido en el paso anterior. Tabla de letras:
# Resto   Letra
# -----   -----
#   0     T
#   1     R
#   2     W
#   3     A
#   4     G
#   5     M
#   6     Y
#   7     F
#   8     P
#   9     D
#  10     X
#  11     B
#  12     N
#  13     J
#  14     Z
#  15     S
#  16     Q
#  17     V
#  18     H
#  19     L
#  20     C
#  21     K
#  22     E


def calcular_letra_dni(numero_dni):
    tabla_letras = 'TRWAGMYFPDXBNJZSQVHLCKE'
    resto = numero_dni % 23
    return tabla_letras[resto]

def validar_dni(dni):
    try:
        # Intenta convertir la entrada a un número
        numero_dni = int(dni[:-1])
        letra_usuario = dni[-1].upper()

        # Calcula la letra esperada
        letra_esperada = calcular_letra_dni(numero_dni)

        # Comprueba si la letra ingresada es válida
        if letra_usuario == letra_esperada:
            return True
        else:
            return False
    except ValueError:
        return False

# Solicita al usuario que ingrese su DNI
dni_usuario = input("Ingresa tu DNI (sin espacios ni guiones): ")

# Valida el DNI y muestra el resultado
if validar_dni(dni_usuario):
    print("El DNI es válido.")
else:
    print("El DNI no es válido.")



# Este programa utiliza la función calcular_letra_dni para obtener la letra esperada y la función validar_dni para comprobar,
# si la letra ingresada por el usuario es válida.
# Solicita al usuario que ingrese su DNI y muestra un mensaje indicando si el DNI es válido o no.
# Ten en cuenta que este código asume que el usuario ingresará un DNI válido,
# no incluye una verificación exhaustiva de todas las posibles entradas incorrectas.