# Escribe en python un programa que muestre el siguiente esquema piramidal

# *
# **
# ****
# ******
# ********


altura_piramide = 5

for i in range(1, altura_piramide + 1):
    print('*' * (2 * i - 1))


# Este programa usa un bucle for que itera desde 1 hasta la altura de la pirámide (en este caso, 5). 
# En cada iteración, imprime una cadena de asteriscos (*) con longitud (2 * i - 1), creando así el patrón piramidal. 
# La longitud de la cadena de asteriscos aumenta de manera impares, lo que da la forma de una pirámide.
# Puedes ajustar la variable altura_piramide para cambiar la altura de la pirámide según tus necesidades. 
# El programa imprimirá el esquema piramidal en la consola.






