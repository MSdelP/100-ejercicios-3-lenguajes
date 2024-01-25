# Escribir un progrograma en python que solicite al usuario su edad y la almacena en una variable. 
# El programa debe verificar si el usuario tiene una edad mayor o menor a 18 años. 
# Si la edad del usuario es igual o mayor que 18 el programa imprime "Eres mayor de edad", de lo contrario debe imprimir "Eres menor de edad".


# Solicitar al usuario su edad
edad = int(input("Por favor, introduce tu edad: "))

# Verificar si el usuario es mayor o menor de 18 años
if edad >= 18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")
