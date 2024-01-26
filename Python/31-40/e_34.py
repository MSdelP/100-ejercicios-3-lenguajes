# Crea en python un bucle que contenga los números del 10 al 20, dentro de ese bucle crea otro que repita la misma lista 10 veces. Imprime el resultado.


# Bucle principal con los números del 10 al 20
for numero_principal in range(10, 21):
    # Lista del 10 al 20
    lista_numeros = list(range(10, 21))

    # Bucle interno que repite la lista 10 veces
    for _ in range(10):
        # Imprime la lista
        print(lista_numeros)

    # Imprime el número principal
    print(f"Número principal: {numero_principal}")
    print("=" * 20)  # Línea separadora


# Este código utiliza dos bucles, donde el bucle principal itera a través de los números del 10 al 20. Dentro de este bucle,
# hay otro bucle interno que repite la misma lista del 10 al 20 diez veces.
# La estructura de impresión proporciona una salida detallada con el número principal y la lista repetida, pero todo se imprime solo una vez.