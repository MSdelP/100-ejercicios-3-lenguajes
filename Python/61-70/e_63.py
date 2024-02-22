# Escribe una función en Python  llamada cambiaPalabras(frase,cambiaPalabra,palabra), 
# que tome como parámetros una frase y filtre las palabras deseadas en cambiaPalabra (puede ser una o varias) y las cambie por el elemento declarado en palabra. 
# La función debe devolver la misma frase con las palabras filtradas.

def cambiaPalabras(frase, cambiaPalabra, palabra):
    # Dividir la frase en palabras
    palabras = frase.split()
    
    # Iterar sobre las palabras y reemplazar aquellas que coincidan con cambiaPalabra
    for i in range(len(palabras)):
        if palabras[i] in cambiaPalabra:
            palabras[i] = palabra
            
    # Reconstruir la frase con las palabras cambiadas
    frase_cambiada = ' '.join(palabras)
    
    return frase_cambiada

# Ejemplo de uso
frase_original = "Esta es una frase de ejemplo para cambiar palabras específicas"
cambia_palabra = ["frase", "ejemplo", "específicas"]
palabra_nueva = "palabra"
frase_cambiada = cambiaPalabras(frase_original, cambia_palabra, palabra_nueva)
print("Frase original:", frase_original)
print("Frase cambiada:", frase_cambiada)



# Esta función toma la frase original, una lista de palabras a cambiar (cambiaPalabra) y la palabra nueva (palabra).
# Itera sobre las palabras de la frase y si alguna coincide con las palabras especificadas en cambiaPalabra, la reemplaza por la palabra nueva.
# Luego, reconstruye la frase con las palabras cambiadas y la devuelve.