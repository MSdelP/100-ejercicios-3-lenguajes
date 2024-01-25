# Escribe un programa en python que permita formatear la cadena de caracteres "Me llamo miNombre y tengo edad años. Estoy aprendiendo el lenguaje Lenguaje".
# El programa debe permitir formatear esta cadena asignándole el contenido de las siguientes variables:
# miNombre = "Mario", edad = 37, Lenguaje = Python


# Variables
miNombre = "Mario"
edad = 37
Lenguaje = "Python"

# Cadena de formato
cadena_formato = "Me llamo {} y tengo {} años. Estoy aprendiendo el lenguaje {}."

# Formatear la cadena con las variables
cadena_formateada = cadena_formato.format(miNombre, edad, Lenguaje)

# Imprimir la cadena formateada
print(cadena_formateada)


# En este ejemplo, la cadena de formato contiene llaves {} en los lugares donde se insertarán los valores de las variables.
# Luego, utilizamos el método format() para insertar los valores de las variables en esos lugares, y finalmente, imprimimos la cadena formateada.