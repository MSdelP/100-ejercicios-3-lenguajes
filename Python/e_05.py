# Crear una serie de instrucciones en python que permita crear una variable "var" y asignarle el valor "Hola". 
# El programa debe verificar si "var" es un entero o una cadena de caracteres. 
# Si es entero, el programa debe mostrar en consola "Entero", si no lo es debe mostrar "Cadena de caracteres".


# Crear la variable y asignarle el valor "Hola"
var = "Hola"

# Verificar el tipo de la variable
if isinstance(var, int):
    print("Entero")
else:
    print("Cadena de caracteres")
