# Escribe en python el código de la función sumaSublista (L,i,j) que toma tres paárametros de una lista L,
# un índice de inicio de cálculo y un índice de fin de cálculoj. 
# La función debe devolver la suma de los números que se encuentran entre los índices de i y j de la lista.


def sumaSublista(L, i, j):
    # Verificar si los índices son válidos
    if i < 0 or j >= len(L) or i > j:
        return "Índices inválidos"

    # Calcular la suma de los elementos entre los índices i y j
    suma = sum(L[i:j+1])
    return suma

# Ejemplo de uso
lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
indice_inicio = 2
indice_fin = 6

resultado = sumaSublista(lista_numeros, indice_inicio, indice_fin)
print(resultado)


# En este ejemplo, la función sumaSublista utiliza la función sum de Python para calcular la suma de los elementos en la sublista que va desde el índice i hasta el índice j. 
# Se verifica que los índices sean válidos para evitar errores. 
# Puedes cambiar la lista lista_numeros y los índices de inicio y fin para probar la función con diferentes conjuntos de datos.





