# Transforma el código anterior y haz que sea una pirámide completa

def imprimir_piramide_completa(altura_piramide):
    for i in range(1, altura_piramide + 1):
        # Imprimir espacios en la parte superior izquierda de la pirámide
        espacios = ' ' * (altura_piramide - i)
        print(espacios, end='')

        # Imprimir asteriscos en la parte superior derecha de la pirámide
        asteriscos = '*' * (2 * i - 1)
        print(asteriscos)

# Ejemplo de uso con altura de pirámide 5
imprimir_piramide_completa(5)



# En este código, el bucle for se utiliza para iterar a través de las filas de la pirámide. 
# Se generan cadenas de espacios y asteriscos utilizando el operador de multiplicación (*) y se imprimen en la consola. 
# El parámetro end='' en la función print evita que se añada un salto de línea después de imprimir los espacios, 
# permitiendo que los asteriscos se impriman en la misma línea. 
# Puedes ajustar el valor pasado a la función imprimir_piramide_completa para cambiar la altura de la pirámide según tus necesidades. 
# El programa imprimirá la pirámide completa en la consola.