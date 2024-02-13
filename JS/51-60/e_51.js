def controlMayus(frase):
    for letra in frase:
        if letra.isupper():
            return True
    return False

# Ejemplo de uso:
frase1 = "Esta es una Frase de Ejemplo"
frase2 = "esta es una frase en minúsculas"

print(controlMayus(frase1))  # Devolverá True
print(controlMayus(frase2))  # Devolverá False


// Esta función itera sobre cada caracter en la frase y verifica si es una letra mayúscula usando el método isupper().
// Si encuentra al menos una letra mayúscula, devuelve True; de lo contrario, devuelve False.