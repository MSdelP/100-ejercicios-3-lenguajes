# Escribe en Python una función llamada elimEspacio(frase) que tome como parámetro una frase en forma de cadena de caracteres,
# y devuelva la misma frase sin los espacios (de haberlos) entre las palabras.


def elimEspacio(frase):
    # Utilizamos el método replace() para reemplazar los espacios por una cadena vacía
    frase_sin_espacios = frase.replace(" ", "")
    return frase_sin_espacios

# Ejemplo de uso
frase = "Hola Mundo"
print(elimEspacio(frase))  # Devuelve "HolaMundo"


# Esta función recibe una frase como parámetro 
# y utiliza el método replace() de las cadenas de Python para reemplazar todos los espacios por una cadena vacía, eliminándolos. 
# Luego devuelve la frase sin espacios.