# Escribe un programa en python que permita recuperar la extensión de un archivo.


import os

def obtener_extension(nombre_archivo):
    # Dividir el nombre del archivo y la extensión
    nombre_base, extension = os.path.splitext(nombre_archivo)
    
    # Eliminar el punto de la extensión
    extension = extension[1:]
    
    return extension

# Ejemplo de uso
nombre_archivo = "mi_archivo.txt"
extension = obtener_extension(nombre_archivo)

print(f"La extensión del archivo '{nombre_archivo}' es: {extension}")


# Puedes utilizar la biblioteca os.path en Python para obtener la extensión de un archivo.
# Este programa define una función llamada obtener_extension que toma el nombre de un archivo,
# utiliza os.path.splitext para dividir el nombre del archivo y la extensión, y luego elimina el punto de la extensión. 
# Finalmente, se imprime la extensión del archivo. Puedes cambiar el valor de nombre_archivo por el nombre del archivo que desees analizar.