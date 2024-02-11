# Escribe una función en Python longitud(L), que tome como parámetro una lista de enteros L y devuelva el número de elementos de dicha lista.

def longitud(L):
    return len(L)

# Ejemplo de uso con una lista más grande y diversa
lista_mixta = [1, 2, "tres", 4.5, [5, 6, 7], "ocho", True]
resultado = longitud(lista_mixta)
print("La longitud de la lista es:", resultado)


# En este ejemplo, la lista lista_mixta contiene una variedad de tipos de datos, incluidos enteros, cadenas, flotantes, listas y booleanos. 
# La función longitud se utiliza para determinar la longitud total de la lista, que es el número de elementos en ella. 
# El resultado se imprime en la consola. Puedes probar la función longitud con diferentes listas para obtener el número de elementos.