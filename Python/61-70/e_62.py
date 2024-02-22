# Escribe una función en Python  llamada filtraPalabras(frase,longitudMinima), 
# que tome como parámetros una frase y filtre las palabras con una longitud menor al establecido en el parámetro longitudMinima. 
# La función debe devolver la misma frase sin las palabras filtradas.


def filtraPalabras(frase, longitudMinima):
    # Dividir la frase en palabras
    palabras = frase.split()
    
    # Filtrar las palabras según la longitud mínima
    palabras_filtradas = [palabra for palabra in palabras if len(palabra) >= longitudMinima]
    
    # Reconstruir la frase con las palabras filtradas
    frase_filtrada = ' '.join(palabras_filtradas)
    
    return frase_filtrada

# Ejemplo de uso
frase_original = "Esta es una frase de ejemplo para filtrar palabras según su longitud"
longitud_minima = 4
frase_filtrada = filtraPalabras(frase_original, longitud_minima)
print("Frase original:", frase_original)
print("Frase filtrada:", frase_filtrada)


# Esta función tomará la frase original y la longitud mínima como parámetros. Dividirá la frase en palabras, 
# luego filtrará las palabras según la longitud mínima especificada y finalmente reconstruirá la frase con las palabras filtradas.