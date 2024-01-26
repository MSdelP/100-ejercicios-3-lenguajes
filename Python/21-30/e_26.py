# Escribe un programa en python que muestre la carpeta en la que se encuentra el script actual


import os

# Obtener la ruta absoluta del directorio actual del script
ruta_actual = os.path.abspath(os.path.dirname(__file__))

print(f"El script se encuentra en la carpeta: {ruta_actual}")



# Puedes usar el módulo os en Python para obtener la carpeta en la que se encuentra el script actual.
# En este ejemplo, os.path.dirname(__file__) obtiene el directorio del script actual y os.path.abspath() obtiene la ruta absoluta de ese directorio. 
# Finalmente, se imprime la carpeta en la que se encuentra el script.
#