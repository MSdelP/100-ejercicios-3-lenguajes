# Escribe una función en python minimo(L) que tome una lista de enteros L como parámetro y devuelva el valor más pequeño.


def minimo(L):
    if not L:
        # Manejar el caso de una lista vacía
        return None
    
    # Utilizar la función min para obtener el valor mínimo de la lista
    return min(L)

# Ejemplo de uso
lista_numeros = [10, 5, 8, 15, 3]
resultado = minimo(lista_numeros)
print(resultado)



# Esta función utiliza la función incorporada min de Python para encontrar el valor mínimo en la lista de enteros proporcionada.
# Si la lista está vacía, la función devuelve None. Puedes probar la función con diferentes listas de enteros para encontrar el valor mínimo.





