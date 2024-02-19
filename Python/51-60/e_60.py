# Escribe una función en Python contarVocales(v) que cuente las vocales de una frase que ingresa el usuario, 
# las desglose en pantalla y muestre la cantidad de vocales que hay de cada tipo.


def contarVocales(frase):
    # Inicializar un diccionario para contar las vocales
    conteo_vocales = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0}

    # Convertir la frase a minúsculas para hacer la comparación más fácil
    frase = frase.lower()

    # Iterar sobre cada letra en la frase
    for letra in frase:
        # Verificar si la letra es una vocal
        if letra in conteo_vocales:
            # Incrementar el contador correspondiente
            conteo_vocales[letra] += 1

    # Mostrar el desglose de vocales en pantalla
    print("Desglose de vocales:")
    for vocal, cantidad in conteo_vocales.items():
        print(f"{vocal}: {cantidad}")

# Pedir al usuario que ingrese una frase
frase_usuario = input("Ingresa una frase: ")

# Llamar a la función contarVocales con la frase proporcionada por el usuario
contarVocales(frase_usuario)


# Esta función contarVocales toma una frase como entrada y utiliza un diccionario para contar la cantidad de cada tipo de vocal en la frase. 
# Luego, muestra el desglose de las vocales y la cantidad de cada tipo en pantalla.