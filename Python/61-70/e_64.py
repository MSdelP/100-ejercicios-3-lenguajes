# Escribe una función en Python invertirFrase(fase) que toma una frase como parámetro e invierte el orden de las palabras en dicha frase.
# La función devuelve e imprime en consola la frase con las palabras invertidas.

def invertirFrase(frase):
    # Dividir la frase en palabras
    palabras = frase.split()
    # Invertir el orden de las palabras
    palabras = palabras[::-1]
    # Unir las palabras en una sola cadena
    frase_invertida = ' '.join(palabras)
    # Imprimir la frase invertida en consola
    print(frase_invertida)
    # Devolver la frase invertida
    return frase_invertida

# Ejemplo de uso
frase_original = "Hola cómo estás"
frase_invertida = invertirFrase(frase_original)


# Esta función toma una cadena como entrada, divide la cadena en palabras, 
# invierte el orden de las palabras y luego las une nuevamente en una sola cadena. 
# Finalmente, imprime la frase invertida en la consola y devuelve la frase invertida.




