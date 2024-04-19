# Escribe un función en Python numOcurrecias(rutaFichero, palabra) que tome como parámetros la ruta del fichero rutaFuchero y una palabra. 
# La función debe devolver el número de veces que la palabra a buscar por el usuario aparece en el fichero pasado como parámetro
# Nota: Para este ejercicio es aconsejable utilizar un fichero de texto para poder realizar la prueba pertinente

def numOcurrencias(rutaFichero, palabra):
    try:
        with open(rutaFichero, 'r') as archivo:
            contenido = archivo.read()
            # Utilizamos el método count() para contar las ocurrencias de la palabra
            num_ocurrencias = contenido.count(palabra)
        return num_ocurrencias
    except FileNotFoundError:
        print("El archivo especificado no fue encontrado.")
        return -1  # Retornamos -1 en caso de que el archivo no sea encontrado

# Ejemplo de uso
ruta = "ruta/del/archivo.txt"  # Reemplaza esto con la ruta de tu archivo
palabra_a_buscar = "palabra"
ocurrencias = numOcurrencias(ruta, palabra_a_buscar)
print(f"La palabra '{palabra_a_buscar}' aparece {ocurrencias} veces en el archivo.")


# Solo asegúrate de reemplazar "ruta/del/archivo.txt" con la ruta real de tu archivo y "palabra" con la palabra que deseas buscar. 
# Esta función abrirá el archivo especificado, leerá su contenido y contará el número de veces que aparece la palabra especificada.
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