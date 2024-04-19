 # Escribe una función en Python leerFichero(rutaFichero) que toma como parámetro la ruta completa del fichero rutaFichero y devuelve su contenido. 
 # El contenido del fichero debe mostrarse por consola.
 # Nota: debe crearse un fichero de texto, con algo escrito en él para la prueba.


 def leerFichero(rutaFichero):
    try:
        with open(rutaFichero, 'r') as archivo:
            contenido = archivo.read()
            print("Contenido del archivo:")
            print(contenido)
    except FileNotFoundError:
        print("El archivo no existe.")
    except Exception as e:
        print("Ocurrió un error al leer el archivo:", e)

# Ruta del archivo a leer
rutaFichero = "ruta/completa/del/archivo.txt"  # Reemplaza con la ruta completa de tu archivo

# Llamada a la función para leer el archivo
leerFichero(rutaFichero)


# Antes de ejecutar el código, asegúrate de proporcionar la ruta completa del archivo que deseas leer en la variable rutaFichero. 
# Este código abrirá el archivo especificado en modo lectura ('r'), leerá su contenido, lo almacenará en la variable contenido y finalmente lo imprimirá por consola.
#  Si el archivo no existe, mostrará un mensaje de error.