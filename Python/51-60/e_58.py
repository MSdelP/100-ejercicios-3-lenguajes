# Escribe una función en Python llamada presenVocal(frase) que tome como parámetro una frase y verifique si contiene una vocal o no. 
# Si la frase ccontiene una vocal, la función devuelve True, si no contiene alguna vocal devuelve False.


def presenVocal(frase):
    # Lista de vocales
    vocales = ['a', 'e', 'i', 'o', 'u']

    # Convertir la frase a minúsculas para hacer la comparación más fácil
    frase = frase.lower()

    # Iterar sobre cada letra en la frase
    for letra in frase:
        # Si la letra es una vocal, devolver True
        if letra in vocales:
            return True

    # Si no se encontró ninguna vocal, devolver False
    return False

# Ejemplo de uso
frase = "Hola Mundo"
print(presenVocal(frase))  # Devuelve True



# Esta función presenVocal toma la frase como entrada, 
# la convierte a minúsculas para hacer la comparación de letras más fácil y luego itera sobre cada letra de la frase. 
# Si encuentra alguna vocal, devuelve True, de lo contrario, devuelve False.