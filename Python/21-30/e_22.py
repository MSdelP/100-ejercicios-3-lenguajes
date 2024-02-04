# Escribe un programa en python que permita truncar un número decimal a 2 cifras después de la coma.
# Por ejemplo, podemos usar el número decimal 342.9478274632


def truncar_decimal(numero, cifras_despues_coma):
    resultado = round(numero, cifras_despues_coma)
    return resultado

# Ejemplo de uso
numero_original = 342.9478274632
cifras_despues_coma = 2

numero_truncado = truncar_decimal(numero_original, cifras_despues_coma)

print(f'Número original: {numero_original}')
print(f'Número truncado a {cifras_despues_coma} cifras después de la coma: {numero_truncado}')


# Este programa define una función llamada truncar_decimal que toma un número y el número de cifras que quieres después de la coma. 
# Luego, utiliza la función round() para realizar el truncamiento y devuelve el resultado. 
# En el ejemplo de uso, se imprime el número original y el número truncado con 2 cifras después de la coma.